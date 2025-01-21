import java.util.Scanner;
public class Pokemon {
    private String name;
    private int health;
    private int experience; 
    public int normalBerry;
    public int rareBerry;
    private static int MAX_HEALTH = 100;
    private static int MIN_EXPERIENCE = 0;
    public int tries;
    
    public Pokemon(String n){
        name = n;
        health = MAX_HEALTH;
        experience = MIN_EXPERIENCE;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getExperience(){
        return experience;
    }
    public void fight(){
        int battle = (int)(Math.random()*3);
        if(battle == 0){
            System.out.println(name + " has won.");
            experience += 15;
            health -= 5;
        }
        if(battle == 1){
            System.out.println(name + " has tied.");
            experience += 10;
            health -= 10;
        }
        if(battle == 2){
            System.out.println(name + " has lost.");
            health -= 15;
            experience += 5;
        }
    }
    
    public void rest(){
        Scanner input = new Scanner(System.in);
        health += 10;
        experience -= 5;
        
     System.out.println("Normal Berry = "+normalBerry +"\nRare Berry = " + rareBerry );
        
        if(normalBerry != 0 && rareBerry == 0){
            System.out.println("Do you want to use your Normal Berry?\n1-yes\n2-no");
            int choice = input.nextInt();
            if(choice == 1){
                normalBerry -= 1;
                experience +=5;   
            }
        }
        if(normalBerry == 0 && rareBerry != 0){
            System.out.println("Do you want to use your Rare Berry?\n1-yes\n2-no");
            int choice = input.nextInt();
            if(choice == 1){
                rareBerry -= 1;
                experience +=10;
                health += 10;   
            }
        }
        if(normalBerry != 0 && rareBerry != 0){
            System.out.println("Do you want to use your Rare Berry or Normal Berry?\n1-yes Normal berry\n2-yes Rare Berry\n-3-no");
            int choice = input.nextInt();
            if(choice == 1){
                normalBerry -= 1;
                experience +=5;   
            }
            if(choice == 2){
                rareBerry -= 1;
                experience +=10;
                health += 10; 
        }
    
        if(health > MAX_HEALTH){
            health = MAX_HEALTH;
        }
        if(experience < MIN_EXPERIENCE){
            experience = MIN_EXPERIENCE;
        }
        
    }
    }
    public String toString(){
        String output = name + " has " + health + " health and " + experience + " experience.";
        return output;
    }
   public void searchBerry(){
        int berry = (int)(Math.random()*4);
        health-= 10;
        experience -= 10;
        if(berry == 0){
            System.out.println(name + " has found no berry.");
        }
        if(berry == 1  || berry == 2){
            System.out.println(name + " has found a normal berry. Berry Power: Use once during rest and you won't lose experience.");
            normalBerry++;
        }
        if(berry == 3){
            System.out.println(name + " has found a rare berry. Berry Power: increase health and experience by 10.");
            rareBerry++;
        }
    }
    //public static int compareHealth(pok2)

    public void menu(){
        Scanner input = new Scanner(System.in);
        while(experience < 100 && health > 0){
            System.out.println("0 - Display Pokemon health and experience.");
            System.out.println("1 - Rest.");
            System.out.println("2 - Fight.");
            System.out.println("3 - Search for berries.");
            int action = input.nextInt();
            tries++;
            if(action == 0){
                System.out.println(toString());
            }
            if(action == 1){
                System.out.println(name + " has rested.");
                rest();
            }
            if(action == 2){
                System.out.println(name + " fought.");
                fight();
            }
          if(action == 3){
                System.out.println(name + " went looking for berries.");
                searchBerry();
            }
            if(action != 1 && action != 2 && action != 0 && action!= 3){
                System.out.println("Error: Input right number.");
            }
        }
        if(experience >= 100 && health <= 0){
            System.out.println(name + " has fainted. You have lost. "+ name + "'s  experience reached 100, but the health reached 0");
        }
        if(experience >= 100 && health > 0 ){
            System.out.println(name + " has evovled! You have won! "+ name + "'s experience reached 100! It took " + tries + " tries.");
        }
        if(health <= 0 && experience  < 100){
            System.out.println(name + " has fainted. You have lost. "+ name + "'s health reached 0!");
        }
    }
}