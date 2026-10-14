package org.example;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            double term = Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / factorial(2 * i + 1));
            sum += term;
        }
        System.out.println(sum);
    }

    public static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
