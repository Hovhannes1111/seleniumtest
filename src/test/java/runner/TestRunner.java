package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Karthik on 10/26/2016.
 */

@CucumberOptions(features = {"src/test/java/features"} ,
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
