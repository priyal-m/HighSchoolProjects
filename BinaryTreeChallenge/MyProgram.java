import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = input.next();
        
        BList tree = new BList(s);
        
        tree.oneChildShow();
        
        System.out.println("Number of Empties = " + tree.CountEmpty());
        int depth = tree.findDuplicateDepth();
        if(depth == 0){
            System.out.println("Duplicate = NO DUPLICATES");
        }
        else{
            System.out.println("Duplicate = "+depth);

        }
    }
}