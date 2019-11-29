package seleniumgluecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pagefactory.LoginPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps extends Base {
	
	

	@Before
	public void setup() throws IOException {

		loger = Logger.getLogger("FirstCucumberProject");
		PropertyConfigurator.configure("log4j.Properties");

		properties = new Properties();
		FileInputStream file = new FileInputStream(
				"config.properties");
		properties.load(file);

		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		
		loginpage=new LoginPageObjects(Driver);
		
//		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loger.info("Set Implicit global wait of 10secounds");

	}

	@Given("^Open Browser$")
	public void open_Browser() {
		Driver = new ChromeDriver();
		
	
	}

	@When("^User Provide url$")
	public void user_Provide_url()  {
		
		loger.info("**********Provide Url***********");
		loginpage.openurl();
		
		
	}

	@When("^User provide Userid as \"([^\"]*)\"  and Password as \"([^\"]*)\"$")
	public void user_provide_Userid_as_and_Password_as(String arg1, String arg2)  {
		
		loginpage.userid("yadavsandeep908");
	}

	@When("^User click login button$")
	public void user_click_login_button()  {
		loginpage.password("Sandeep@123");
	}

	@Then("^User should get title \"([^\"]*)\"$")
	public void user_should_get_title(String arg1) 
 {
		
		loginpage.submitButton();
	}

}