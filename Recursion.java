//Priyal Mangla
//March 11, 2022
// allows the user to enter a value for x and returns h(x) 

public class Recursion
{
   
    public static void main(String[] args)
    {
     System.out.println(h(6));  
    }
    
     public static double h(double x){
        double output;
        if(x > 5){
           output = h(x-7) + 1 ;
        }
        else if(x < 0){
            output = h(x+3);
        }
        else{
           output = x;
        }
    System.out.println("h("+ x +") = " + output);
        return output;
    }
}