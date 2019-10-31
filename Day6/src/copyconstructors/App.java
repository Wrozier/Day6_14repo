package copyconstructors;

public class App {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		
		//Create c2 o=based off c1
		Complex c2 = new Complex(c1);
		
		//Note that the following doesn't involve a copy constructor call as
		// non-primitive variables are just reference.
		
		Complex c3 = c2;
		if(c1.equals(c2)) {
			System.out.println("c1 equals c2");
		}else {
			System.out.println("c1 is NOT equal to c2");
		}
		
		if (c1==c2) {
			System.out.println("c1 == c2");
		} else {
			System.out.println("c1 != c2");
		}
		System.out.println(c2);
		

	}

}
