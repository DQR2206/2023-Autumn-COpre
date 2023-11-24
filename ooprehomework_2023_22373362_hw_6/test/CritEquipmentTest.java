import org.junit.Test;

import static org.junit.Assert.*;

public class CritEquipmentTest {

    @Test
    public void getCritical() {
        CritEquipment critEquipment = new CritEquipment(123456,"qwer",2,100,20);
        assertEquals(critEquipment.getCritical(),20);
    }
}