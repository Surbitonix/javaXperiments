package Animals.src.surbitonix97;

public class Dog extends Animals{

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int legs, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew() {
        System.out.println("dog.chew()...called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("dog.walk()...called");
        super.movement(5);
    }

    public void run(){
        System.out.println("dog.run()...called");
        movement(10);
    }

    public void movelegs(int x)
    {
        System.out.println("movelegs()...method called");
    }

    @Override
    public void movement(int speed) {
        System.out.println("Dog.movement()...called");
        movelegs(speed);
        super.movement(speed);
    }
}
