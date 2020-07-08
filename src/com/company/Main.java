package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter numbers to determine range:");
        int num = scanner.nextInt();

        if (num > 100 && num < 999) {
            System.out.println("The number is greater than 100");
        }
        else if (num >= 0 && num < 100) {
            System.out.println("The number is less than 100");
        }
        else if (num > 1000) {
            System.out.println("The number is greater than 1000");
        }
        else if (num < 0) {
            System.out.println("The number is less than zero");
        }

    }
}
