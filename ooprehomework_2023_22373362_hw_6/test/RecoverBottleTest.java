import org.junit.Test;

import static org.junit.Assert.*;

public class RecoverBottleTest {

    @Test
    public void getRatio() {
        RecoverBottle recoverBottle = new RecoverBottle(123,"dqr",50,30,0.8);
        double ratio = recoverBottle.getRatio();
        assertEquals(ratio,0.8,0.01);
    }
}