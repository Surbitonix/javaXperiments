package Animals.src.surbitonix97;

public class Fish extends Animals{

    private int eyes;
    private int fins;
    private int gills;

    public  Fish(String name, int size, int weight, int eyes, int fins, int gills) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){}
    private void moveBackFin(){}
    private void rest(){}
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.movement(speed);
    }




}
