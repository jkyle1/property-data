package com.dev.property.domain.interfaces;

import com.dev.property.model.Property;

public interface CalculationService {
    String calculateAveragePrice(String postcodeOutward);

    String calculatePriceDifference(String propType1, String propType2);

    String[] calculateHighestPrice(byte percentageHighest);

    Property.PropertyType getPropertyTypeFromString(String propType);
}
