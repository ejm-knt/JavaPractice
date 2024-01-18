package testCode02;

public class HeroMoneyTest {

	public static void main(String[] args) {
		Hero h1 = new Hero("財布1", 100);
		Hero h2 = new Hero("財布2", 100);

		h1.money += 100;
		h2.money += 100;
		Hero.money += 100;

		System.out.println(h1.money);

		System.out.println(h2.money);

		System.out.println(Hero.money);
		
		System.out.println((int)(Math.random() * 1000));
	}

}
