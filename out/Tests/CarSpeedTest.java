import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class CarSpeedTest {

    @Test
    void testStartEngine() {
        Car Saab95 = new Saab95(2, Color.red, 125);
        double initialSpeed = Saab95.getCurrentSpeed();

        Saab95.startEngine();

        Assertions.assertTrue(initialSpeed < Saab95.getCurrentSpeed());
        Assertions.assertEquals(0.1, Saab95.getCurrentSpeed());
    }
}