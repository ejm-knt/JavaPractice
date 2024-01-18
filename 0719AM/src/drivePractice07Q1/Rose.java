package drivePractice07Q1;

public class Rose extends Plant{
	
	public Rose(String name , String color) {
		super (name , color);
	}
	
	public void live() {
		System.out.println(this.name + "は光合成して生きる");
	}
}
