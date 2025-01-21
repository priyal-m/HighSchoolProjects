import java.util.*;
public class BList {
    protected BNode root;
    BList(ArrayList <Integer> list){
        for(int i = 0;i<list.size();i++){
            BNode x = new BNode(list.get(i));
            if(root == null){
                root = x;
            }
            else{
                compare(x, root);
            }
        }
    }
    BList(){
    }
    public void compare(BNode x, BNode current){
       if(x.value<=current.value && current.left != null){
            compare(x,current.left);
       }
       else if(x.value<=current.value && current.left == null){
           current.left = x;
       }
        else if (x.value>current.value && current.right != null){
            compare(x, current.right);
        }
        else if(x.value>current.value && current.right == null){
            current.right = x;
        }
    }
    public void print(BNode n){
        if(n != null){
            if(n.left != null){
                print(n.left);
            }
            System.out.println(n.value + " -> ");
            if(n.right != null){
                print(n.right);
            }
        }
    }
    public boolean show(){
        print(root);
        return true;
    }
    
}