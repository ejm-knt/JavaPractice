package animal;

public class Dog extends Animal {

	public Dog(String name, int age, String breed) {
		super(name, age, breed);
	}

	public void cry() {
		System.out.println("わんわん");
	}

}
