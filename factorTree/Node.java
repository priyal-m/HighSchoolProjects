public class Node {
    private int data;
    private Node left;
    private Node right;
    
    public Node (int data){
        this.data = data;
        left = null;
        right = null;
    }
    
    public void addLeft (Node left){
        this.left = left;
    }
    public void addRight (Node right){
        this.right = right;
    }
    
    public Node getLeft() {return left;}
    public Node getRight() {return right;}
    public int getData () { return data;}
    
    public String toString(){
        return ("Data: " + data);
    }
}