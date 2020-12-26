
package Homework9;
import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number: ");

        int number = input.nextInt();
        int initialNumber = number;
        int remainder;
        int total = 0;
        int cube = 0;

        // number = 370
        while(number > 0 ) {
            remainder = number % 10; //0 7 3  remainder is our digit
            number = number / 10; //37 3 0

            cube = remainder * remainder * remainder; //getting the cube of digit
            total += total+ cube;

          //  System.out.println("Digit " + remainder);

        }
        if(total == number)
            System.out.println("The given number is Armstrong number ");
         else
            System.out.println("The given number is not Armstrong number");
    /*
    1 given number (use scanner or just provide it inside the code)
    2 check if it is Armstrong number
     2.1 get all the digits from the number. Example in below substeps for 370
     2.1.1 370 % 10 = 0
     2.1.2 37 % 10 = 7
     2.1.3 3 % 10 = 3

     2.2 Cube them
     2.3 Sum them
     2.4 Compare the sum with number itself
     2.5 if it is true than this is Armstrong number
     */
}}


//Write a Java program to check whether a given number is an
//armstrong number or not.
//Write a Java program to find the perfect numbers within a given number of
//range.
//Test Data :
//Input the starting range or number : 1
//Input the ending range of number : 50
//Expected Output :
//The Perfect numbers within the given range : 6 28
//NOTE: you need to use the nested loop