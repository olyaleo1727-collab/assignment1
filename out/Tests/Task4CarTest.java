import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class Task4CarTest {

    @Test
    void gas() {
        Car gasCar = new Saab95(2, Color.red, 125);


        double amountX = gasCar.gas(-1);
        IO.println(amountX);
        Assertions.assertTrue(1 >= amountX && amountX >= 0);


    }
}