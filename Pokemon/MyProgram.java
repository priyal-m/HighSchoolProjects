//Priyal Mangla
//4/29/2020
//Pokemon game
import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pokemon Game! \nThe rules of this game are simple, you can view your pokemon's stats, make him/her rest, or have him/her fight. The goal is to reach 100 experience before you reach 0 health. Resting increases health but decreases experiences. Fighting increases experience and decreases health. When you fight the amount of experience you gain or health you lose depends on if your pokemon wins, loses, or ties.\nLet's Begin!");
        Pokemon p1 = new Pokemon("Pikachu");
        Pokemon p2 = new Pokemon("Charmandar");
        Pokemon p3 = new Pokemon("Squirtle");
        Pokemon p4 = new Pokemon("Bulbasar");
        //Round 1
        System.out.println("Pick a pokemon:\n1-" + p1.getName() +" \n2-" + p2.getName() +"\n3-" + p3.getName() +"\n4-" +p4.getName() + ".");
        int pokemon = input.nextInt();
        int count = 0;
        while(count == 0){
            if(pokemon == 1){
                p1.menu();
                
            }
            else if(pokemon == 2){
                p2.menu();
                
    
            }
            else if(pokemon == 3){
                p3.menu();
                
    
            }
            else if(pokemon == 4){
                p4.menu();
                
            }
            
            //Round 2
            if(pokemon == 1){
                System.out.println("Pick the next pokemon:\n1-" + p2.getName() +" \n2-" + p3.getName() +"\n3-" + p4.getName());
                int pokemon2 = input.nextInt();
                if(pokemon2 == 1){
                    p2.menu();
                    
        
                }
                else if(pokemon2 == 2){
                    p3.menu();
                    
        
                }
                else if(pokemon2 == 3){
                    p4.menu();
                    
                }
                
            }
            else if(pokemon == 2){
                System.out.println("Pick the next pokemon:\n1-" + p1.getName() +" \n2-" + p3.getName() +"\n3-" + p4.getName());
                int pokemon2 = input.nextInt();
                if(pokemon2 == 1){
                    p1.menu();
                    
        
                }
                else if(pokemon2 == 2){
                    p3.menu();
                    
        
                }
                else if(pokemon2 == 3){
                    p4.menu();
                    
                }               
    
            }
            else if(pokemon == 3){
                System.out.println("Pick the next pokemon:\n1-" + p1.getName() +" \n2-" + p2.getName() +"\n3-" + p4.getName());
                int pokemon2 = input.nextInt();
                if(pokemon2 == 1){
                    p1.menu();
                    
        
                }
                else if(pokemon2 == 2){
                    p2.menu();
                    
        
                }
                else if(pokemon2 == 3){
                    p4.menu();
                    
                }
                
    
            }
            else if(pokemon == 4){
                System.out.println("Pick the next pokemon:\n1-" + p1.getName() +" \n2-" + p2.getName() +"\n3-" + p3.getName());
                int pokemon2 = input.nextInt();
                if(pokemon2 == 1){
                    p1.menu();
                    
        
                }
                else if(pokemon2 == 2){
                    p2.menu();
                    
        
                }
                else if(pokemon2 == 3){
                    p3.menu();
                    
                }
                
            }
        }
    }
}