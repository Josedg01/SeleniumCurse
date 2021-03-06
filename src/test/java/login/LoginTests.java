package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureArea secureArea = loginPage.clickLoginButton();
        assertTrue(secureArea.getAlertText()
                .contains("You logged into a secure area!")
                ,"You did not log into a secure area!");
    }
}
