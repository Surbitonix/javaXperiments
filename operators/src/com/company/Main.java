package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("Previous result is -> "+previousResult);
        result = result -1; // 3-1
        System.out.println("3 - 1 = "+result);
        result = result * 10; // 2 * 10
        System.out.println("2 * 10 = "+result);
        result = result / 5; // 20 / 5
        System.out.println("20 / 5 = "+ result);
        //TIME FOR MODULO
        result = result % 3; // remainder of 4 / 3
        System.out.println(result);

        //ABBREVIATE OPERATORS
        result ++; // 1 + 1 = 2
        System.out.println("1 + 1 = "+ result);
        result --; // 2 - 1 = 1
        System.out.println("2 - 1 = "+ result);
        result += 5; // 1 + 5 = 6
        System.out.println("1 + 5 = "+ result);
        result *= 10; //6 * 10
        System.out.println("6 * 10 = "+ result);
        result /= 12; // 60 / 12
        System.out.println("60 / 12 = "+ result);
        result -= 56; // 5 - 56
        System.out.println("5 - 56 = "+ result);

        boolean isAlian = false;
        if (isAlian == false) {
            System.out.println("Its not an Alian!!!");
            System.out.println("and im not scared of Alians");
        }

        int topScore = 95;
        if (topScore != 100) {
            System.out.println("You got the highest score!!!");
        }
        //AND OPERATOR
        //there are two operators && on boolean operand - but there is also the & works at bit level
        //same thing for the OR operator
        //good idea to add extra pair of parenthesis
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("top score is greater than SecondTopScore and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        //check this out bitch!
        //to check booleans u can do the test with jst enunciating the var or (for negative) jst add prefix "!varNAme"
        boolean buyingCar = false;
        if (!buyingCar) {
            System.out.println("bought a Porsche!");
        }
        //ternary is a shorter way of the if else statement
        boolean wasCar = buyingCar ? true : false;
        if (wasCar){
            System.out.println("buyingCar is true");
            System.out.println("buying car is not happening");
        }
    }
}
