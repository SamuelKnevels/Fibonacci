package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int fibonacciLength = 10;
        long fibonacci[];

        // Ask user for starting number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int startNumber = scanner.nextInt();

        System.out.println();
        System.out.println("Fibonacci:");

        fibonacci = fib(startNumber);
        for (int i = 2; i < fibonacciLength+2; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }


    static long[] fib(int n)
    {
        double fibonacciRatio = ((1 + Math.sqrt(5)) / 2);

        // Declare an array to store Fibonacci numbers
        // 1 extra to handle case, n = 0
        long f[] = new long[13];

        int i;


        // 1 and 1 to start from the number following startingNumber
        f[0] = Math.round(n/fibonacciRatio);
        f[1] = n;

        for (i = 2; i <= 11; i++) {

            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }

        return f;
    }
}