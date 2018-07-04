/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 04 13:26:32 GMT 2018
 */

package com.dev.property;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PropertyDataApplication_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.dev.property.PropertyDataApplication"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PropertyDataApplication_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.beans.factory.HierarchicalBeanFactory",
      "org.springframework.core.env.CommandLinePropertySource",
      "org.springframework.core.env.PropertySource",
      "org.springframework.boot.ApplicationArguments",
      "org.springframework.core.env.ConfigurablePropertyResolver",
      "org.springframework.beans.factory.Aware",
      "org.springframework.core.env.EnumerablePropertySource",
      "org.springframework.context.annotation.ComponentScan$Filter",
      "org.springframework.beans.factory.InitializingBean",
      "org.springframework.core.env.SimpleCommandLinePropertySource",
      "org.springframework.boot.SpringApplication",
      "com.dev.property.domain.interfaces.UploadService",
      "org.springframework.data.repository.core.support.RepositoryFactoryInformation",
      "org.springframework.core.env.ConfigurableEnvironment",
      "org.springframework.beans.factory.FactoryBean",
      "org.springframework.core.env.PropertyResolver",
      "org.springframework.beans.factory.BeanFactoryAware",
      "org.springframework.core.env.EnvironmentCapable",
      "org.springframework.context.ApplicationEventPublisher",
      "org.springframework.boot.CommandLineRunner",
      "org.springframework.context.MessageSource",
      "org.springframework.context.ApplicationEventPublisherAware",
      "org.springframework.boot.autoconfigure.SpringBootApplication",
      "org.springframework.core.io.ResourceLoader",
      "org.springframework.boot.autoconfigure.EnableAutoConfiguration",
      "org.springframework.boot.ExitCodeEvent",
      "org.springframework.data.repository.query.QueryLookupStrategy$Key",
      "org.springframework.context.annotation.Import",
      "org.springframework.data.repository.config.DefaultRepositoryBaseClass",
      "org.springframework.context.ApplicationContext",
      "org.springframework.context.annotation.ComponentScan",
      "org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport",
      "org.springframework.context.ApplicationEvent",
      "org.springframework.core.env.CompositePropertySource",
      "org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean",
      "org.springframework.boot.SpringBootConfiguration",
      "org.springframework.core.env.Environment",
      "org.springframework.core.env.MapPropertySource",
      "org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport",
      "org.springframework.beans.factory.BeanFactory",
      "com.dev.property.PropertyDataApplication",
      "org.springframework.core.io.support.ResourcePatternResolver",
      "org.springframework.beans.factory.BeanClassLoaderAware",
      "org.springframework.data.jpa.repository.config.EnableJpaRepositories",
      "org.springframework.beans.factory.ListableBeanFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PropertyDataApplication_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.dev.property.PropertyDataApplication",
      "org.springframework.data.repository.query.QueryLookupStrategy$Key",
      "org.springframework.beans.factory.annotation.Autowire",
      "org.springframework.boot.SpringApplication",
      "com.dev.property.upload.UploadProperties",
      "com.dev.property.domain.services.FileSystemUploadService",
      "org.apache.commons.fileupload.disk.DiskFileItem",
      "org.springframework.web.multipart.commons.CommonsMultipartFile",
      "org.springframework.util.FileSystemUtils",
      "org.springframework.util.FileSystemUtils$1",
      "org.springframework.core.io.AbstractResource",
      "org.springframework.core.io.AbstractFileResolvingResource",
      "org.springframework.core.io.UrlResource",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils",
      "org.springframework.util.CollectionUtils",
      "org.springframework.util.ResourceUtils",
      "com.dev.property.upload.UploadException",
      "com.dev.property.upload.UploadFileNotFoundException"
    );
  }
}
