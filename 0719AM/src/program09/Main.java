package program09;

public class Main {

	public static void main(String[] args)  {
		Hero h1 = new Hero("みなと");	
//		h1.hp = 100;
		
		Hero h2 = new Hero("みなと");
		h2.name = "あさか";
//		h2.hp = 150;
		
		Wizard w = new Wizard();
		w.name = "すがわら";
		w.hp = 50;
		
		w.heal(h1);
		System.out.println(h1.hp);
		
		w.heal(h2);
		System.out.println(h2.hp);
		
		w.heal(h2);
		System.out.println(h2.hp);
		
	}
	
	
}
