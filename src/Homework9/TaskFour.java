package Homework9;
import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number of the range: ");
       int numberOne  = input.nextInt();
        System.out.println("Please enter the second number of the range: ");
        int numberTwo  = input.nextInt();



          for (int currentNumber = numberOne; currentNumber <= numberTwo; currentNumber++ ) {

              int counter = 0;
              for( int i = 2; i < currentNumber/2; i++ ) {
                  if(currentNumber % i == 0) {

                      counter++;
                  }
              }

              if(counter == 0) {
                  System.out.println("found the prime numbers " + currentNumber);
              }

          }

        /*
        1. given range of numbers
        2. check one by one if the number is prime number
           2.1 if number is divisible by 1 and itself only than this is prime number
           2.2
         */
    }
}

//Write a program in Java to find the prime numbers within a
//range of numbers.
//Test Data :Input starting number of range: 1
//Input ending number of range : 50
//Expected Output :
//The prime number between 1 and 50 are :
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
//NOTE: you need to use the nested loop.