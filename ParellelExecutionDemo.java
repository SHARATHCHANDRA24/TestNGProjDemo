package comTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelExecutionDemo {
//	WebDriver drv=null;
  @Test
  public void executSessionOne() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");  
	WebDriver drv=new ChromeDriver();
	drv.get("http://demo.guru99.com/V4/");
	drv.findElement( By.name("uid")).sendKeys("driver1");
  }
  
  
  @Test
  public void executSessionTwo() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");  
	WebDriver drv=new ChromeDriver();
	drv.get("http://demo.guru99.com/V4/");
	drv.findElement( By.name("uid")).sendKeys("driver2");
  }
  

  @Test
  public void executSessionThree() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");  
	WebDriver drv=new ChromeDriver();
	drv.get("http://demo.guru99.com/V4/");
	drv.findElement( By.name("uid")).sendKeys("driver3");
  }
}
