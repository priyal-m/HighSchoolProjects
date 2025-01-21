public class Line {
    private Coordinate A;
    private Coordinate B;
    
    public Line(){
        Coordinate A = new Coordinate(0,0);
        Coordinate B = new Coordinate(1,1);
    }
    
    public Line(int x1, int y1, int x2, int y2){
        Coordinate A = new Coordinate(x1,y1);
        Coordinate B = new Coordinate(x2,y2);
    }
    
    public String toString(){
        String out = A.toString() + " "+ B.toString();
        return out;
    }
    
    public double distance (){
        double distance = Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2)); 
        return 0;
    }
    public double findSlope(){
        double slope = (double)(B.getY()-A.getY())/(double)B.getX()-A.getX();
        return 0;
    }
}