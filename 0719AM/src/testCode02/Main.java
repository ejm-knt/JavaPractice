package testCode02;

public class Main {
	
	public static void main(String[] args) {
		Coffee c = new Coffee("タリーズ",100,"うまい");	
		
		attack(c);
	}	
	
	public static void attack(Drink d) {
		System.out.println(d.name + "の攻撃！");
		System.out.println(d.price);
	}

}
