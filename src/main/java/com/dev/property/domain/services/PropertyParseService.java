package com.dev.property.domain.services;

import com.dev.property.domain.interfaces.ParseService;
import com.dev.property.model.Property;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.stream.Stream;

@Service
public class PropertyParseService implements ParseService {

    private static final Logger logger = Logger.getLogger(ParseService.class);

    @Override
    public ArrayList<Property> parse(MultipartFile file) {

        String line;
        try{
                if(file != null)
                {
                    ArrayList<Property> propertyList = new ArrayList<>();

                    BufferedReader reader = new BufferedReader(new FileReader(convertToFile(file)));
                    int lineNo = 0;
                    while ((line = reader.readLine()) != null) {
                        if(lineNo != 0)
                        {
                            String[] properties = line.split(",");
                            propertyList.add(mapToPropertyObject(properties));
                        }
                        lineNo++;
                    }

                    return propertyList;
                }

        }catch(Exception ex)
        {
            logger.error("Error in PropertyParseService - parse:  " + ex.toString());
        }
        return null;
    }

    @Override
    public Property mapToPropertyObject(String[] properties)
    {
        StringBuffer buff = new StringBuffer("");
        try {
            Property property = new Property();
            property.setReference(properties[0].contentEquals(buff) ? null : Long.valueOf(properties[0]));
            property.setPrice(properties[1].contentEquals(buff) ? null : new BigDecimal(properties[1]));
            property.setBedrooms(properties[2].contentEquals(buff) ? null : Integer.valueOf(properties[2]));
            property.setBathrooms(properties[3].contentEquals(buff) ? null : Integer.valueOf(properties[3]));
            property.setHouseNumber(properties[4]);
            property.setAddress(properties[5]);
            property.setRegion(properties[6]);
            property.setPostcode(properties[7]);
            property.setType(properties[8] == "" ? null : Stream.of(Property.PropertyType.values())
                    .filter(e -> e.toString().equals(properties[8]))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException(String.format("Unsupported PropertyType enum %s.", properties[8]))));
        return property;
        }
        catch(Exception ex)
        {
            logger.error("Error in PropertyParseService - mapToPropertyObject:  " + ex.toString());
        }
        return null;
    }

    @Override
    public BigDecimal parseToBigDecimal(String decimalString)
    {
        try{
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setGroupingSeparator(',');
            symbols.setDecimalSeparator('.');
            String pattern = "#,##0.0#";
            DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
            decimalFormat.setParseBigDecimal(true);
            return (BigDecimal) decimalFormat.parse(decimalString);

        }catch(Exception ex)
        {
            logger.error("Error in PropertyParseService - parseToBigDecimal:  " + ex.toString());
        }
        return null;
    }

    @Override
    public File convertToFile(MultipartFile file) {
     try {
         File convFile = new File(file.getOriginalFilename());
         convFile.createNewFile();
         FileOutputStream fos = new FileOutputStream(convFile);
         fos.write(file.getBytes());
         fos.close();
         return convFile;
     }
     catch(Exception ex)
     {
         logger.error("Error in PropertyParseService - convertToFile:  " + ex.toString());
     }
     return null;
    }
}
