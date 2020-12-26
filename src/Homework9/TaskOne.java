package Homework9;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number=5; // put your own number
        int previousNumber=1;
        int sum = 0;

        /*
expect the number. If the number is 5
1 + 11 + 111 + 1111 + 11111
calculate sum
Sum is 12345


 */
        //int i = 1;
        //while(condition) {
        //..some code here
        //i++
        //}

        for (int i=1; i<=number; i++) {
            sum = sum + previousNumber;


            System.out.print(previousNumber);
            if(i < number)
                System.out.print(" + ");
            previousNumber = previousNumber * 10 +1;

        }

        System.out.println("\nSum is " + sum);
        //at the beginning previousNumber = 1;
        //i = 1; previousNumber = 11;
        //i = 2; previousNumber = 11*10 + 1 = 111;
    }}



    //Write a program in Java to find the sum of the series 1 +11 + 111 +
//1111 + .. n terms.
//Test Data :
//Input the number of terms : 5
//Expected Output :
//1 + 11 + 111 + 1111 + 11111
//The Sum is : 12345