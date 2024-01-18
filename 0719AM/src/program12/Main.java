package program12;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard("ウィザえもん",100,100);
		Character c = w;
		Matango m = new Matango(100,'A');
		
		w.attack(m);
		w.fireball(m);
		
		c.name = "アサカ";
		c.attack(m);
		w.fireball(m);
	}
	

}
