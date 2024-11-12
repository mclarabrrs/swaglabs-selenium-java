package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@wip",

        //tudo que é considerado para executar
        glue = {"steps"},

        //relatorios
        plugin = {"pretty","json:target/json-cucumber-reports/cucumber.json",
                "junit:target/xml-junit/junit.xml"},

        //cenarios de teste
        features = {"src/test/resources/features"})

public class Runner extends AbstractTestNGCucumberTests {

}

