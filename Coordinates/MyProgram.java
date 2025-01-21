public class MyProgram
{
    public static void main(String[] args)
    {
        Coordinate pointA = new Coordinate(3,4);
        //no constructor is called yet.
        Coordinate pointB;
        // constructor is called when we use
        // new keyword
        pointB = new Coordinate(-2,3);
        System.out.println(pointB.toString());
        
        pointA.dilate(4);
        System.out.println(pointA.toString());
       // System.out.println("# of points: " + Coordinate.getCount());
        Coordinate pointC = pointA.copyPoint();
        System.out.println(pointC);
        

        Coordinate pointD = new Coordinate(pointA.getX(),pointA.getY());
        Coordinate pointE = pointB;
        
        pointD.add(5);
        System.out.println(pointD);
        
        if (pointD.getX()>10){
            pointD.add(4);
        }
        else
            pointD.add(pointA);
            
       System.out.println(pointD.toString());
       
       Coordinate pointF = new Coordinate();
       System.out.println(pointF.toString());
       pointF.reflectOverY();
       
      // System.out.println("# of points: " + Coordinate.getCount());
       System.out.println("Maximum size of coordinate: " + Coordinate.MAX_SIZE);
       // line 41 gives an error so it is commented out.
       // int x = Coordinate.counter;
       System.out.println("counter " + Coordinate.getCount());
       

       
       
    }
}