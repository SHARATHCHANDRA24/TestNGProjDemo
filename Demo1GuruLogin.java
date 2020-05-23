package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo1GuruLogin {
	WebDriver d;
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="password")
	WebElement passwd;
	@FindBy(name="btnLogin")
	WebElement logBtn;
	@FindBy(className="barone")
	WebElement logTitle;
	public Demo1GuruLogin(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	public void setUsername(String userID) {
		username.sendKeys(userID);
	}
	public void setPassword(String password) {
		passwd.sendKeys(password);
	}
	
	public void loginButtonClick() {
		logBtn.click();
	}
	
	public String testLoginTitle() {
		return logTitle.getText();
	}
	
	public void login(String userID,String passwd) {
		setUsername(userID);
		setPassword(passwd);
		loginButtonClick();
		
	}
}
