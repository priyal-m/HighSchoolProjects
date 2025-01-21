//Priyal Mangla
//December 15, 2021
//play the card game 21 where the goal of the game is to try to draw cards that add up to 21 or as close to 21 as possible without going over. If the user has a higher score than the dealer, the user wins. If the user goes over 21, the dealer wins. Use a random number generator to deal cards from a deck. 
import java.util.Scanner;
public class CardGame21
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Let's play Card-21!");
    
    char flag = 'y';
    int userTotal = 0;
    int userCard = 0;
    
    
    while(flag == 'y' && userTotal <= 21){
        userCard =((int)(Math.random()*13)) + 1;
        System.out.println("Your card is a " + userCard + ".");
        userTotal += userCard;
        System.out.println("You total is now " + userTotal + ".");
        if(userTotal<=21){
            System.out.println("Do you want another card?(y/n)");
            flag = Character.toLowerCase(input.next().charAt(0));
            while(flag!= 'n' && flag != 'y'){
                System.out.println("Error! Please type 'n' for no or 'y' for yes.");
                flag = Character.toLowerCase(input.next().charAt(0));
            }
        }
    }
    
    int dealerTotal =(int)((Math.random()*12)) + 10;
    
    
    if(dealerTotal<userTotal && userTotal <= 21){
        System.out.println("Congratulations! You win, the dealer total was " + dealerTotal + ".");
    }  
    if(dealerTotal ==userTotal){
        System.out.println("Awww! You tied with the dealer, the dealer total was " + dealerTotal + ".");
    }
    if(dealerTotal>userTotal){
        System.out.println("Sorry! You lose, the dealer total was " + dealerTotal + ".");
    }
    if(userTotal > 21){
        System.out.println("Sorry! You lose you went over 21, the dealer total was " + dealerTotal + ".");
    }
    }
}