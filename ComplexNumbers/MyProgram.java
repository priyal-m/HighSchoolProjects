public class MyProgram
{
    public static void main(String[] args)
    {
        ComplexNum n1 = new ComplexNum(3.24242,-5.332424);
        
        ComplexNum n2 = new ComplexNum(3,4);
        
        ComplexNum n3;
        n3 = new ComplexNum (4,3);
        
        ComplexNum n4 = n2.minus(n1);
        
        ComplexNum n5 = n3;
        
        System.out.println("1. " + n1.toString());
        System.out.println("2. " + n4.toString());
        
        System.out.println("3. " + n3.compareTo(n3));
     
        System.out.println("4. " + n3.equals(n4));
        System.out.println("5. " + n3.equals(n5));
        
        System.out.println("6. " + n3.rationalize().toString());
        System.out.println("7. " + n5.plus(n1).toString());
        System.out.println("8. " + n3.times(n2));
        System.out.println("9. " + n3.times(n2.conjugate()).toString());
        System.out.println("10. " + n5.rationalize().toString());
        System.out.println("11. " + n2.equals(n3));
        System.out.println("12. " + n2.compareTo(n3));
        System.out.println("13. " + n2.getClass());
        System.out.println("14. " + n2.hashCode());
      
    }
}