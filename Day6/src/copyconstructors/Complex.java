package copyconstructors;

public class Complex {
	private double  real, imag;
	
	//A normal parameterized
	
	public Complex(double re, double in) {
		this.real = re;
		this.imag = in;
		
	}
	
	//copy constructor
	Complex(Complex c){
		System.out.println("");
		real =c.real;
		imag = c.imag;
	}
	
	@Override
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	
	//Overriding to the toString of the object class
	
	public boolean equals(Object obj) {
		if ( obj == this ) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Complex complex = (Complex) obj;
		return(this.real == complex.real && this.imag == complex.imag);
	}
}

