package drivePractice09Q1;

public class Cat {
	private char type;
	private String name;
	private int intimacy;
	
	public Cat(char type , String name) {
		this.type = type; 
		this.name = name;	//名前
		this.intimacy = 0; 	//親密度
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIntimacy(){
		return this.intimacy;
	}
	
	public void setIntimacy(int intimacy) {
		this.intimacy = this.intimacy + intimacy;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	public void play() {
		System.out.println("");
		System.out.println("Playing with \"" + this.name + "\"");
		System.out.println("...");
		System.out.println("Intimacy is up!!");
		System.out.println("");
		
		this.intimacy ++;
	}
	
	public String toString() {
		return this.name + "[" + this.type + "]" + "(" + this.intimacy + ")";
	}
	
}
