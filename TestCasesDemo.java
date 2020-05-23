package comTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(comTestng.ListenerTest.class)

public class TestCasesDemo {
	WebDriver d;
	@BeforeClass
	public void beforeClassMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");
		
	}
  @Test
  public void method1() {
	  d=new ChromeDriver();
	  d.get("http://demo.guru99.com/V4/");
	  d.findElement(By.name("uid")).sendKeys("mngr259224");							
	    d.findElement(By.name("password")).sendKeys("UqesemY");							
	    d.findElement(By.name("")).click();//btnLogin
	    
  }
  
  @Test
  public void method2() {
	  System.out.println("this method is for failing test case");
	  Assert.assertTrue(false);
  }
  @AfterClass
  public void afterClassMethod() {
	  d.close();
  }
}
