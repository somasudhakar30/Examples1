package javaprograampractice;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers up to " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}

	
		
		        