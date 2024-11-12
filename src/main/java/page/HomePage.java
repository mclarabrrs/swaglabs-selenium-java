package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //importou da construção do loginPage
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validarLoginSucesso(){
        String titulo = driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]")).getText();
        Assertions.assertEquals("Swag Labs", titulo);
    }

    public void fazerLogout(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.quit();
    }
}
