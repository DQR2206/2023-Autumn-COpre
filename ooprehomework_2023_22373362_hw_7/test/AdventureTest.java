import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class AdventureTest {

    @Test
    public void testAddBottle() {
        Bottle bottle = new Bottle(12,"dqr",30,40);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        int x= man.getBotNum(man);
        assertEquals(1,x);
    }

    @Test
    public void testGetBottle() {
        Bottle bottle = new Bottle(12,"dqr",30,20);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        Bottle bottle1 = man.getBottle(12);
        assertEquals(bottle1.getId(),bottle.getId());
    }

    @Test
    public void testUsebottle() {
        Adventure man = new Adventure(123,"dqr");
        Bottle bottle = new Bottle(111,"ok",40,30);
        man.addBottle(bottle);
        AdventureOP.usebottle(man,"ok");

        RegularBottle bottle1 = new RegularBottle(123,"maidong",20,50);
        man.addBottle(bottle1);
        bottle1.set();
        AdventureOP.usebottle(man,"maidong");
        AdventureOP.usebottle(man,"maidong");

        ReinforcedBottle bottle2 = new ReinforcedBottle(222,"kele",30,40,0.1);
        man.addBottle(bottle2);
        bottle2.set();
        AdventureOP.usebottle(man,"kele");
        AdventureOP.usebottle(man,"kele");

        RecoverBottle bottle3 = new RecoverBottle(456,"xuebi",90,3,0.2);
        man.addBottle(bottle3);
        bottle3.set();
        AdventureOP.usebottle(man,"xuebi");
        AdventureOP.usebottle(man,"xuebi");

        man.findMaxPrice();
    }

    @Test
    public void testGetBotNum() {
        Bottle bottle = new Bottle(12,"dqr",30,20);
        Adventure man = new Adventure(12,"dqr");
        man.addBottle(bottle);
        int x =man.getBotNum(man);
        assertEquals(1,x);

    }
@Test
    public void testRemoveBottle() {
        Bottle bottle = new Bottle(12,"dqr",30,20);
        Bottle bottle1 = new Bottle(13,"fyq",20,20);
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
        Equipment equipment = new Equipment(15,"dqr",4,90);
        man.addEquipment(equipment);
        int x = man.getEquipmentNumber(man);
        assertEquals(1,x);
    }
@Test
    public void testRemoveEquipment() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment = new Equipment(15,"dqr",4,90);
        man.addEquipment(equipment);
        man.removeEquipment(equipment);
        int x = man.getEquipmentNumber(man);
        assertEquals(0,x);
    }
@Test
    public void testAddEquStar() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment = new Equipment(15,"dqr",4,90);
        man.addEquStar(equipment);
        int x = equipment.getStar();
        assertEquals(5,x);
    }
@Test
    public void testGetEquipment() {
        Adventure man = new Adventure(13,"dqr");
        Equipment equipment1 = man.getEquipment(156);
        assertNull(equipment1);
        Equipment equipment = new Equipment(14,"gh",3,20);
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
        Food food = new Food(13,"lb",30,50);
        man.addfood(13,food);
        int x = man.getFoodsize(man);
        assertEquals(1,x);
    }
@Test
    public void testGetFood() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30,50);
        man.addfood(13,food);
        Food food1 = man.getFood(13);
        assertEquals(food,food1);
    }
@Test
    public void testGetFoodsize() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30,50);
        man.addfood(13,food);
        int x = man.getFoodsize(man);
        assertEquals(1,x);
    }
@Test
    public void testRemoveFood() {
        Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30,50);
        man.addfood(13,food);
        man.removeFood(food);
        int x = man.getFoodsize(man);
        assertEquals(0,x);
    }
@Test
    public void testUsefood() {
         Adventure man =  new Adventure(12,"dqr");
        Food food = new Food(13,"lb",30,50);
        man.addfood(13,food);
        food.set();
        man.usefood(man,food.getName());
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
    }
@Test
    public void testGethitpoint() {
    }
@Test
    public void testCntsamename() {
        Adventure man= new Adventure(12,"dqr");
        Bottle bottle =  new Bottle(12,"ok",40,40);
        man.addBottle(bottle);
        bottle.set();
        int x = man.cntsamename(man,"ok");
        assertEquals(1,x);
    }
    @Test
    public void testgetName() {
        Adventure man = new Adventure(111,"dqr");
        String name = man.getName();
        assertEquals("dqr",name);
    }

    @Test
    public void testgetId() {
        Adventure man = new Adventure(111,"dqr");
        int id = man.getId();
        assertEquals(111,id);
    }


    @Test
    public void testusebottle2() {
        Adventure man = new Adventure(123,"dqr");
        Bottle bottle = new Bottle(111,"ok",40,30);
        man.addBottle(bottle);
        man.usebottle2(man,"ok");

        RegularBottle bottle1 = new RegularBottle(123,"maidong",20,50);
        man.addBottle(bottle1);
        bottle1.set();
        man.usebottle2(man,"maidong");
        man.usebottle2(man,"maidong");

        ReinforcedBottle bottle2 = new ReinforcedBottle(222,"kele",30,40,0.1);
        man.addBottle(bottle2);
        bottle2.set();
        man.usebottle2(man,"kele");
        man.usebottle2(man,"kele");

        RecoverBottle bottle3 = new RecoverBottle(456,"xuebi",90,3,0.2);
        man.addBottle(bottle3);
        bottle3.set();
        man.usebottle2(man,"xuebi");
        man.usebottle2(man,"xuebi");

        man.findMaxPrice();
    }

    @Test
    public void testuseequ() {
        Adventure man = new Adventure(123456,"dqr");
        Adventure man1 = new Adventure(111111,"lb");
        Equipment equipment = new Equipment(123,"ok",1,100);
        man.addEquipment(equipment);
        //equipment.set(equipment);

        Equipment equipment1 = new Equipment(111,"alright",2,10);
        man.addEquipment(equipment1);
        man.findMaxPrice();
    }

    @Test
    public void testhurtothers() {
         Adventure man = new Adventure(123456,"dqr");
        Adventure man1 = new Adventure(111111,"lb");
        Equipment equipment = new Equipment(123,"ok",1,10);
        man.addEquipment(equipment);
        equipment.set();
    }

    @Test
    public void testequiscarried() {
         Adventure man = new Adventure(123456,"dqr");
        Adventure man1 = new Adventure(111111,"lb");
        Equipment equipment = new Equipment(123,"ok",1,20);
        man.addEquipment(equipment);
        equipment.set();
        boolean x  = man.equiscarried(man,"ok");
        assertTrue(x);
    }

    @Test
    public void testgetAllPrice() {
        //master
        Adventure adventure = new Adventure(123456,"dqr");
        RegularBottle bottle = new RegularBottle(123,"night",90,10);
        adventure.addBottle(bottle);
        ReinforcedBottle bottle1 = new ReinforcedBottle(89,"jisuanji",40,100,0.2);
        adventure.addBottle(bottle1);
        RecoverBottle bottle2 = new RecoverBottle(12,"ruanjian",40,456,0.4);
        adventure.addBottle(bottle2);
        adventure.addPrice(10);
        EpicEquipment equipment = new EpicEquipment(3435,"ok",2,70,0.1);
        adventure.addEquipment(equipment);
        RegularEquipment equipment1 = new RegularEquipment(135,"tpx",4,66);
        adventure.addEquipment(equipment1);
        CritEquipment equipment2 = new CritEquipment(567,"hzq",5,369,100);
        adventure.addEquipment(equipment2);
        adventure.addPrice(70);

        Adventure lb = new Adventure(11111,"lb");
        Adventure adventure1 = new Adventure(56789,"jxc");
        adventure.hire(56789,adventure1);
        lb.hire(56789,adventure1);
        adventure1.addPrice(70);

        Food food = new Food(777,"jb",50,1234567);
        adventure.addfood(777,food);
        adventure.getAllPrice();
        lb.getAllPrice();

        adventure1.subPrice(70);
        adventure.getAllPrice();
        lb.getAllPrice();

        adventure.search(56789);
        adventure.search(123);
        adventure.search(3435);
        adventure.search(89);
        adventure.search(12);
        adventure.search(567);
        adventure.search(135);
        adventure.findMaxPrice();
    }

    @Test
    public void testhurtone() {
        Adventure adventure = new Adventure(111111,"dqr");
        Adventure adventure1 = new Adventure(222222,"xzq");
        EpicEquipment equipment = new EpicEquipment(1,"baodao",3,90,0.111);
        adventure.addEquipment(equipment);
        equipment.set();
        adventure.hurtone(adventure,adventure1,"baodao");
        CritEquipment equipment1 = new CritEquipment(2,"changjian",4,100,80);
        adventure.addEquipment(equipment1);
        equipment1.set();
        adventure.hurtone(adventure,adventure1,"changjian");
    }
    @Test
    public void testhurtohters() {
        Adventure adventure = new Adventure(111,"dqr");
        Adventure adventure1 = new Adventure(222,"xzq");
        Adventure adventure2 = new Adventure(333,"lzq");
        Adventure adventure3 = new Adventure(444,"gk");
        ArrayList<Adventure> adventures = new ArrayList<>();
        adventures.add(adventure1);
        adventures.add(adventure2);
        adventures.add(adventure3);
        EpicEquipment equipment = new EpicEquipment(1,"gm",1,100,0.1);
        adventure.addEquipment(equipment);
        equipment.set();
        adventure.hurtothers(adventure,adventures,"gm");
        RegularEquipment equipment1 = new RegularEquipment(2,"fyq",3,200);
        adventure.addEquipment(equipment1);
        equipment1.set();
        adventure.hurtothers(adventure,adventures,"fyq");
        CritEquipment equipment2 = new CritEquipment(3,"wyx",4,150,100);
        adventure.addEquipment(equipment2);
        equipment2.set();
        adventure.hurtothers(adventure,adventures,"wyx");
    }

    @Test
    public void testaddmoneytoprice() {
        Adventure adventure = new Adventure(123456,"dqr");
        Bottle bottle = new Bottle(111,"lb",50,100);
        adventure.addBottle(bottle);
        bottle.set();
        Equipment equipment = new Equipment(333,"sb",5,1000);
        adventure.addEquipment(equipment);
        equipment.set();
        Food food = new Food(444,"ok",20,50);
        adventure.addfood(444,food);
        food.set();
        Adventure adventure1 = new Adventure(111111,"xzq");
        adventure1.hire(123456,adventure);
        Adventure adventure2 = new Adventure(222,"xrz");
        adventure2.hire(111111,adventure1);
        adventure.sellall();
        assertEquals(1150,adventure.getMoney());
        adventure.submoneytoprice(1150);
    }

    @Test
    public void testgethelp() {
        Adventure adventure = new Adventure(123456,"dqr");
        Adventure adventure1 = new Adventure(111111,"lb");
        Adventure adventure2 = new Adventure(222222,"xrz");
        adventure.hire(111111,adventure1);
        adventure.hire(222222,adventure2);
        adventure1.addmoney(90);
        adventure2.addmoney(100000);
        adventure.gethelp(2);
        assertEquals(0,adventure1.getMoney());
        assertEquals(80000,adventure2.getMoney());
    }
}

