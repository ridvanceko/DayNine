package Homework9;
import java.util.Scanner;
public class TaskSix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string ");

        //1 given the string

        String str = "Civic";
        String rightToLeft = "";

        //2 compare the left to right with right to left
        for(int i=str.length()-1;  i>=0; i--) {

          rightToLeft += str.charAt(i);
        }
              if (rightToLeft.equalsIgnoreCase(str))
        System.out.println("The given string " + str + " is palindrome");
              else
                  System.out.println("The given string  \"" + str + "\" is not palindrome");
        //2.1 eg. "civic' left to right -> "civic
        //2.2 what is right to left og "civic" -->
            // 2.2.1 use for loop starting from the end

        //2.3 compare both strings
        //2.4 if they both the same sout ("Palindrome")
}}

//Write a program in Java to check whether a String is a palindrome
//or not.
//Test Data :
//Input a number: Civic
//Expected Output :
//Civic is palindrome
//NOTE:
//A string is said to be a palindrome if the string read from left to right
//is equal to the string read from right to left. For example, ignoring
//the difference between uppercase and lowercase letters,
//the string "iTopiNonAvevanoNipoti" is a palindrome,