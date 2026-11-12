import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class GasCarTest {

    @Test
    void GasWithNegativeValue() {
        Car gasCar = new Saab95(2, Color.red, 125);
        double speedBefore = gasCar.getCurrentSpeed();
        gasCar.gas(-1);
        double speedAfter = gasCar.getCurrentSpeed();
        Assertions.assertEquals(speedBefore, speedAfter);

    }
    @Test
    void GasWithPositiveValue() {
        Car gasCar = new Saab95(2, Color.red, 125);
        double speedBefore = gasCar.getCurrentSpeed();
        gasCar.gas(5);
        double speedAfter = gasCar.getCurrentSpeed();
        Assertions.assertTrue(speedBefore < speedAfter);

    }
}