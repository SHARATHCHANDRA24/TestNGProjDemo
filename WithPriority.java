package comTestng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WithPriority {
	WebDriver drv;
	 @Test(priority=0)
	  public void openBrowser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");
		  drv=new ChromeDriver();
		  
	  }
	 @Test(priority=1)
	 public void launchGoogle()  {
		  drv.get("https://www.google.com/");
		  
	 }
	 @Test(priority=2)
	 public void performSearchAndClick1stLink() {
		  drv.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook", Keys.ENTER);
		  drv.findElement(By.xpath("//a[@href='https://www.facebook.com/']")).click();
		  /*
		   * //a[@href='https://www.facebook.com/']
		   */
	 }
	 
	 @Test(priority=3)
	 public void FaceBookPageTitleVerification() {
		  assertTrue(drv.getTitle().equals("Aetna - Home | Facebook"), "condition failed");
		  System.out.println("condition Passed");
	 }
	 
	 @AfterTest
	 public void afterTestMethod() {
		  drv.quit();
	 }
}
