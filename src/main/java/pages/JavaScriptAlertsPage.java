package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By jsAlert = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By result = By.id("result");
    private By jsConfirm = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By jsPrompt = By.xpath("//button[contains(text(),'Click for JS Prompt')]");


    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJsAlert(){
        driver.findElement(jsAlert).click();
    }

    public void clickJsConfirm(){
        driver.findElement(jsConfirm).click();
    }

    public void clickJsPrompt(){
        driver.findElement(jsPrompt).click();
    }

    public void clickOkButtonAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickOnCancelButtonAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }
}
