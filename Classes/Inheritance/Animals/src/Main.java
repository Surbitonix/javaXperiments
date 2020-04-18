package Animals.src.surbitonix97;

public class Main {

    public static void main(String[] args) {
        Animals.src.surbitonix97.Animals animal1 = new Animals("Marco",1,1,5,5);
        Animals.src.surbitonix97.Dog dog1 = new Animals.src.surbitonix97.Dog("Dick",8,15,4,2,1,32,"furrish");
        System.out.println(animal1.getName());
        System.out.println(dog1.getName());
        dog1.eat();
	// write your code here
    }
}
