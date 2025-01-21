import java.util.*;
public class EList {
    ENode root;
    String list;
    public EList(String s){
        list = s;
        root = new ENode(nextData());
        setNode(root);
        
    }
    //Creates the tree
    public char nextData(){
        char c = list.charAt(0);
        list = list.substring(1,list.length());
        return c;
    }
    public void setNode(ENode n){
        if(n.data == '+' || n.data == '-' || n.data=='*'|| n.data == '%' || n.data == 'h'){
            n.left = new ENode(nextData());
            setNode(n.left);
            n.right = new ENode(nextData());
            setNode(n.right);
        }
        if(n.data == 'n'|| n.data == 'f'){
            n.left = new ENode(nextData());
            setNode(n.left);
        }
        calculate(n);
    }
    
    //fills the value part of each Node
    public void calculate(ENode n){
        if(n.data == '+' || n.data == '-' || n.data=='*'|| n.data == '%'||n.data =='h' || n.data == 'n'|| n.data == 'f'){
            if(n.data == '+'){
                n.value = n.left.value + n.right.value;
            } 
            if(n.data == '-'){
                n.value = n.left.value - n.right.value;
            } 
            if(n.data == '*'){
                n.value = n.left.value * n.right.value;
            } 
            if(n.data == '%'){
                n.value = n.left.value % n.right.value ;
            }
            if(n.data == 'h'){
                n.value = (int)Math.sqrt(Math.pow(n.left.value, 2) + Math.pow(n.right.value, 2));
            }
            if(n.data == 'n'){
                n.value = n.left.value * -1;
            }
            if(n.data == 'f'){
                n.value = factorial(n.left.value);
            }
            
        }
        else{
            n.value = n.data - '0';
        }
    }
    
    //factorial recursive
    public int factorial(int n){
        int ans = 1;
        if(n>1)
            ans = n * factorial(n-1);
        return ans;
    }
    
    //prints the tree and the final value
    public void print(ENode n){
        if(n.left != null){
            System.out.print("(");
            print(n.left);
        }
            
        System.out.print(n.data);
        if(n.right != null)
            print(n.right);
        if(n.left != null)
            System.out.print(")");
    }
    public void show(){
        print(root);
        System.out.println(" = " + root.value);
        
    }
}