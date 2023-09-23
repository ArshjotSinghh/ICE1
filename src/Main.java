/*
Name - Arshjot Singh
Name of the program -Main.java
Date- 23 September 2023
Description- This program asks the user for a number and checks whether it is within the given range.
 */
//This imports the scanner library
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //THe program starts with a welcome message
        System.out.println("Hello, My name is Arshjot Singh and my student ID is 100922122.");
        System.out.println("Personally, My favorite quote ever is 'Be the change that you wish to see in the world.' by Mahatma Gandhi.");
        //This line initiates the scanner
        Scanner scanner= new Scanner(System.in);
        //This line ask the user for a numeric value and store it in a variable
        System.out.print("Kindly choose any numeric value: ");
        double number=scanner.nextDouble();
        //This if-else statement checks whether the number is within the specified range.
        if (number>=50 && number<=999){
            System.out.println("The number you entered is "+number+" and it is within acceptable boundaries (50 and 999).");
        }
        else{
            System.out.println("Alert, the number you entered is "+number+" and it is outside acceptable boundaries (50 and 999).");
        }
    }
}
