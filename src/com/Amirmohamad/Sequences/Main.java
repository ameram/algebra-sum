package com.Amirmohamad.Sequences;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, app is working in order.");
        System.out.println(arithmetic(10, 4, 5));
        System.out.println(geometric(10, 4, 5));
        System.out.println(geometricDecimal(1.0, 0.5));

    }

    private static int arithmetic(int index, int firstNumber, int difference) {
        //Sn = n/2 [2 . a1 + ( n - 1 ) . d]
        int sum;
        int p1 = index / 2;
        int p2 = 2 * firstNumber;
        int p3 = (index - 1) * difference;
        sum = (p2 + p3) * p1;
        return sum;

    }

    private static int geometric(int index, int firstNumber, int difference) {
        //Sn = (g1  ( 1 - rn)) / 1-r
        int sum;
        int p1 = firstNumber * (1 - (int)(Math.pow(difference, index)));
        int p2 = 1 - difference;
        sum = p1 / p2;
        return sum;
    }

    private static double geometricDecimal(double firstNumber, double difference){
        //g1 / 1 - r
        double sum = firstNumber / (1 - difference);
        return sum;
    }
}
