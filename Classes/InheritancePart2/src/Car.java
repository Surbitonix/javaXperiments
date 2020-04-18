public class Car extends Vehicle {
    private int electricBatteries;
    private int seats;
    private int windows;
    private String colour;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(int doors, int engine, String fuel, int wheels, int lights, int electricBatteries, int seats, int windows, String colour, int gears, boolean isManual, int currentGear){
        super(4,1,"diesel",4,2);
        this.electricBatteries=electricBatteries;
        this.seats=seats;
        this.windows=windows;
        this.colour=colour;
        this.gears=gears;
        this.isManual=isManual;
        this.currentGear=1;
    }




    public int getElectricBatteries() {
        return electricBatteries;
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }

    public String getColour() {
        return colour;
    }

    public int getGears(){
        return gears;
    }

    public boolean getIsManual(){
        return isManual;
    }

    @Override
    public void speed(int torque)
    {
        System.out.println("executing carClass carSpeed()...");
        int totalSpeed = torque*3;
        super.speed(totalSpeed);
    }

    @Override
    public int changeGear(int gear)
    {
        System.out.println("calling changeGear from Car Class");
        int x = gear*2;
        System.out.println("calling superClass changeGear " + super.changeGear(x));
        return x;
    }

    @Override
    public void stopVehicle(){
        super.stopVehicle();
    }
}
