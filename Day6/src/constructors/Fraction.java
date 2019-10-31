package constructors;
/**
 * Returns the sum of this Fraction
 *  and the parameter fraction. The sum
 *  returned is Not simplified.
 *  
 *  @param frac the frac to add to this fraction
 *  
 *  @return the sum of this frac.
 *  
 *  
 *  Class that represents a fraction
 *  @author William
 *  */
public class Fraction {
	private int numerator = 0;
	private int denominator = 1;
	
	/** 
	 * Default constructor. creates 0/1
	 */
	public Fraction() {
		//creates 0/1
		this(0,1);
	}
	/** 
	 * Default constructor. creates number/1
	 */
	public Fraction(int number) {
		//creates number/1
		this(number, 1);
	}
	/** 
	 * Default constructor. creates a copy constructor
	 */
	public Fraction(Fraction frac) {
		//copy constructor
		this(frac.getNumerator(), frac.getDenominator());
	}
	/** 
	 *  Creates two int @param
	 */
	public Fraction(int num, int denom) {
		this.setNumerator(num);
		this.setDenominator(denom);
	}
	/** 
	 * Getter for Numerator
	 *  @returns numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	/** 
	 * Setter for Numerator
	 *  @returns denominator
	 */
	public void  setNumerator(int num) {
		this.numerator = num;
	}
	/** 
	 * Setter for Denominator
	 *  @returns denominator
	 */
	public void setDenominator(int denom) {
		this.denominator = denom;
	}
	/**
	 * Getter for Denominator 
	 *  @returns denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	/** 
	 * Computes Fraction
	 *  @returns the result of division
	 */
    public int compute() {
    	return numerator/ denominator;
    }
}
