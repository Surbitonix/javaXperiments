public class Main {
    public static void main(String[] args) {
        boolean caseExtra = DecimalComparator.areEqualByThreeDecimalPlaces(3.34535,7.345345345);
        System.out.println(caseExtra);

        boolean case1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(case1);

        boolean case2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(case2);

        boolean case3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(case3);

        boolean case4 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123);
        System.out.println(case4);
    }
}
