public class LineRunner {
    public static void main(String[] args) {
    Line l1 = new Line();
    Line l2 = new Line(1,2,5,7);
    Line l3 = new Line(1,4,1,10);
    
    System.out.println(l1.toString() + " " + l1.findSlope());
    System.out.println(l2.toString() + " " + l2.findSlope());
    System.out.println(l3.toString() + " " + l3.findSlope());

    }
}