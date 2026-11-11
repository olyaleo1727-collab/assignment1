import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Saab95TurboTest {

    @Test
    void testSaabTurbo() {
        Saab95 slowSaab = new Saab95(2, Color.red, 125);
        Saab95 fastSaab = new Saab95(2, Color.red, 125);

        fastSaab.setTurboOn();

        slowSaab.gas(0.5);
        fastSaab.gas(0.5);

        Assertions.assertTrue(fastSaab.getCurrentSpeed() > slowSaab.getCurrentSpeed());

    }
}