package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@wip",

        //tudo que é considerado para executar
        glue = {"steps"},

        //relatorios
        plugin = {"pretty","json:target/json-cucumber-reports/cucumber.json",
                "junit:target/xml-junit/junit.xml"},

        //cenarios de teste
        features = {"src/test/resources/features"})

public class Runner{}

