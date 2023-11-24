import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest  {

    @Test
    public void testGetFoodid() {
        Food food = new Food(1,"dqr",50);
        int id = food.getFoodid(food);
        assertEquals(1,1);
    }
@Test
    public void testGetFoodname() {
        Food food = new Food(1,"dqr",50);
        String name = food.getFoodname(food);
        assertEquals(name,"dqr");
    }
@Test
    public void testGetEnergy() {
        Food food = new Food(1,"dqr",50);
        int energy = food.getEnergy(food);
        assertEquals(energy,50);
    }
@Test
    public void testReset() {
        Food food = new Food(1,"dqr",50);
        food.reset(food);
        boolean x = food.getBecarried(food);
        assertFalse(x);
    }
@Test
    public void testSet() {
        Food food = new Food(1,"dqr",50);
        food.set(food);
        boolean x = food.getBecarried(food);
        assertTrue(x);
    }
@Test
    public void testGetBecarried() {
        Food food = new Food(1,"dqr",50);
        boolean x = food.getBecarried(food);
        assertFalse(x);
    }
}