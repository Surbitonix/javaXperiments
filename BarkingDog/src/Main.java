public class Main {
    public static void main(String[] args) {
        boolean x = BarkingDog.shouldWakeUp(true,1);
        System.out.println(x);

        boolean case2 = BarkingDog.shouldWakeUp(false,2);
        System.out.println(case2);

        boolean case3 = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(case3);

        boolean case4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(case4);

        boolean case5 = BarkingDog.shouldWakeUp(false,6);
        System.out.println(case5);

    }
}
