package drivePractice07Q1;

public abstract class Plant implements Creature{
	String name;
	String color;
	
	public Plant (String name , String color) {
		this.name = name ;
		this.color = color ;
	}
	
	
	
	public void makeFlowers() {
		System.out.println(this.name + "は" + this.color + "色の花を咲かせる");
	}
}
