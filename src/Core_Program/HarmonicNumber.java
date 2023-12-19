package Core_Program;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N  ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Please enter a  positive number for N.");
        } else {
            double harmonicValue = calculateHarmonicValue(N);
            System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);
        }


    }
    private static double calculateHarmonicValue(int N) {
        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }
        return harmonicValue;
    }
}
