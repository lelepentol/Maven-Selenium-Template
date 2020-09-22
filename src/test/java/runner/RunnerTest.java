package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = {"src/test/resources/feature/OpenWeb.feature"},
//				features = {"src/test/resources/feature/Login.feature"},
//		tags = {"@tag1"},
		glue = {"stepDef"},
//		plugin = {"json:target/cucumber-reports/Login.json"}	
		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber-reports/report.json"}
//		plugin = {"json:target/cucumber-reports/OTP.json"}
//		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber-reports/Registration.json"}
		)
public class RunnerTest {
	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		System.out.println("Cucumber Test Class Before");
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	
	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}
	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass(){
		testNGCucumberRunner.finish();
		
	}
}
