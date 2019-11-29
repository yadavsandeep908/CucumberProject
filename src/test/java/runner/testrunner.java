package runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.bytebuddy.utility.RandomString;

import com.cucumber.listener.ExtentCucumberFormatter;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =".//src/test/java/Feature/test1.feature",
        glue= "seleniumgluecode",
        dryRun=false,
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )

public class testrunner {
    @AfterClass
    public static void writeExtentReport() {
		/* Reporter.loadXMLConfig(new File("config/report.xml")) */;
    
    }
}