package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputfield = By.id("target");
    private By inputText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void setInputField(String input){
        driver.findElement(inputfield).sendKeys(input);
    }

    public void enterPi(){
        setInputField(Keys.chord(Keys.ALT,"2") + "= 3.1416");
    }

    public String getResultText(){
        return driver.findElement(inputText).getText();
    }
}
