package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"features"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@web"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
