package com.dev.property.domain.services;

import com.dev.property.domain.interfaces.CalculationService;
import com.dev.property.model.Property;
import com.dev.property.repository.PropertyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.dev.property.model.Property.PropertyType.*;

@Service
public class PropertyCalculationService implements CalculationService {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCalculationService.class);

    private PropertyRepository propertyRepository;

    @Autowired
    public PropertyCalculationService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public String calculateAveragePrice(String postcodeOutward) {
        try {
            List<Property> props = propertyRepository.findAll().stream().filter(h -> h.getPostcode().startsWith(postcodeOutward.toUpperCase())).collect(Collectors.toList());

            if (props == null || props.isEmpty()) {
                return "no properties found for this postcode outward";
            }

            BigDecimal avg = BigDecimal.valueOf(props.stream().mapToDouble(i -> i.getPrice().doubleValue()).average().orElse(0.00)).setScale(2);

            return avg.toString();
        } catch (Exception ex) {
            logger.error("PropertyService calculateAveragePrice Exception:  " + ex.toString());
        }
        return "";
    }

    @Override
    public String calculatePriceDifference(String propType1, String propType2) {
        try {
            Double avgPriceType1 = propertyRepository.findAll().stream().filter(i -> i.getType().equals(getPropertyTypeFromString(propType1))).collect(Collectors.toList()).stream().mapToDouble(j -> j.getPrice().doubleValue()).average().orElse(0.00);
            Double avgPriceType2 = propertyRepository.findAll().stream().filter(i -> i.getType().equals(getPropertyTypeFromString(propType2))).collect(Collectors.toList()).stream().mapToDouble(j -> j.getPrice().doubleValue()).average().orElse(0.00);

            BigDecimal diff = BigDecimal.valueOf(Math.round(avgPriceType1 > avgPriceType2 ? avgPriceType1 - avgPriceType2 : avgPriceType2 - avgPriceType1)).setScale(2);
            return diff.toString();

        } catch (Exception ex) {
            logger.error("PropertyService calculatePriceDifference Exception:  " + ex.toString());
        }
        return "";
    }

    @Override
    public String[] calculateHighestPrice(byte percentageHighest) {
        try {
            int size = propertyRepository.findAll().size();
            int propNums = (int) Math.ceil(((float) percentageHighest / 100) * size);
            List<Property> propList = propertyRepository.findAll().stream().sorted(Comparator.comparing(Property::getPrice).reversed()).collect(Collectors.toList());
            List<Property> highProps = propList.stream().limit(propNums).collect(Collectors.toList());
            int highest[] = highProps.stream().mapToInt(i -> i.getId().intValue()).toArray();
            return Arrays.stream(highest).sorted().mapToObj(String::valueOf).toArray(String[]::new);
        } catch (Exception ex) {
            logger.error("PropertyService determineHighCostProperties Exception:  " + ex.toString());
        }
        return null;
    }

    @Override
    public Property.PropertyType getPropertyTypeFromString(String propType)
    {
        try {
            switch (propType.toLowerCase()) {
                case "flats":
                    return Flat;
                case "detached houses":
                    return Detached;
                case "terraced houses":
                    return Terraced;
                case "mansions":
                    return Mansion;
            }
        }catch(Exception ex)
        {
            logger.error("PropertyService getPropertyTypeFromString Exception:  " + ex.toString());
        }
        return null;
    }
}
