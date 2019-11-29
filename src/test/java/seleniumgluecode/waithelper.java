package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithelper {
	
	    public WebDriver driver;

		public void setwait(WebElement webelement, long timeunit) {
		
			WebDriverWait wait= new WebDriverWait(driver, timeunit);
			wait.until(ExpectedConditions.invisibilityOf(webelement));
			
	}

}
