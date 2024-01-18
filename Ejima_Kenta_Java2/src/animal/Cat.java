package animal;

import interFace.Felidae;

public class Cat extends Animal implements Felidae {

	public Cat(String name, int age, String breed) {
		super(name, age, breed);
	}

	public void cry() {
		System.out.println("ニャー");
	}

	public void nails() {
		System.out.println(this.getName() + "は爪を研いだ");
	}
}
