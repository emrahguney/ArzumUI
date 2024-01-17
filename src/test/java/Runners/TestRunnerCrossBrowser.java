package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/AddToItem.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {

    @BeforeClass//(alwaysRun = true)->BeforeClass hatasi alirsan bunu ekle
    @Parameters("browserType")
    public void beforeClass(String browser){
        //browser tip su an elimde
        GWD.threadBrowserSet(browser);

    }
}


