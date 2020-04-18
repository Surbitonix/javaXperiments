import java.util.Scanner;

public class InputCalculator {
    public static void InputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double average = 0;

        while (true)
        {
            System.out.println("Enter a number #."+count);
            boolean checkNum = scanner.hasNextDouble();

            if (checkNum)
            {
                double n = scanner.nextDouble();
                count++;
                total+=n;
                average = total / (double) count;
                double round = Math.round(average);
            }
            else
            {
                System.out.println("Invalid Input...Exiting...");
                System.out.println("Sum = 0 AVG = 0");
                break;
            }
            System.out.println("SUM = "+ total + " AVG = " + average);
        }
        scanner.close();


   }

}
