package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void moveHorizontalSlider(){
        var horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.moveSlider(4);
        assertEquals(horizontalSlider.getRange(),"4","Range is not 4");
    }
}
