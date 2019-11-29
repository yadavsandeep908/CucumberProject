package seleniumgluecode;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import Pagefactory.LoginPageObjects;

public class Base {
	
	public static WebDriver Driver;
	public static teststeps steps;
	public static waithelper setwait;
	public static Logger loger;
	public static LoginPageObjects pageobject;
	public Properties properties;
	public LoginPageObjects loginpage;
	
	
	@Before
	public void initbrowder() {
		
		
		
		
	}
	
}
