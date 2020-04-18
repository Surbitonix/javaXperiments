public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leapYearCheck = false;

        if (year <= 1 || year >= 9999) {
            //System.out.println("Invalid year");
            leapYearCheck = false;
        }
        else if (year % 4 == 0)
            {
                if (year % 100 == 0)
                {
                    if (year % 400 == 0)
                    {
                        leapYearCheck = true;
                    }
                    else {
                        leapYearCheck = false;}
                }
                else {leapYearCheck = true;}
        }
        else if (year % 100 == 0 ){
            if (year % 400 == 0){
                leapYearCheck = true;
            }else{
                leapYearCheck = false;
            }
        leapYearCheck = true;
        }
        else if (year % 400 == 0){
            leapYearCheck = true;
        }
            else {
               leapYearCheck = false;
        }
            return leapYearCheck;
      }

}
