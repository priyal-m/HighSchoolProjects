public class Tree {
    private Node root;

    public Tree (int num){
        root = new Node (num);
        buildTree();
    }   
    
    private boolean isItPrime(int x){
        for(int i=2; i< x; i++){
            if(x%i == 0){
                 return false;
            }
        }
        return true;
        
    }
        
    // returns the smallest factor of x.    
    private int findFactor (int x) {
        for(int i=2; i< x; i++){
            if(x%i == 0){
                 return i;
            }
        }
        return x;
    }
    public void buildTree (){
        int fact = 0;
        int num = root.getData();
        
        if (!isItPrime(num)){
            fact = findFactor(num);
            root.addLeft(addNode (fact));
            root.addRight(addNode(num/fact));
        }
    }
    
    public Node addNode (int fact){
        Node newFactor = new Node(fact);
        if(isItPrime(fact) == true)
            return newFactor;
        else{
            int num = findFactor(fact);
            newFactor.addLeft(addNode(num));
            newFactor.addRight(addNode(fact/num));
            return newFactor;
        }
            
    }
    public void printTree(){
            print(root);
        
    }
    
    // recursive print.
    // check left, print, check right
    public void print(Node n){
        if(n.getLeft() == null){
            System.out.println(n);
        }
        else{
            print(n.getLeft());
            System.out.println(n);
            print(n.getRight());
            
        }
        
    }
    
}