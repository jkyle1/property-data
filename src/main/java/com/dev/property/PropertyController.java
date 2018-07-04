package com.dev.property;

import com.dev.property.domain.services.PropertyCalculationService;
import com.dev.property.model.Property;
import com.dev.property.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyCalculationService propertyCalculationService;
    private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyController(PropertyCalculationService propertyCalculationService, PropertyRepository propertyRepository) {
        this.propertyCalculationService = propertyCalculationService;
        this.propertyRepository = propertyRepository;
    }

    @RequestMapping("/list")
    public String propertiesList(Model model) {
        List<Property> properties = new ArrayList<>();
        properties.addAll(propertyRepository.findAll());

        model.addAttribute("properties", properties);

        return "property/list";
    }

    @RequestMapping(value = "/average", method = RequestMethod.GET, headers="Accept=application/json")
    public @ResponseBody String averagePrice(String postcodeOutward)
    {
        return propertyCalculationService.calculateAveragePrice(postcodeOutward);
    }

    @RequestMapping(value = "/difference", method = RequestMethod.GET, headers="Accept=application/json")
    public @ResponseBody String priceDifference(String propertyType1, String propertyType2)
    {
        return propertyCalculationService.calculatePriceDifference(propertyType1, propertyType2);
    }

    @RequestMapping(value = "/highest", method = RequestMethod.GET, headers="Accept=application/json")
    public @ResponseBody String[] highestPrice(byte percentageHighest)
    {
        return propertyCalculationService.calculateHighestPrice(percentageHighest);
    }
}
