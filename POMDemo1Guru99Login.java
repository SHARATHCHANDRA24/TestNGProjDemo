package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMDemo1Guru99Login {
	WebDriver d;
	By username= By.name("uid");
	By passwd=By.name("password");
	By logBtn=By.name("btnLogin");
	By logTitle=By.className("barone");
	
	public POMDemo1Guru99Login(WebDriver d) {
		this.d=d;
	}
	
	public void setUserName(String user) {
		d.findElement(username).sendKeys(user);
		
	}
	public void setPasswd(String password) {
		d.findElement(passwd).sendKeys(password);
	}
	
	public void clickLogin() {
		d.findElement(logBtn).click();
	}
	
	public String getLogTitile() {
		return d.findElement(logTitle).getText();
	}
	
	
	public void methodForLogin(String user, String passwd) {
		this.setUserName(user);
		this.setPasswd(passwd);
		this.clickLogin();
	}
}
