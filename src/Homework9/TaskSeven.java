package Homework9;
import java.util.Scanner;
public class TaskSeven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j > i)
                    System.out.print(" ");
                else {
                    counter++;
                    System.out.print(counter);
                }
            }
            System.out.print("\n");
        }


    } }

//13. Write a program in Java to make such a pattern like a pyramid with numbers
//increased by 1. For this task ask the user to enter a number of the line.
//Example:
//Please enter line number:
//4
//Expected output:
//1
//2 3
//4 5 6
//7 8 9 10
//NOTE: You need to use the nested loop