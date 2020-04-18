public class NumberPalindrome {
    public static boolean isPalindrome (int number)
    {
        int num = number;
        int reverse = 0;
        int lastDigit = 0;
        while (number  != 0)
        {
            lastDigit = number %10;
            reverse *= 10;
            reverse+=lastDigit;
            number /= 10;
        }

        if (num == reverse){
            return true;
        }else {
            return  false;
        }
    }
}
