package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;

        for (int i = n; i <= 2 * n; i++) {
            sum += (long) i * i;
        }

        System.out.println(sum);
    }
}