package comTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DemoA {
  
  WebDriver d=null;
  @Test
  public void methodDemo() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");
	d =new ChromeDriver();
	  Reporter.log("The browser is opened now");
	  d.manage().window().maximize();
	  Reporter.log("browser is maximised");
	  d.get("https://www.google.com/");
	  Reporter.log("google url is opened");
	  d.findElement(By.name("q")).sendKeys("Selena Gomez",Keys.ENTER);
	  Reporter.log("searched for selena gomez");
  }
  
  @AfterClass
  public void methodAfterClass() {
	  d.close();
	  Reporter.log("driver is closed");
  }
}
