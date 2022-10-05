package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/",glue= {"stepDefination_Sept"},
plugin={"pretty",
		"json:target/MyReports/report.json",
		//"json:target/MyReports/report.xml",
		"json:target/MyReports/report.html"},
	monochrome=true,
	dryRun=false,
	tags= "@ICICI or @HDFC"
	
		
		)
public class TestRunner {

}
