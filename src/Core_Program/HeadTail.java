package Core_Program;

import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numOfFlips = scanner.nextInt();
        if (numOfFlips <= 0) {
            System.out.println("Please enter a positive  number to flips.");
            return;
        }
        int headsCount = 0;
        int tailsCount = 0;
        for(int i=0;i<numOfFlips;i++){
            double option=Math.random();//(int) Math.floor(Math.random() * 10) % 2;
            if(option<0.5){
                tailsCount++;
            }
            else{
                headsCount++;
            }
        }
        double headsPercentage = (double) headsCount / numOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numOfFlips * 100;

        // Print the results
        System.out.println("Results after flipping the coin " + numOfFlips + " times:");
        System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");


    }
}
