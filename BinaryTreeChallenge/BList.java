public class BList {
    BNode root;
    int numEmpty;
    int dupDepth;
    BList(String s){
        for(int i = 0;i<s.length();i++){
            BNode x = new BNode(s.charAt(i));
            if(root == null){
                root = x;
            }
            else{
                compare(x, root);
            }
        }
        numEmpty = 0;
        dupDepth = 0;
    }
    public void compare(BNode x, BNode current){
       if(x.data<=current.data && current.left != null){
            compare(x,current.left);
       }
       else if(x.data<=current.data && current.left == null){
           current.left = x;
       }
        else if (x.data>current.data && current.right != null){
            compare(x, current.right);
        }
        else if(x.data>current.data && current.right == null){
            current.right = x;
        }
    }
    
    public void oneChildShow(){
        System.out.print("One Child Nodes = ");
        findChild(root);
        System.out.println("");
    }
    public void findChild(BNode n){
        if(n != null){
            if(n.left!= null && n.right == null){
                System.out.print(n.data);
            }
            if(n.right!= null && n.left == null){
                System.out.print(n.data);
            }
            if(n.left != null){
                findChild(n.left);
            }
            if(n.right != null){
                findChild(n.right);
            }
        }
    }
    
    public int CountEmpty(){
        numEmpty = 0;
        findEmpty(root);
        return numEmpty;
    }
    public void findEmpty(BNode n){
        if(n != null){
            if(n.right == null){
                numEmpty++;
            }
            if(n.left== null){
                numEmpty++;
            }
            if(n.left != null){
                findEmpty(n.left);
            }
            if(n.right != null){
                findEmpty(n.right);
            }
        }
    }
    
    public int findDuplicateDepth(){
        dupDepth = 0;
        int depth = 1;
        if(root.left!=null){
            compareDuplicate(root.left, depth);
        }
        if(root.right!=null){
            compareDuplicate(root.right, depth);
        }
        return dupDepth;
    }
    public void compareDuplicate(BNode current, int depth){
        if(current != null){
            if(current.data == root.data){
                if(dupDepth < depth){
                    dupDepth= depth;
                    //System.out.println(current.data+" "+ depth);
                }
            } 
            if(current.left != null){
                int x = depth + 1;
                compareDuplicate(current.left, x);
            }
            if(current.right != null){
                int x = depth + 1;
                compareDuplicate(current.right, x);
            }
        }
    }
}