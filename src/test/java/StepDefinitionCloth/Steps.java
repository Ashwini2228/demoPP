package StepDefinitionCloth;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	
	@Given("User launch chromebrowser")
	public void user_launch_chromebrowser() {
		   System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver-97") ;
		   driver =new ChromeDriver();
	}

	@When("User opens {string}")
	public void user_opens(String string) {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("User enters a email address as {string} and password as {string}")
	public void user_enters_a_email_address_as_and_password_as(String string, String string2) {
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DumDummy77@gmail.com");
	 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Dum7Dum77");
	}


	@When("click on login")
	public void click_on_login() {
	    driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

	@Then("Page title will be {string}")
	public void page_title_will_be(String string) {
		driver.findElement(By.xpath("//div[@id='center_column']/h1"));
	}

	@When("User click on Sign out link")
	public void user_click_on_sign_out_link() {
		driver.findElement(By.xpath("//div[@class='header_user_info'][2]")).click();
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) throws Exception {
		driver.findElement(By.xpath("//img[@alt='My Store']"));
		Thread.sleep(3000);
	}
         
 
	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	}



}
