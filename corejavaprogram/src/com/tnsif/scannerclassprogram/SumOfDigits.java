package com.tnsif.scannerclassprogram;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 2-digit number: ");
        int num = sc.nextInt();

        int digit1 = num / 10;
        int digit2 = num % 10;

        int sum = digit1 + digit2;

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}