//Priyal Mangla
//Sept 12
//Classes Review
import java.util.*;
public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to create a triangle or pyramid?");
        String classType = input.next();
        if(classType.equals("pyramid")){
            System.out.println("Would you like to enter your own values? (Y/N)");
            String letter = input.next();
            if(letter.equals("Y")){
                System.out.println("Input three values: (base, height, number of sides)");
                Pyramid p1 = new Pyramid(input.nextInt(),input.nextInt(), input.nextInt());
                System.out.println(p1);
            }else{
                Pyramid p1 = new Pyramid();
                System.out.println(p1);
            }
            
        }
        else{
            System.out.println("Would you like to enter your own values? (Y/N)");
            String letter = input.next();
            if(letter.equals("Y")){
                System.out.println("Input two values: (base, height)");
                IsoTri p1 = new IsoTri(input.nextInt(),input.nextInt());
            }else{
                IsoTri p1 = new IsoTri();
                System.out.println(p1);
            }
        }
        
    }
}

class IsoTri{
    private int base;
    private int height;
    
    public IsoTri(){
        base = 0;
        height = 0;
    }
    public IsoTri(int b, int h){
        base = b;
        height = h;
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    public void setBase(int b){
        base = b;
    }
    public void setHeight(int h){
        height = h;
    }
    public double triArea(){
        double area = (int)(0.5 * base * height*100);
        area = area/100.0;
        return area;
    }
    public String toString(){
        return ("The triangle has a height of "+ height+ " and a base length of " + base + ". The area of the triangle is "+ triArea());
    }
}

class Pyramid extends IsoTri{
    private int sides;
    public Pyramid(){
        super();
        sides = 0;
    }
    public Pyramid(int b, int h, int s){
        super(b,h);
        sides = s;
    }
    public void setSides(int s){
        sides = s ;
    }
    public double polygonArea(){
        double apothem = getBase() /(2.0 * Math.tan(Math.PI/sides));
        double area =(int) (0.5 * sides *getBase()*apothem +100);
        area = area/100.0;
        return area;
    }
    public double surfaceArea(){
        double surfaceArea = polygonArea() + (sides*triArea());
        return surfaceArea;
    }
    public String toString(){
        return (super.toString() + ". The pyramid has " + sides + " sides and a surface area of "+ surfaceArea() +". The area of the base of the pyramid is " + polygonArea() );
    }
}