package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTest extends BaseTests {

    @Test
    public void hoversOverFigure1(){

        var hoversPage = homePage.clickHovers();
        var caption =hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplay(),"Caption is not display");
        assertEquals(caption.getCaption(),"name: user1","Caption title is not correct");
        assertEquals(caption.getLinkText(),"View profile","Link text is not correct");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link is not correct");

    }
}
