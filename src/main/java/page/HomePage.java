package page;

import attributes.HomeAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends HomeAttributes {
    //importou da construção do loginPage
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validarLoginSucesso(){
        String titulo = mensagemLoginSucesso.getText();
        Assert.assertEquals("Swag Labs", titulo);
    }

    public void fazerLogout(){
        menuHamburguer.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        botaoLogOut.click();
        driver.quit();
    }
}
