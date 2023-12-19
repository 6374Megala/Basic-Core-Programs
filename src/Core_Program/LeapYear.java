package Core_Program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year = scan.nextInt();

        if (year < 1000 || year > 9999) {
                System.out.println("the year you entered wrong ");
        }
        else{
            if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " not a leap year");
            }

        }


        }
    }


