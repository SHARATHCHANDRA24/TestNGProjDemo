package comTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
  @Test
  public void f() {
	  System.out.println("inside test");
  }
  
  @Test
  public void f1() {
	  System.out.println("inside test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside after method");
  }
  @AfterClass
  public void aaterMethod() {
	  System.out.println("inside aater Classmethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("inside after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside after suite");
  }

}
