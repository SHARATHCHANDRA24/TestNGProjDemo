package com.suite2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver d=null;
	@BeforeClass
	public void methodBeforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SeleniumJava\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
	}
  @Test
  public void login() {
	  d.findElement(By.id("nav-link-accountList")).click();
	  WebDriverWait wait=new WebDriverWait( d, 120);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
	  d.findElement(By.id("ap_email")).sendKeys("sharathin24@gmail.com");
	  d.findElement(By.id("continue")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
	  d.findElement(By.id("ap_password")).sendKeys("myshopping");
	  d.findElement(By.id("signInSubmit")).click();
  }
  @Test
  public void searchCornflakes() {
	  d.findElement(By.id("twotabsearchtextbox")).sendKeys("corn flakes",Keys.ENTER);
	  customWaitXpath(d, "//div[@data-component-type='s-search-result'][2]//a");
	  d.findElement(By.xpath("//div[@data-component-type='s-search-result'][2]//a")).click();
  }
  public Boolean customWaitXpath(WebDriver d,String xpathStr) {
	  try {
		  WebDriverWait wait=new WebDriverWait(d, 120);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathStr)));
		  Thread.sleep(1000);
		  return true;
	  }catch(Exception e) {
		  return false;
	  }
	  
  }
  
  @AfterClass
  public void methodAfterclass(){
	  d.close();
  }
}
