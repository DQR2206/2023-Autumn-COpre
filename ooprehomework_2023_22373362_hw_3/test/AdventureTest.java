import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class AdventureTest {

    @Test
    public void testAddBottle() {
        Bottle bottle = new Bottle(12,"dqr",30);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        int x= man.getBotNum(man);
        assertEquals(1,x);
    }

    @Test
    public void testGetBottle() {
        Bottle bottle = new Bottle(12,"dqr",30);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        Bottle bottle1 = man.getBottle(12);
        assertEquals(bottle1.getID(bottle),bottle.getID(bottle));
    }

    @Test
    public void testUsebottle() {
        Bottle bottle = new Bottle(12,"dqr",30);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        bottle.set(bottle);
        String name = bottle.getName(bottle);
        man.usebottle(man,name);
        int x = man.gethitpoint(man);
        int y = bottle.getCapacity(bottle);
        assertEquals(530,x);
        assertEquals(0,y);
        Bottle bottle1 = new Bottle(13,"dqr",0);
        man.addBottle(bottle1);
        bottle1.set(bottle);
        String name1 = bottle1.getName(bottle1);
        man.usebottle(man,name1);
        y = bottle1.getCapacity(bottle1);
        assertEquals(530,x);
        assertEquals(0,y);
    }

    @Test
    public void testGetBotNum() {
        Bottle bottle = new Bottle(12,"dqr",30);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        int x =man.getBotNum(man);
        assertEquals(1,x);

    }
@Test
    public void testRemoveBottle() {
        Bottle bottle = new Bottle(12,"dqr",30);
        Bottle bottle1 = new Bottle(13,"fyq",20);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        man.addBottle(bottle1);
        man.removeBottle(bottle);
        int x =man.getBotNum(man);
        assertEquals(1,x);
    }
@Test
    public void testAddEquipment() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment = new Equipment(15,"dqr",4);
        man.addEquipment(equipment);
        int x = man.getEquipmentNumber(man);
        assertEquals(1,x);
    }
@Test
    public void testRemoveEquipment() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment = new Equipment(15,"dqr",4);
        man.addEquipment(equipment);
        man.removeEquipment(equipment);
        int x = man.getEquipmentNumber(man);
        assertEquals(0,x);
    }
@Test
    public void testAddEquStar() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment = new Equipment(15,"dqr",4);
        man.addEquStar(equipment);
        int x = equipment.getStar();
        assertEquals(5,x);
    }
@Test
    public void testGetEquipment() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment1 = man.getEquipment(156);
        assertNull(equipment1);
        Equipment equipment = new Equipment(14,"gh",3);
        man.addEquipment(equipment);
        equipment1 = man.getEquipment(14);
        assertNotNull(equipment1);
    }
@Test
    public void testGetEquipmentNumber() {
    }
@Test
    public void testReturnequ() {
        Adventure man = new Adventure(12,"dqr");
        ArrayList<Equipment> equipments = man.returnequ(man);
        int x = equipments.size();
        assertEquals(0,x);
    }
@Test
    public void testAddfood() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30);
        man.addfood(13,food);
        int x = man.getFoodsize(man);
        assertEquals(1,x);
    }
@Test
    public void testGetFood() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30);
        man.addfood(13,food);
        Food food1 = man.getFood(13);
        assertEquals(food,food1);
    }
@Test
    public void testGetFoodsize() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30);
        man.addfood(13,food);
        int x = man.getFoodsize(man);
        assertEquals(1,x);
    }
@Test
    public void testRemoveFood() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30);
        man.addfood(13,food);
        man.removeFood(food);
        int x = man.getFoodsize(man);
        assertEquals(0,x);
    }
@Test
    public void testUsefood() {
         Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30);
        man.addfood(13,food);
        food.set(food);
        man.usefood(man,food.getFoodname(food));
        int x = man.getLevel(man);
        assertEquals(31,x);
    }
@Test
    public void testGetLevel() {
        Adventure man =new Adventure(12,"dqr");
        int x = man.getLevel(man);
        assertEquals(1,x);
    }
@Test
    public void testAddLevel() {
        Adventure man = new Adventure(12,"dqr");
        man.addLevel(man,2);
        int x = man.getLevel(man);
        assertEquals(3,x);
    }
@Test
    public void testAddhitpoint() {
        Adventure man = new Adventure(12,"dqr");
        man.addhitpoint(man,300);
        int x = man.gethitpoint(man);
        assertEquals(800,x);
    }
@Test
    public void testGethitpoint() {
    }
@Test
    public void testCntsamename() {
        Adventure man= new Adventure(12,"dqr");
        Bottle bottle =  new Bottle(12,"ok",40);
        man.addBottle(bottle);
        bottle.set(bottle);
        int x = man.cntsamename(man,"ok");
        assertEquals(1,x);
    }
}