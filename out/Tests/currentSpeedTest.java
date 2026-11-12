import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class currentSpeedTest {

    @Test
    void getCurrentSpeed() {
        Car testSaab = new Saab95(2, Color.red, 125);
        while (testSaab.getCurrentSpeed() <= testSaab.getEnginePower()){

            testSaab.gas(1);
            Assertions.assertTrue(testSaab.getCurrentSpeed() <= testSaab.getEnginePower());
            if (testSaab.getCurrentSpeed() == testSaab.getEnginePower()){
                break;
            }
        }
        testSaab.gas(1);
        Assertions.assertTrue(testSaab.getCurrentSpeed() <= testSaab.getEnginePower());

    }
}