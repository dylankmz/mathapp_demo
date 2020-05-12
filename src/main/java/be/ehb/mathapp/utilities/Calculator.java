package be.ehb.mathapp.utilities;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int absoluteValue(int a) {
        return Math.abs(a);
    }

    //Oef 1
    public static double power(double a, double b) {
        return Math.pow(a,b);
    }

    //Oef 2
    public static int divide(int a, int b) {
        return a / b;
    }

    //Oef 3
    public static long factorial(int number) {
       int fact = 1;
       for (int i = 1; i <= number ; i++) {
            fact = fact * i;
       }
        return + fact;
    }


}
