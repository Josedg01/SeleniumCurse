package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputFile = By.xpath("//input[@id='file-upload']");
    private By uploadButton = By.xpath("//input[@id='file-submit']");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputFile).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

}
