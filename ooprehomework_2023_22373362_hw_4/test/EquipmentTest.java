import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentTest  {

    @Test
    public void testGetStar() {
        Equipment equipment = new Equipment(123,"dqr",4);
        int star = equipment.getStar();
        assertEquals(4,star);
    }
@Test
    public void testSetStar() {
        Equipment equipment = new Equipment(123,"dqr",4);
        equipment.setStar(5);
        int star = equipment.getStar();
        assertEquals(5,star);
    }
@Test
    public void testGetID() {
        Equipment equipment = new Equipment(1,"dqr",4);
        int id = equipment.getID(equipment);
        assertEquals(1,id);
    }
@Test
    public void testTestGetName() {
        Equipment equipment = new Equipment(1,"dqr",4);
        String name = equipment.getName(equipment);
        assertEquals("dqr",name);
    }
@Test
    public void testReset() {
        Equipment equipment = new Equipment(1,"dqr",4);
        equipment.reset(equipment);
        boolean x = equipment.getBecarried(equipment);
        assertFalse(x);
    }
@Test
    public void testSet() {
        Equipment equipment = new Equipment(1,"dqr",4);
        equipment.set(equipment);
        boolean x = equipment.getBecarried(equipment);
        assertTrue(x);
    }
@Test
    public void testGetBecarried() {
        Equipment equipment = new Equipment(1,"dqr",4);
        boolean x = equipment.getBecarried(equipment);
        assertFalse(x);
    }
}