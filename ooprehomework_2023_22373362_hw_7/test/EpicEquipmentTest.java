import org.junit.Test;

import static org.junit.Assert.*;

public class EpicEquipmentTest {

    @Test
    public void getRatio() {
        EpicEquipment epicEquipment = new EpicEquipment(123,"hxr",3,20,0.8);
        assertEquals(0.8,epicEquipment.getRatio(),0.01);
    }
}