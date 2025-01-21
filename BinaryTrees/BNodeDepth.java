public class BNodeDepth extends BNode{
    int depth;
    BNodeDepth leftD,rightD;

    BNodeDepth(int v, int d){
        super(v);
        depth = d;
        leftD = null;
        rightD = null;
    }
    
    public String toString(){
        String s = value + " - " + this.depth;
        return s;
    }
}