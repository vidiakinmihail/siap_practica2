package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double s = Math.sqrt(3) / 4 * (a * a);
        double p = 3 * a;
        System.out.println(s);
        System.out.println(p);
    }
}
