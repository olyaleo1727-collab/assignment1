import java.awt.*;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double currentSpeed; // The current speed of the car

    //position and direction
    private double x = 0.0; // position
    private double y = 0.0; // position
    private int direction = 0; // direction

    public Car(int nrDoors, Color color,double enginePower,  String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    public int getNrDoors() {
        return nrDoors;}
    public double getEnginePower() {

        return enginePower;
    }
    public double getCurrentSpeed()
    {
        return currentSpeed;
    }
    public Color getColor() {

        return color;
    }

    // Added get methods to retrieve position data for move test unit.

    public double getX() {return x;}
    public double getY() {return y;}
    public int getDirection() {return direction;}

    public void setColor(Color clr) {
        color = clr;
    }
    public void startEngine() {
        currentSpeed = 0.1;
    }
    public void stopEngine() {
        currentSpeed = 0;
    }
    // TODO Fix in task 4
    public double gas(double amount) {
        if (amount>1 || amount<0){
            amount=1;
        }
        incrementSpeed(amount);
        return amount;
    }
    // TODO Fix in task 4
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    public abstract double speedFactor();

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;

        //conditional added to satisfy currentSpeed not exceeding enginePower.

        if (currentSpeed > this.getEnginePower()) {
            currentSpeed = this.getEnginePower();
        }
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

        //conditional added to satisfy currentSpeed not becoming negative.

        if (currentSpeed < 0){
            currentSpeed = 0;
        }
    }

    //implementing Movable methods (task 2)

    @Override
    public void move(){
        if(direction == 0){ // north
            y += getCurrentSpeed();
        } else if(direction == 1) { //east
            x += getCurrentSpeed();
        } else if(direction == 2){ //south
            y -= getCurrentSpeed();
        } else if(direction == 3){ //west
            x -= getCurrentSpeed();

        }
    }

    @Override
    public void turnLeft(){
        direction = (direction + 3) %4 ;
    }
    @Override
    public void turnRight(){
        direction = (direction + 1) %4 ;
    }


}
