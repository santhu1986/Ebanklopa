package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\LopaWorkspace\\Ebanking\\src\\feature\\Role.feature",
                 glue="stepdefination",monochrome=true,
                 plugin= {"pretty","json:Target/Results/Role.json"})
public class Admlogin
{

}
