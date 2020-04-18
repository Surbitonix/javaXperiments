import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        //format the numbers
        DecimalFormat truncateNumber = new DecimalFormat("#.###");
        //round down - so you can extract the correct numbers
        truncateNumber.setRoundingMode(RoundingMode.DOWN);

        //parseDouble is like casting a string into a Double - genius!
        double num1Trunc = Double.parseDouble(truncateNumber.format(num1));
        double num2Trunc = Double.parseDouble(truncateNumber.format(num2));
        //System.out.println(num1Trunc+"<-->"+num2Trunc);

       return num1Trunc == num2Trunc;

    }
}
