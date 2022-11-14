package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features/login.feature",glue={"Stepdefinition"},
monochrome=true,
plugin= {"pretty","html:target/Htmlreports"}

		)


public class Runner {

}
