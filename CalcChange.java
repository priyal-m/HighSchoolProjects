//Priyal Mangla
//September 27,2021
//calculate the change returned to a customer when the customer uses a $100 bill to make a purchase. The program will list the quantity of each type of bill and it will be efficient (returns the smallest number of bills)
import java.util.Scanner;

public class CalcChange
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is the purchase price?");
    int price = input.nextInt();
    
    int change = 100 - price;
    
    int twenty = change/20;
    int twentyLeft= change % 20;
    
    int ten = twentyLeft/10;
    int tenLeft= twentyLeft % 10;
    
    int five =tenLeft/5;
    int fiveLeft = tenLeft%5;
    
    int one = fiveLeft;
    
    System.out.println("Purchase price = $" + price);
    System.out.println("Change out of $100 = " + change);
    System.out.println(twenty+ " twenty");
    System.out.println(ten+ " ten");
    System.out.println(five+ " five");
    System.out.println(one+ " one");

    }
}