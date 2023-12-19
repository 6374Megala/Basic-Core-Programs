package Core_Program;

import java.util.Scanner;

public class Swap_two_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a= scanner.nextInt();
        System.out.println("Enter second number ");
        int b =scanner.nextInt();
        System.out.print("Before swapping the numbers are  : ");
        System.out.print(a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println();
        System.out.print("After swapping the numbers are  : ");
        System.out.print(a+" "+b);


    }
}
