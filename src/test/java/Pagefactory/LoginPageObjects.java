package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObjects {

	public static WebDriver rdriver;

	public LoginPageObjects(WebDriver Ldriver) {

		rdriver = Ldriver;
		PageFactory.initElements(rdriver, this);

	}
//
//	By popup = By.xpath("//*[@id='modal-close']");
//	By bankingoption = By.xpath("//*[@class='pl-login-box']");
	
	By userid = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='pass']");
	By submitButton = By.xpath("//*[@id='u_0_b']");

	// By CorporateOption = By.xpath("//*[@class='CorporateBanking']");

	public void popupp() {
		/*
		 * rdriver.switchTo().alert().dismiss(); 
		 * rdriver.findElement(popup);
		 */	}

	public void openurl() {

		/*
		 * Actions action=new Actions(rdriver); action.moveToElement((WebElement)
		 * bankingoption).build().perform(); Thread.sleep(3000);
		 * rdriver.findElement(CorporateOption).click();
		 */
		
		rdriver.get("https://facebook.com");
		
		
		
	}

	public void userid(String username) {

		rdriver.findElement(userid).clear();
		rdriver.findElement(userid).sendKeys(username);
		
	}

	public void password(String password1) {


		rdriver.findElement(password).clear();
		rdriver.findElement(password).sendKeys(password1);
		
	}

	public void submitButton() {

		rdriver.findElement(submitButton).click();
		
	}

}
