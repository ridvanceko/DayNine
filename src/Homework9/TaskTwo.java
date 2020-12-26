package Homework9;
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {

        int x1, x2;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number of the range: ");
         x1  = input.nextInt();
        System.out.println("Please enter the second number of the range: ");
        x2  = input.nextInt();

        int sumOfDivisor;


            for(int currentNumber = x1; currentNumber <= x2; currentNumber++) {
                //we need to check if the currentNumber is the perfect number
                sumOfDivisor = 0;
                for(int i = 1; i < currentNumber; i++) {
                    if(currentNumber % i == 0) {
                        sumOfDivisor = sumOfDivisor + i;
                    }

                }

                if (sumOfDivisor == currentNumber) {
                    System.out.println("perfect number given range " + currentNumber);
                }
            }
    }
}


//Write a Java program to find the perfect numbers within a given number of
//range.
//Test Data :
//Input the starting range or number : 1
//Input the ending range of number : 50
//Expected Output :
//The Perfect numbers within the given range : 6 28
//NOTE: you need to use the nested loop