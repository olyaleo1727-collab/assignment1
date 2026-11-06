import java.awt.*;

public class Volvo240 extends Car {
    public final static double trimFactor = 1.25;
    public final static String modelName = "Volvo240";


    public Volvo240(int nrDoors, Color color, double enginePower) {
        super(nrDoors, color, enginePower, modelName);
    }
    @Override
    public double speedFactor() {
        return this.getEnginePower() * 0.01 * trimFactor;
    }


}