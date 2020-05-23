package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo2GuruHomePage {
	WebDriver d;
	@FindBy(xpath="//table//tr[@class='heading3']")
	WebElement mngrID;
	public Demo2GuruHomePage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	
	public String getMangerID() {
		return mngrID.getText();
	}
}
