package com.khatodankit.codechef.flow006;

import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        int[] inputs = getUserInputs();
        for (int input : inputs) {
            System.out.println(sumOfDigits(input));
        }
    }

    /**
     * Gets the user input
     * The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.
     *
     * @return int array
     */
    private static int[] getUserInputs() {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[0];
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            inputs = new int[a];
            for (int i = 0; i < a; i++) {
                inputs[i] = sc.nextInt();
            }
        }
        return inputs;
    }


    /**
     * returns sum of the digits
     *
     * @param input
     * @return
     */
    private static int sumOfDigits(int input) {
        int sum = 0;
        int lastDigit;
        while (input != 0) {
            lastDigit = input % 10;
            input -= lastDigit;
            input /= 10;

            sum += lastDigit;
        }
        return sum;
    }
}
