package program08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		Hero h = new Hero();
//		h.name = "みなと";
//		h.hp = 100;
//		
//		Matango m1 = new Matango();
//		m1.hp = 50 ;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m1.hp = 48 ;
//		m1.suffix = 'B';
//		
//		System.out.println("勇者"+ h.name +"を生み出しました！");
//		
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();
		
		Cleric c = new Cleric();
		
		c.name = "クレ子";
		c.mp = 10;
		int sec = new Random().nextInt(5)+1;
		
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.pray(sec);
		c.pray(sec);
		c.selfAid();
	}

}
