import java.util.*;
public class BListDepth extends BList{
    private int maxDepth;
    private BNodeDepth rootWithDepth;
    private int IPL; 
    private int EPL;
    public BListDepth(ArrayList <Integer> list){
        super();
        for(int i = 0;i<list.size();i++){
            BNodeDepth x = new BNodeDepth(list.get(i), 0);
            int d = 0;
            if(rootWithDepth == null){
                rootWithDepth = x;
            }
            else{
                compare(x, rootWithDepth, d);
            }
        }
        maxDepth = 0;
        maxDepth = getMaxDepth();
        IPL = 0;
        EPL = 0;
    }
    public void compare(BNodeDepth x, BNodeDepth current, int d){
       if(x.value<=current.value && current.leftD != null){
            d++;
            compare(x,current.leftD, d);
            
       }
       else if(x.value<=current.value && current.leftD == null){
           x.depth = d+1;
           current.leftD = x;
           
       }
        else if (x.value>current.value && current.rightD != null){
            d++;
            compare(x, current.rightD, d);
        }
        else if(x.value>current.value && current.rightD == null){
            x.depth = d+1;
            current.rightD = x;
            
        }
    }
    public void print(BNodeDepth n){
        //System.out.println("check 1.1");
        if(n != null){
           // System.out.println("check 1.2:" + n.left.value);
            if(n.leftD != null){
                print(n.leftD);
               // System.out.println("check 1.3");
            }
            System.out.println(n);
            
            if(n.rightD != null){
                print(n.rightD);
            }
        }
    }
    public boolean show(){
        //System.out.println(root.value);
        print(rootWithDepth);
    //System.out.println("HI");    
        return true;
    }
    public int getMaxDepth(){
        compareDepth(rootWithDepth);
        return maxDepth;
    }
    public void compareDepth(BNodeDepth current){
        if(current != null){
           // System.out.println("check 1.2:" + n.left.value);
            if(current.depth > maxDepth){
                maxDepth = current.depth;
                //System.out.println("check" + current);
            }
            if(current.leftD != null){
                compareDepth(current.leftD);
               // System.out.println("check 1.3");
            }
            if(current.rightD != null){
                compareDepth(current.leftD);
            }
        }
    }
    public void nodeAtDepth(int d){
        if(d > getMaxDepth()){
            System.out.println("No nodes at that depth");
        }
        else{
            findNode(rootWithDepth, d);
        }
        
    }
    public void findNode(BNodeDepth current, int d){
        if(current != null){
            if(current.depth == maxDepth){
                System.out.println(current);
            }
            if(current.leftD != null){
                findNode(current.leftD, d);
               // System.out.println("check 1.3");
            }
            if(current.rightD != null){
                findNode(current.leftD, d);
            }
        }
    }
    public void calcIPL(){
        IPL = 0; 
        addIPL(rootWithDepth);
        System.out.println("The IPL is : " + IPL);
    }
    public void addIPL(BNodeDepth current){
        if(current != null){
           // System.out.println("check 1.2:" + n.left.value);
            if(current.leftD != null){
                addIPL(current.leftD);
               // System.out.println("check 1.3");
            }
            IPL += current.depth;
            
            if(current.rightD != null){
                addIPL(current.rightD);
            }
        }
        
    }
    public void calcEPL(){
        EPL = 0;
        if(rootWithDepth != null){
            addEPL(rootWithDepth);
            System.out.println("The EPL is : " + EPL);
        }
        else{
            System.out.println("The EPL is : null 0");
        }
    }
    public void addEPL(BNodeDepth current){
        if(current != null){
           
            if(current.leftD != null){
                addEPL(current.leftD);
            }
            else{
                EPL += current.depth + 1; 
            }
            if(current.rightD != null){
                addEPL(current.rightD);

            }
            else{
                EPL += current.depth + 1; 
            }
        }
        
    }
    
}