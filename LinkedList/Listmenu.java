import java.util.Scanner;
public class Listmenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        LinkedList l1 = new LinkedList();
        while(flag){
            System.out.println("What would you like to do?\n1. Insert a Value \n2. Delete a value\n3. Print the list\n4. Print length of the List\n5. Quit the function\n Enter the number corresponding with your choice.");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.println("What value do you want to insert?");
                int d = input.nextInt();
                l1.insert(d);
            }
            else if(choice == 2){
                System.out.println("What value do you want to remove");
                int r = input.nextInt();
                l1.remove(r);
            }
            else if(choice == 3){
                l1.show();
            }
            else if(choice == 4){
                l1.displayLength();
            }
            else if(choice == 5){
                flag = false;
                System.out.println("System Stopped.");
            }
            else{
                System.out.println("Error: Try Again.");
            }
            
        }
    }
    //public int CountEmpty(){
    //        int count = 0;
            
            
    //}
        
    
}