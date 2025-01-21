import java.util.*;
public class BTree {
    public static void main(String[] args) {
        //Create ArrayList of numbers user input
        //Iterate through Arrylist; place values untno a Binary tree
        //Print Tree
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> aList = new ArrayList <Integer>();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a value");
            aList.add(input.nextInt()); 
            System.out.println("Do you want to add another value? (y/n)");
            if(input.next().charAt(0) == 'n'){
                flag = false;
                //System.out.println("ended");
            }
        }
        //System.out.println("exited");
        BListDepth tree = new BListDepth(aList);
        //System.out.println("check 1");

       // tree.show();
        //System.out.println("check 2");
        BListDepth tree2= new BListDepth(aList);
        tree.show();
        System.out.println(tree.getMaxDepth());
        tree.nodeAtDepth(2);
        
        System.out.println(" -------------------------------------------\nIPL/EPL Assignment");
        tree2.calcIPL();
        tree2.calcEPL();
    }
}