public class DigitSum {
    public static int sumDigits (int number)
    {
        if (number < 10)
        {
            return -1;
        }

        int digit = 0;
        int sum = 0;
        while (number > 0)
        {
            digit= number % 10;
            number /= 10;
            sum+=digit;
        }

        return sum;
    }
}
