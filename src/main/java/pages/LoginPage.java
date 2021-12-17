package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[@class= 'radius']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String username){
        driver.findElement(userField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureArea clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }
}
