package com.dev.property;

import com.dev.property.domain.interfaces.ParseService;
import com.dev.property.domain.interfaces.UploadService;
import com.dev.property.model.Property;
import com.dev.property.repository.PropertyRepository;
import com.dev.property.upload.UploadFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
public class UploadController {

    private final UploadService uploadService;
    private final ParseService parseService;

    private final PropertyRepository propertyRepository;

    @Autowired
    public UploadController(UploadService uploadService, ParseService parseService, PropertyRepository propertyRepository) {
        this.uploadService = uploadService;
        this.parseService = parseService;
        this.propertyRepository = propertyRepository;
    }

    @GetMapping("/")
    public String listUploadedFiles(Model model) throws IOException {

        model.addAttribute("files", uploadService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(UploadController.class,
                        "serveFile", path.getFileName().toString()).build().toString())
                .collect(Collectors.toList()));
        return "upload/view";
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

        Resource file = uploadService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        uploadService.store(file);
        ArrayList<Property> properties = parseService.parse(file);
        for(Property prop : properties) {
            propertyRepository.save(prop);
        }

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/properties/list";
    }

    @ExceptionHandler(UploadFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(UploadFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }

}