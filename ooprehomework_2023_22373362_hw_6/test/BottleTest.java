import org.junit.Test;

import static org.junit.Assert.*;

public class BottleTest  {

    @Test
    public void testGetCapacity() {
        Bottle bottle = new Bottle(123,"dqr",40,80);
        int x = bottle.getCapacity();
        assertEquals(40,x);
    }
@Test
    public void testSubcapacity() {
         Bottle bottle = new Bottle(123,"dqr",40,100);
         bottle.subcapacity();
         int x = bottle.getCapacity();
        assertEquals(0,x);
    }
@Test
    public void testGetID() {
         Bottle bottle = new Bottle(123,"dqr",40,100);
         int x = bottle.getId();
        assertEquals(123,x);
    }
@Test
    public void testTestGetName() {
         Bottle bottle = new Bottle(123,"dqr",40,70);
        String x = bottle.getName();
        assertEquals("dqr",x);
    }
@Test
    public void testReset() {
         Bottle bottle = new Bottle(123,"dqr",40,20);
         bottle.reset(bottle);
         boolean x = bottle.getbecarried(bottle);
        assertFalse(x);
    }
@Test
    public void testSet() {
         Bottle bottle = new Bottle(123,"dqr",40,10);
         bottle.set(bottle);
         boolean x= bottle.getbecarried(bottle);
         assertTrue(x);
    }
@Test
    public void testGetbecarried() {
         Bottle bottle = new Bottle(123,"dqr",40,90);
         boolean x = bottle.getbecarried(bottle);
         assertFalse(x);
    }
}