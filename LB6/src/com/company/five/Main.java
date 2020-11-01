package com.company.five;

/*Write a function, which takes a non-negative integer(seconds),
as input and returns the time in a human-readable format*/

import java.util.Scanner;

public class Main {

    static int digSum(int n) {
        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String argc[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your number: ");
        int i = sc.nextInt();

        System.out.println(digSum(i));
    }
}