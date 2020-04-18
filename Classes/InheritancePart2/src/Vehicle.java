public class Vehicle {
    private int doors;
    private int engine;
    private String fuel;
    private int wheels;
    private int lights;
    private int currentVelocity;


    public Vehicle(int doors, int engine, String fuel, int wheels, int lights) {
        this.doors = doors;
        this.engine = engine;
        this.fuel = fuel;
        this.wheels = wheels;
        this.lights = lights;
        this.currentVelocity = 0;
    }

    public void steering(){
        System.out.println("calling steering()...in VehicleClass");
    }

    public void changeGears()
    {
        System.out.println("calling changeSteer()...in VehicleClass");
    }

    public void speed(int x)
    {
        System.out.println("calling speed()..from VehicleClass");
        System.out.println("speed is "+ currentVelocity);
    }

    public int changeGear(int i){
        System.out.println("calling changeGear method on VehicleClass");
        System.out.println("gear is "+ i);
        return i;
    }

    public void stopVehicle(){
        this.currentVelocity=0;
    }


    public int getDoors() {
        return doors;
    }

    public int getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getWheels() {
        return wheels;
    }

    public int getLights() {
        return lights;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
