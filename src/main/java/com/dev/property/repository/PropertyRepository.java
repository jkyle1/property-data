package com.dev.property.repository;

import com.dev.property.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;


public interface PropertyRepository extends JpaRepository<Property, BigInteger> {

}
