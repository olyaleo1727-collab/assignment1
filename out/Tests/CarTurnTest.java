import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTurnTest {

    @Test
    void testTurnLeft() {
        Car testSaab = new Saab95(2, Color.red, 125);
        Car testVolvo = new Volvo240(2, Color.red, 125);

        Assertions.assertEquals(0, testSaab.getDirection());
        Assertions.assertEquals(0, testVolvo.getDirection());

        testSaab.turnLeft();
        testVolvo.turnLeft();

        Assertions.assertEquals(3, testSaab.getDirection());
        Assertions.assertEquals(3, testVolvo.getDirection());

        testSaab.turnLeft();
        testVolvo.turnLeft();

        Assertions.assertEquals(2, testSaab.getDirection());
        Assertions.assertEquals(2, testVolvo.getDirection());

        testSaab.turnLeft();
        testVolvo.turnLeft();

        Assertions.assertEquals(1, testSaab.getDirection());
        Assertions.assertEquals(1, testVolvo.getDirection());

        testSaab.turnLeft();
        testVolvo.turnLeft();

        Assertions.assertEquals(0, testSaab.getDirection());
        Assertions.assertEquals(0, testVolvo.getDirection());
    }

    @Test
    void testTurnRight() {
        Car testSaab = new Saab95(2, Color.red, 125);
        Car testVolvo = new Volvo240(2, Color.red, 125);

        Assertions.assertEquals(0, testSaab.getDirection());
        Assertions.assertEquals(0, testVolvo.getDirection());

        testSaab.turnRight();
        testVolvo.turnRight();

        Assertions.assertEquals(1, testSaab.getDirection());
        Assertions.assertEquals(1, testVolvo.getDirection());

        testSaab.turnRight();
        testVolvo.turnRight();

        Assertions.assertEquals(2, testSaab.getDirection());
        Assertions.assertEquals(2, testVolvo.getDirection());

        testSaab.turnRight();
        testVolvo.turnRight();

        Assertions.assertEquals(3, testSaab.getDirection());
        Assertions.assertEquals(3, testVolvo.getDirection());

        testSaab.turnRight();
        testVolvo.turnRight();

        Assertions.assertEquals(0, testSaab.getDirection());
        Assertions.assertEquals(0, testVolvo.getDirection());
    }
}