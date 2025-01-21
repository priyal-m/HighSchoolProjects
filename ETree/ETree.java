import java.util.*;
public class ETree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string.");
        String str = input.next();
        
        EList tree = new EList(str);
        
        tree.show();
    }
}