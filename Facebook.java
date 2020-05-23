package com.suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver d=null;
	String email="mngr259224",password="UqesemY";
	@BeforeClass
	public void methodBeforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("http://demo.guru99.com/V1/index.php");
		d.manage().window().maximize();
		
	}
  @Test(priority=0)
  public void login() {
	  d.findElement(By.name("uid")).sendKeys(email);
	  d.findElement(By.name("password")).sendKeys(password);
	  d.findElement(By.name("btnLogin")).click();
	  
  }
  
  
  @Test(priority=1)
  public void addNewCustomer() {
	  WebDriverWait wait=new WebDriverWait(d, 120);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Customer")));
	  d.findElement(By.linkText("New Customer")).click();
//	  WebDriverWait wait=new WebDriverWait(d, 120);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
	  d.findElement(By.name("name")).sendKeys("Sneha");
	  d.findElement(By.xpath("//input[@name='rad1'][2]")).click();
//	  JavascriptExecutor js=(JavascriptExecutor)d;
//	  js.executeScript("document.getElementByName('dob').text='12252000'");
  }
  @AfterClass
  public void methodAfterClass() {
	  d.close();
  }
  
}
