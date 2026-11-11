import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarMoveTest {

    @Test
    void testMove() {
        Car testSaab = new Saab95(2, Color.red, 125);
        Car testVolvo = new Volvo240(2, Color.red, 125);

        double initialSaabX = testSaab.getX();
        double initialSaabY = testSaab.getY();
        double initialVolvoX = testVolvo.getX();
        double initialVolvoY = testVolvo.getY();

        testSaab.startEngine();
        testSaab.gas(0.3);
        testSaab.move();

        testVolvo.startEngine();
        testVolvo.gas(0.5);
        testVolvo.move();

        Assertions.assertTrue(initialSaabX != testSaab.getX() || initialSaabY != testSaab.getY() );
        Assertions.assertTrue(initialVolvoX != testVolvo.getX() || initialVolvoY != testVolvo.getY() );
    }
}