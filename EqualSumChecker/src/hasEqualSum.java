public class hasEqualSum {
    public static boolean hasEqualSum(int sum1, int sum2, int sum3){
        boolean equalSumCheck = false;

        if (sum3 == (sum1+sum2)){
            equalSumCheck = true;
        }else {
            equalSumCheck = false;
        }
        return equalSumCheck;
    }
}
