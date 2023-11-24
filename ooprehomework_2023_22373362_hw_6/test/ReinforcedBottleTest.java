import org.junit.Test;

import static org.junit.Assert.*;

public class ReinforcedBottleTest {

    @Test
    public void getRatio() {
        ReinforcedBottle reinforcedBottle = new ReinforcedBottle(123,"lb",100,30,0.9);
        double ratio = reinforcedBottle.getRatio();
        assertEquals(ratio,0.9,0.001);
    }
}