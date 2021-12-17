package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.net.PortUnreachableException;

import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTests {

    @Test
    public void enterKeyTest(){
        var keyPressesPage = homePage.clickKeyPresses();
        //keyPressesPage.setInputField("A" + Keys.BACK_SPACE);
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE", "Something went wrong");
    }

    @Test
    public void enterPiTest(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
    }
}
