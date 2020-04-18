public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int num)
    {
        if (num < 0)
        {
            return -1;
        }

        int n1 = num;
        int lastDigit = 0;
        int firstDigit = 0;
        int sum = 0;

        while (num > 0)
        {
            lastDigit = num % 10;
            System.out.println("Last Digit is\n"+lastDigit);

            while (num >= 10)
            {
                num /= 10;
                System.out.println("n1 is "+ num);
                return num;
            }
         sum = num + lastDigit;

        }
 /*       int digit = 0;
        int sum = 0;

        while (num > 0)
        {
            digit = num % 10;
            System.out.println("digit is "+ digit+ "\nNum is " + num);

            num /=100;
            System.out.println("Num "+ num + "\nDigit "+ digit);
            System.out.println(digit);
            sum +=digit;
            System.out.println("TOTAL IS "+ sum);

        }*/
        return sum;

    }
}
