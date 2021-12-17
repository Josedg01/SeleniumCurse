package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void retrievePassword(){

       var forgotPasswordPage= homePage.clickForgotPassword();
       forgotPasswordPage.setEmail("Pepe@gmail.com");
       forgotPasswordPage.clickRetrieveButton();
       //assertTrue.c()

    }
}
