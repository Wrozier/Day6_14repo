package inheritance;

public class TestPets {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog.speak()); //from superclass Pet
		System.out.println(myDog.fetch());
		
		
		Cat myCat = new Cat();
		System.out.println(myCat.speak());// From cat class
		//System.out.println(myCat.fetch()); //not defined in Cat
		
		//Cat myBird = new Bird();
		//System.out.println(myBird.speak());

	}

}
