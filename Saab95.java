import java.awt.*;

public class Saab95 extends Car {
    private boolean turboOn;
    public final static String modelName = "Saab95";

    public Saab95(int nrDoors, Color color, double enginePower) {
        super(nrDoors, color, enginePower, modelName);
    }

    public void setTurboOn() {
        turboOn = true;
    }
    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if(turboOn)
            turbo = 1.3;
        return super.getEnginePower() * 0.01 * turbo;
    }


}
