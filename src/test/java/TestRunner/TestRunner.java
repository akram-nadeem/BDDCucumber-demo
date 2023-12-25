package TestRunner;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C://Users//MAVIA BAWANI//IdeaProjects//BDDFramework//src//test//Features",
        glue = "StepsDefinition")


public class TestRunner {
}
