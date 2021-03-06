/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 04 14:09:18 GMT 2018
 */

package com.dev.property.domain.services;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PropertyCalculationService_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.dev.property.domain.services.PropertyCalculationService"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/home/kyle/Desktop/Dev/property"); 
    java.lang.System.setProperty("user.home", "/home/kyle"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kyle"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PropertyCalculationService_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.data.domain.ExampleMatcher$PropertySpecifier",
      "com.dev.property.repository.PropertyRepository",
      "com.dev.property.domain.interfaces.CalculationService",
      "org.springframework.data.repository.CrudRepository",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springframework.data.domain.Sort$Direction",
      "org.springframework.data.domain.ExampleMatcher$MatchMode",
      "org.springframework.data.domain.ExampleMatcher$PropertySpecifiers",
      "com.dev.property.model.Property",
      "org.springframework.stereotype.Service",
      "org.springframework.data.repository.Repository",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Pageable",
      "org.springframework.stereotype.Indexed",
      "org.springframework.data.domain.ExampleMatcher$GenericPropertyMatcher",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "org.springframework.data.domain.ExampleMatcher",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Example",
      "org.springframework.data.domain.Sort$Order",
      "org.springframework.data.domain.Slice",
      "org.springframework.data.domain.Sort$NullHandling",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.data.domain.ExampleMatcher$PropertyValueTransformer",
      "org.springframework.stereotype.Component",
      "org.springframework.data.domain.ExampleMatcher$MatcherConfigurer",
      "org.springframework.data.util.Streamable",
      "org.springframework.data.domain.ExampleMatcher$StringMatcher",
      "com.dev.property.model.Property$PropertyType",
      "com.dev.property.domain.services.PropertyCalculationService",
      "org.springframework.data.domain.ExampleMatcher$NullHandler",
      "org.springframework.data.jpa.repository.JpaRepository",
      "org.springframework.util.Assert"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.dev.property.model.Property", false, PropertyCalculationService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.dev.property.repository.PropertyRepository", false, PropertyCalculationService_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PropertyCalculationService_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.dev.property.domain.services.PropertyCalculationService",
      "com.dev.property.model.Property$PropertyType",
      "com.dev.property.model.Property"
    );
  }
}
