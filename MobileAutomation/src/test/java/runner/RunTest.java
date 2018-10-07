package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
                   (features={"src//test//java//Features"},
					glue={"StepDefinition","utility"},
					tags ={"@appium"},
                    format = {"pretty"},
                    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
                    monochrome = true)
		
@Test
public class RunTest extends AbstractTestNGCucumberTests{
}
