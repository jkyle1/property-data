/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 04 14:09:18 GMT 2018
 */

package com.dev.property.domain.services;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.dev.property.domain.services.PropertyCalculationService;
import com.dev.property.model.Property;
import com.dev.property.repository.PropertyRepository;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyCalculationService_ESTest extends PropertyCalculationService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      Property property0 = mock(Property.class, new ViolatedAssumptionAnswer());
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      linkedList0.add(property0);
      String[] stringArray0 = propertyCalculationService0.calculateHighestPrice((byte) (-63));
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      propertyCalculationService0.getPropertyTypeFromString((String) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService((PropertyRepository) null);
      String string0 = propertyCalculationService0.calculatePriceDifference((String) null, "!&Z60l\"(PAp@;^K8v");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService((PropertyRepository) null);
      String[] stringArray0 = propertyCalculationService0.calculateHighestPrice((byte)68);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      Property property0 = mock(Property.class, new ViolatedAssumptionAnswer());
      doReturn(bigInteger0).when(property0).getId();
      linkedList0.add(property0);
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      String[] stringArray0 = propertyCalculationService0.calculateHighestPrice((byte)81);
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService((PropertyRepository) null);
      String string0 = propertyCalculationService0.calculateAveragePrice("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      Property.PropertyType property_PropertyType0 = propertyCalculationService0.getPropertyTypeFromString("flats");
      assertEquals(Property.PropertyType.Flat, property_PropertyType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      Property.PropertyType property_PropertyType0 = propertyCalculationService0.getPropertyTypeFromString("detached houses");
      assertEquals(Property.PropertyType.Detached, property_PropertyType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      propertyCalculationService0.getPropertyTypeFromString("0.00");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService((PropertyRepository) null);
      Property.PropertyType property_PropertyType0 = propertyCalculationService0.getPropertyTypeFromString("mansions");
      assertEquals(Property.PropertyType.Mansion, property_PropertyType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      String string0 = propertyCalculationService0.calculatePriceDifference("terraced houses", "terraced houses");
      assertEquals("0.00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      BigDecimal bigDecimal0 = new BigDecimal((long) (byte) (-65));
      Property property0 = mock(Property.class, new ViolatedAssumptionAnswer());
      doReturn("flats").when(property0).getPostcode();
      doReturn(bigDecimal0).when(property0).getPrice();
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      linkedList0.add(property0);
      String string0 = propertyCalculationService0.calculateAveragePrice("");
      assertEquals("-65.00", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      String string0 = propertyCalculationService0.calculateAveragePrice("");
      assertEquals("no properties found for this postcode outward", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0).when(propertyRepository0).findAll();
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      String[] stringArray0 = propertyCalculationService0.calculateHighestPrice((byte) (-65));
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PropertyRepository propertyRepository0 = mock(PropertyRepository.class, new ViolatedAssumptionAnswer());
      PropertyCalculationService propertyCalculationService0 = new PropertyCalculationService(propertyRepository0);
      Property.PropertyType property_PropertyType0 = propertyCalculationService0.getPropertyTypeFromString("terraced houses");
      assertEquals(Property.PropertyType.Terraced, property_PropertyType0);
  }
}
