import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;



class CarTestBrake {
    @Test
    void BrakeWithNegativeValue() {
        Car brakeCar = new Saab95(2, Color.red, 125);
        double speedBefore = brakeCar.getCurrentSpeed();
        brakeCar.brake(-1);
        double speedAfter = brakeCar.getCurrentSpeed();
        Assertions.assertEquals(speedBefore, speedAfter);

    }

    @Test
    void brakeWithPositiveValue() {
        Car brakeCar = new Saab95(2, Color.red, 125);
        brakeCar.startEngine();
        brakeCar.gas(1);
        double speedBefore = brakeCar.getCurrentSpeed();
        brakeCar.brake(5);
        double speedAfter = brakeCar.getCurrentSpeed();
        Assertions.assertTrue(speedBefore > speedAfter);
    }

}