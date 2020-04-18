public class TeenNumChecker {
    public static boolean hasTeen (int n1, int n2, int n3){
        boolean ageCheck = false;
        if ((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19 ) || ( n3  >= 13 && n3 <= 19)){
            ageCheck = true;
        }else  {
            ageCheck = false;
        }
        return ageCheck;
    }

    public static boolean isTeen (int num1){
        boolean ageCheck2 = false;

        if (num1 >= 13 && num1 <=19){
            ageCheck2 = true;
        }else {ageCheck2 = false;}

        return ageCheck2;

    }
}
