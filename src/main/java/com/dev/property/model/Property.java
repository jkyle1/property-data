package com.dev.property.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter @Setter
@Entity
public class Property {

    public enum PropertyType {Flat, Terraced, Detached, Mansion}

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private BigInteger id;
    private Long reference;
    private String houseNumber;
    private String address;
    private String region;
    private String postcode;
    private PropertyType type;
    private BigDecimal price;
    private Integer bedrooms;
    private Integer bathrooms;


}