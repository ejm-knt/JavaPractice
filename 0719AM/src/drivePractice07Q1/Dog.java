package drivePractice07Q1;

public class Dog extends Animal{
	
	public Dog(String name , String voice) {
		super (name , voice);
	}
	
	public void live() {
		System.out.println(this.name + "は無邪気に生活する");
	}
	
}
