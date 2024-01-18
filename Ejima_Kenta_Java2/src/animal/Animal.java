package animal;

public abstract class Animal {
	private String name;
	private int age;
	private String breed;

	public Animal(String name, int age, String breed) {
		setName(name);
		setAge(age);
		setBreed(breed);
	}

	public void showProfile() {
		System.out.print("名前：" + this.getName() + " ");
		System.out.print("年齢：" + this.getAge() + " ");
		System.out.print("種族：" + this.getBreed() + " ");
	}

	public abstract void cry();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
