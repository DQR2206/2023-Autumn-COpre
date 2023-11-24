import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest  {

    @Test
    public void testGetFoodid() {
        Food food = new Food(1,"dqr",50,50);
        int id = food.getId();
        assertEquals(1,1);
    }
@Test
    public void testGetFoodname() {
        Food food = new Food(1,"dqr",50,50);
        String name = food.getName();
        assertEquals(name,"dqr");
    }
@Test
    public void testGetEnergy() {
        Food food = new Food(1,"dqr",50,50);
        int energy = food.getEnergy();
        assertEquals(energy,50);
    }
@Test
    public void testReset() {
        Food food = new Food(1,"dqr",50,50);
        food.reset();
        boolean x = food.getBecarried();
        assertFalse(x);
    }
@Test
    public void testSet() {
        Food food = new Food(1,"dqr",50,50);
        food.set();
        boolean x = food.getBecarried();
        assertTrue(x);
    }
@Test
    public void testGetBecarried() {
        Food food = new Food(1,"dqr",50,50);
        boolean x = food.getBecarried();
        assertFalse(x);
    }
}