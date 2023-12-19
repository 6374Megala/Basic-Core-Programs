package Core_Program;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        if(num%2==0){
            System.out.print("The number is even : "+num);
        }
        else{
            System.out.print("The number is odd : "+num);
        }
    }
}
