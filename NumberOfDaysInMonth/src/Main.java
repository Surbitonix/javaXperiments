public class Main {
    public static void main(String[] args) {
        boolean x = NumberOfDaysInMonth.isLeapYear(-1600); System.out.println(x);
        boolean y = NumberOfDaysInMonth.isLeapYear(1600); System.out.println(y);
        boolean z = NumberOfDaysInMonth.isLeapYear(2017); System.out.println(z);
        boolean a = NumberOfDaysInMonth.isLeapYear(2020); System.out.println(a);

        int case1 = NumberOfDaysInMonth.getDaysInMonth(1,2020);
        System.out.println(case1);
        int case2 = NumberOfDaysInMonth.getDaysInMonth(2,2020);
        System.out.println(case2);

    }
}
