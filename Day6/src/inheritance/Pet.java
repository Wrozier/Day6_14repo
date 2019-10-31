package inheritance;

public class Pet {
  private String name;
  
  
    public Pet() {
    	setName("Unkown Pet");
    }
    public String getName() {
    	return name;
    }
    public void setName(String name ) {
    	this.name = name;
    }
    public String speak() {
    	return "Im your cuddly little pet.";
    }
}
