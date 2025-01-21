public class ComplexNum implements Comparable<ComplexNum>{
	private double real; // real part
	private double imag; //imaginary part
	private double r;
	private double theta;
	
	//default constructor.
	//set real = imag = 0;
	public ComplexNum()
	{
		real = 0;
		imag = 0;
	}
	
	//specific constructor
	//use this. keyword to set private variables
	//set r and theta by using polarize method
	public ComplexNum(double real, double imag)
	{
	    this.real = real;
	    this.imag = imag;
	    polarize();
	}
	
	// return the real part
	public double getReal(){
		return real;
	}
	
	// return the imaginary part
	public double getImag(){
		return imag;
	}
	
	//add a complex number to this
	//complex number. return a ComplexNum
	public ComplexNum plus(ComplexNum a)
	{	
		double newReal = real+ a.getReal();
		double newImag = imag + a.getImag();
		return new ComplexNum(newReal,newImag);

	}
	
	//subtract the passed object from the calling object
	// return a complex number.
	public ComplexNum minus(ComplexNum a)
	{
	    double newReal = real - a.getReal();
		double newImag = imag - a.getImag();
		return new ComplexNum(newReal,newImag);
		
	}
	
	// multiply the passed object by the calling object
	// return an object that is a complex number
	public ComplexNum times (ComplexNum a)
	{
		double newReal =(real * a.getReal()) + (imag * a.getImag() * -1); 
		double newImag = (real * a.getImag()) + (imag *a.getReal());

		return new ComplexNum(newReal,newImag);
	}
	
	// return the complex conjugate of the object
	// return an object that is a complex number
	public ComplexNum conjugate()
	{
	    double newImag = -1 * imag;
	    return new ComplexNum(real,newImag);
		
	}
	
	// return the rationalized version of this 
	// complex number.
	// 1/(a+bi) where a+bi is the current object
	public ComplexNum rationalize()
	{
	    double newReal = real/ (Math.pow(real,2) + Math.pow(imag,2));
	    double newImag = (-1* imag)/ (Math.pow(real,2) + Math.pow(imag,2));
	    return new ComplexNum(newReal,newImag);


	}
	
	// calculate r and theta given a and b
	public void polarize()
	{
	    theta = Math.atan2(imag, real);
		r = Math.hypot(real,imag);
	
	}
	
	//used to see if two complex numbers are equal
	// two complex numbers are equal if their real parts
	// and imaginary parts are equal.
	public boolean equals (ComplexNum second){
	    if(Math.abs(r-second.r)<.01){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	
	@Override
	public int compareTo(ComplexNum second){
		if(this.equals(second)){
		    return 0;
		}
		else if(r>second.r){
		    return 1;
		}
		return -1;
		
		
	}
	
	// write code here to return a string
	// in the form a + bi
	public String toString(){
	
	String output = String.format("%.2f%+.2fi",real,imag);
	return output;
	}
}