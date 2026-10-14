package org.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 1) {
                flag = true;
                break;
            }
            n = n / 10;
        }
        System.out.println(flag);
    }
}
