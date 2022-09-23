package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:\\Users\\JasdeepKaur\\Desktop\\FrameWork\\Selenium0945\\Friday23\\src\\test\\java\\FeatureFile\\Login.feature"},
                monochrome = true,
                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                       "html:Report/cucumberReport"}

        )

public class TestRunner {

}
