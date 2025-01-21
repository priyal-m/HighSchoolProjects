/** 
 * The coordinate class represents a point on the
 * coordinate plane. (x,y) is an ordered pair
 * @author Mrs. Kubik
 */
public class Coordinate {
    private int x;
    private int y;
    private static int counter = 0;
    public static final int MAX_SIZE = 100;
    
    /* default constructor */
    public Coordinate (){
        x = 0;
        y = 0;
        counter++;
        //this(0,0);
    }
    
    /* specific constructor */
    public Coordinate (int x, int y){
        this.x = x;
        this.y = y;
        counter++;
    }
    
    public static int getCount (){
        return counter;
        
    }
    
    // mutator
    public void setCoordinate(int a, int b){
        x = a;
        y = b;
    }
    
    //accessor methods.
    public int getX() {return x;}
    public int getY() {return y;}
    
    // precondition scaleFactor>1 or <-1
    public void dilate (int scaleFactor){
        x*=scaleFactor;
        y*=scaleFactor;
    }
    
    //overloaded add method
    public void add(Coordinate b1){
        x += b1.x;
        y += b1.y;
        //y += b1.getY();
    }
    
    public void add(int offSet){
        x+=offSet;
        y+=offSet;
    }
        
    public Coordinate copyPoint(){
        Coordinate temp = new Coordinate(x,y);
        return temp;
       // return new Coordinate (x,y);
    }
    @Override
    public String toString(){
       // String output = "(" + x + "," + y + ")";
        String output = String.format ( "(%d,%d)", x, y);
        return output;
    }
      
        
    public double magnitude(){
        double x2 = Math.pow(x,2);
        double y2 = Math.pow(y,2);
        return (Math.sqrt(x2+y2));
    }
        
    public void reflectOverY(){
        x = x * -1;
        System.out.println("roy" + this.toString());
    }

}