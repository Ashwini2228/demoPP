package PageObjectCloth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;

	@FindBy(id = "login")
	WebElement login;
	
	@FindBy(id = "username")
	WebElement username;
}
