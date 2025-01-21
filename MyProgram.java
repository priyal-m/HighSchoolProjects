//Priyal mangla
//September 23,2021
// calculates and displays the area & circumference of a circle given the radius
import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the radius of a circle in inches.");
    double radius = input.nextDouble();
    
    double area = Math.pow(radius, 2)*Math.PI;
    double circum = (2)*(radius)*(Math.PI);
    
    System.out.println("For a circle with a radius of " + radius);
    System.out.printf("The area is %6.3f square inches", area);
    System.out.printf("\nThe circumference is  %6.3f inches", circum);
    }
}