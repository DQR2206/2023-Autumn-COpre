import org.junit.Test;

import static org.junit.Assert.*;

public class BottleTest  {

    @Test
    public void testGetCapacity() {
        Bottle bottle = new Bottle(123,"dqr",40);
        int x = bottle.getCapacity(bottle);
        assertEquals(40,x);
    }
@Test
    public void testSubcapacity() {
         Bottle bottle = new Bottle(123,"dqr",40);
         bottle.subcapacity(bottle);
         int x = bottle.getCapacity(bottle);
        assertEquals(0,x);
    }
@Test
    public void testGetID() {
         Bottle bottle = new Bottle(123,"dqr",40);
         int x = bottle.getID(bottle);
        assertEquals(123,x);
    }
@Test
    public void testTestGetName() {
         Bottle bottle = new Bottle(123,"dqr",40);
        String x = bottle.getName(bottle);
        assertEquals("dqr",x);
    }
@Test
    public void testReset() {
         Bottle bottle = new Bottle(123,"dqr",40);
         bottle.reset(bottle);
         boolean x = bottle.getbecarried(bottle);
        assertFalse(x);
    }
@Test
    public void testSet() {
         Bottle bottle = new Bottle(123,"dqr",40);
         bottle.set(bottle);
         boolean x= bottle.getbecarried(bottle);
         assertTrue(x);
    }
@Test
    public void testGetbecarried() {
         Bottle bottle = new Bottle(123,"dqr",40);
         boolean x = bottle.getbecarried(bottle);
         assertFalse(x);
    }
}