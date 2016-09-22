package com.company;

public class Main {

    public static void main(String[] args) {
        // LOOPS

        // Sum from 3 to 79
        int a;
        int sum = 0;

        for (a = 3; a <= 79; a++) {

            // 79 - a + 1 = 77 This works when I have <=
            // 79 - a = 76

            sum = sum + a;
            System.out.println("Loop iteration: " + (a - 2));
            System.out.println("Value of a: " + a);
            System.out.println("Value of sum: " + sum);

        }

        // The action of the for loop is done at the END of the loop.

    }

}
