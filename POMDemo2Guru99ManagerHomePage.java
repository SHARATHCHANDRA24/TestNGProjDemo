package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMDemo2Guru99ManagerHomePage {
	WebDriver d;
	By managerID=By.xpath("//td[@style='color: green']");
	
	public POMDemo2Guru99ManagerHomePage(WebDriver d) {
		this.d=d;
	}
	
	public String getManagerID() {
		return d.findElement(managerID).getText();
	}
}
