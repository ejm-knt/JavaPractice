package drivePractice07Q1;

public class Sunflower extends Plant{
	
	public Sunflower(String name , String color) {
		super (name , color);
	}
	
	public void live() {
		System.out.println(this.name + "は太陽の方角を向いて光合成をして生きる");
	}
}
