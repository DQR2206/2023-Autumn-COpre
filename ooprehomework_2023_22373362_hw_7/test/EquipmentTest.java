import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentTest  {

    @Test
    public void testGetStar() {
        Equipment equipment = new Equipment(123,"dqr",4,10);
        int star = equipment.getStar();
        assertEquals(4,star);
    }
@Test
    public void testSetStar() {
        Equipment equipment = new Equipment(123,"dqr",4,10);
        equipment.setStar(5);
        int star = equipment.getStar();
        assertEquals(5,star);
    }
@Test
    public void testGetID() {
        Equipment equipment = new Equipment(1,"dqr",4,20);
        int id = equipment.getId();
        assertEquals(1,id);
    }
@Test
    public void testTestGetName() {
        Equipment equipment = new Equipment(1,"dqr",4,20);
        String name = equipment.getName();
        assertEquals("dqr",name);
    }
@Test
    public void testReset() {
        Equipment equipment = new Equipment(1,"dqr",4,20);
        equipment.reset();
        boolean x = equipment.getBecarried();
        assertFalse(x);
    }
@Test
    public void testSet() {
        Equipment equipment = new Equipment(1,"dqr",4,20);
        equipment.set();
        boolean x = equipment.getBecarried();
        assertTrue(x);
    }
@Test
    public void testGetBecarried() {
        Equipment equipment = new Equipment(1,"dqr",4,20);
        boolean x = equipment.getBecarried();
        assertFalse(x);
    }
}