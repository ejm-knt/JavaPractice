package program11;

public class Main {

	public static void main(String[] args) {
		
		Hero h		= new Hero("テストくん");
		Dancer d	= new Dancer("踊ってない夜を知らない女");
		Matango m	= new Matango(100);
		
		h.attack(m);
		System.out.println(m.hp);
		
		d.attack(m);
		System.out.println(m.hp);
		
		d.dance();
	}

}
