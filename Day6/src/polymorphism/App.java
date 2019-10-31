package polymorphism;

public class App {

	public static void main(String[] args) {
		Pet pet = new Pet();
		System.out.println(pet.speak());
		
		 pet = new Cat();
		System.out.println(pet.speak());
		
		 pet = new Dog();
		System.out.println(pet.speak());
		
		
		pet = new Bird();
		System.out.println(pet.speak());
		
		if( pet instanceof Cat ) {
			System.out.println("pet is instance of Cat");
			System.out.println("get class : " + pet.getClass().getName());
		}
		if( pet.getClass().getName().equals("polymorphism cat")) {
			System.out.println("pet is instance of Cat");
		}
		pet = new Dog();
		System.out.println(pet.speak());
		
		if(pet instanceof Dog) {
			System.out.println(pet.speak());
		}
		
	

	}

}
