package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//input[@type= 'range']");
    private By rangeNumber = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(double range){

        double range1 = range * 2;

        for(int i=1 ; i <= range1; i++){
            driver.findElement(slider).sendKeys(Keys.chord(Keys.ARROW_RIGHT));
        }



     /*  double range1 = range * 2;
        double count = 0;
        boolean present = true;
        while(present){
            driver.findElement(slider).sendKeys(Keys.chord(Keys.ARROW_RIGHT));
            count++;

            if(count == range1){
                break;
            }
        }*/
    }

    public String getRange(){
       return driver.findElement(rangeNumber).getText();
    }
}
