public class Main {
    public static void main(String[] args) {
       boolean y = LeapYear.isLeapYear(-1600);
        System.out.println(y);

        boolean case2 = LeapYear.isLeapYear(1600);
        System.out.println(case2);

        boolean case3 = LeapYear.isLeapYear(2017);
        System.out.println(case3);

        boolean case4 = LeapYear.isLeapYear(2000);
        System.out.println(case4);

        boolean case5 = LeapYear.isLeapYear(2020);
        System.out.println(case5);

    }
}
