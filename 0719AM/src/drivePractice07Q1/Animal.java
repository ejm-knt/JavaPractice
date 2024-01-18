package drivePractice07Q1;

public abstract class Animal implements Creature{
	String name;
	String voice;
	
	public Animal(String name , String voice) {
		this.name = name;
		this.voice = voice;
	}
	
	
	
	public void bark() {
		System.out.println(this.name + "は" + this.voice);
	}
}
