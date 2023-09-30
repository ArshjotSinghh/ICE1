/*
    Name- Arshjot Singh
    Date- 30 September 2023
    Filename- Main.java
    Description- In this program, we get the initial angle and initial velocity from the user and then calculate the maximum horizontal distance covered by the projectile.
 */
//This imports the scanner library
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // This defines the value of the gravitational force
        final double GRAVITATIONAL_CONSTANT=9.8;
        // This initializes a scanner
        Scanner scanner=new Scanner(System.in);
        // Get user input on the initial angle of projectile
        System.out.println("What is the initial angles of projectile (in degrees)?: ");
        double degree=Math.abs(scanner.nextDouble());
        // Convert the angle in degrees into radians
        double radians=Math.toRadians(degree);
        // Get the user input on the initial velocity of the projectile
        System.out.println("What is the initial velocity of the projectile?: ");
        double velocity=Math.abs(scanner.nextDouble());
        // Calculate the maximum horizontal distance of the projectile
        double HORIZONTAL_DISTANCE=((velocity*velocity)*(2*Math.sin(radians)*Math.cos(radians)))/GRAVITATIONAL_CONSTANT;
        // Display the calculate result
        System.out.format("%.3f is the maximum horizontal distance of the projectile",HORIZONTAL_DISTANCE);

    }
}
