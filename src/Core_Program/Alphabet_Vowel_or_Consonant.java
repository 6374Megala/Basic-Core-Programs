package Core_Program;

import java.util.Scanner;

public class Alphabet_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = scan.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("It's Vowel ");
        }
        else{
            System.out.println("It's  Consonant");
        }
    }

}
