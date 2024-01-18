package program12;

public class Main03 {

	public static void main(String[] args) {
		Character[] c = new Character[5];
		
		c[0] = new Hero("^-^",10);
		c[1] = new Hero("^_^",10);
		c[2] = new Thief("^-^;",10);
		c[3] = new Wizard("^v^",10,10);
		c[4] = new Wizard("^o^",10,10);

		for (Character ch : c) {
			ch.hp += 50;
		}
	}
}
