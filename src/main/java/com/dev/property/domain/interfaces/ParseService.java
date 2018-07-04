package com.dev.property.domain.interfaces;

import com.dev.property.model.Property;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;

public interface ParseService {

    ArrayList<Property> parse(MultipartFile file);

    Property mapToPropertyObject(String[] properties);

    BigDecimal parseToBigDecimal(String decimalString);

    File convertToFile(MultipartFile file) throws FileNotFoundException;
}
