package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTest extends BaseTests {

    @Test
    public void clickAlerts(){
        var alerts = homePage.clickJavaScriptAlerts();
        alerts.clickJsAlert();
        alerts.clickOkButtonAlert();
        assertEquals(alerts.getResultText(),"You successfully clicked an alert","Something went wrong");

    }

    @Test
    public void getTextFromAlerts(){
        var alerts = homePage.clickJavaScriptAlerts();
        alerts.clickJsConfirm();
        String alertText = alerts.getAlertText();
        assertEquals(alertText,"I am a JS Confirm", "Something went wrong");
        alerts.clickOnCancelButtonAlert();
        assertEquals(alerts.getResultText(),"You clicked: Cancel","Something went wrong");
    }

    @Test
    public  void setTextOnAlert(){
        var alerts = homePage.clickJavaScriptAlerts();
        alerts.clickJsPrompt();
        String text = "José Rocks";
        alerts.setPromptText(text);
        alerts.clickOkButtonAlert();
        assertEquals(alerts.getResultText(),"You entered: " + text,"Something went wrong");
    }

}
