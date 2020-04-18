public class MinutesToYearsCalculator {

    private static final int MinutesToYear = 525600;
    private static final int MinutesToDay = 1440;

    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
            {
                long year =  minutes / MinutesToYear;
                long day = (minutes % MinutesToYear)/MinutesToDay;

                System.out.println(minutes + " min = "+ year + " y and " + day + " d" );
            }

    }
}
