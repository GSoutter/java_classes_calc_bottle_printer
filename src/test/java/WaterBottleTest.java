import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void getVolume(){
        assertEquals(100, bottle.getVolume(), 0.1);
    }

    @Test
    public void canDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume(), 0.1);
    }


    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume(), 0.1);
    }


}
