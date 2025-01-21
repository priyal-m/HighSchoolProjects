import java.util.Scanner;
public class LISP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        LinkedList l1 = new LinkedList();
        boolean stack = true;
        System.out.println("Is it stack or Queue?\nStack-1\nQueue-2");
        int x = input.nextInt();
        if(x == 2){
            stack = false;
        }
        while(flag){
            if(stack){
                System.out.println("This is a stack.");
            }
            else{
                System.out.println("This is a queue.");
            }
            System.out.println("What would you like to do?\n1. Push\n2. Pop\n3. Display the list.\n4. Is it in the list?\n5. Reverse\n6. Quit\n Enter the number corresponding with your choice.");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.println("What value do you want to add?");
                l1.addTail(input.nextInt());
            }
            else if(choice == 2 && stack){
                l1.removeTail();
            }
            else if(choice == 2 && !stack){
                l1.removeHead();
            }
            else if(choice == 3){
                l1.show();
            }
            else if(choice == 4){
                System.out.println("What value do you want to check?");
                l1.exists(input.nextInt());
            }
            else if(choice == 5){
                l1.reverse();
            }
            else if(choice == 6){
                flag = false;
                System.out.println("System Stopped");
            }
            else{
                System.out.println("Error: Try Again.");
            }
        }
    }
}
//push
//pop
//reverse
//display
//find