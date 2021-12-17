package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUpload extends BaseTests {

    @Test
    public void uploadFile(){
        var FileUploadPage = homePage.clickFileUploadPage();
        FileUploadPage.uploadFile("D:/Programming/selenium/webdriver_java/resources/chromedriver.exe");
    }
}
