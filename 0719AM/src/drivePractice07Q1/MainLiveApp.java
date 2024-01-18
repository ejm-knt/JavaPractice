package drivePractice07Q1;

public class MainLiveApp {

	public static void main(String[] args) {
		/*
		Animal[] animals = new Animal[2];
		animals[0] = new Dog("柴犬","わんわん");
		animals[1] = new Cat("タマ","にゃーにゃー");
		
		System.out.println("動物でまとめた処理");
		System.out.println("");
		
		for(Animal a : animals) {
			a.bark();
		}
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("");
		
		Plant[] plants = new Plant[2];
		plants[0] = new Rose("薔薇","赤");
		plants[1] = new Sunflower("ひまわり","黄"); 
		
		System.out.println("植物でまとめた処理");
		System.out.println("");
		
		for(Plant p : plants) {
			p.makeFlowers();
		}
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("");
		
		Creature[] creature = new Creature[4];
		creature[0] = animals[0];
		creature[1] = animals[1];
		creature[2] = plants[0];
		creature[3] = plants[1];
		
		System.out.println("生き物でまとめた処理");
		System.out.println("");
		
		for (Creature c : creature) {
			c.live();
		}
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		*/
		
		
		// 佐々木先生Ver
		Dog dog = new Dog("柴犬","わんわん");
		Cat cat = new Cat("タマ","にゃーにゃー");
		Rose rose = new Rose("薔薇","赤");
		Sunflower sunflower = new Sunflower("ひまわり","黄");
		
		Animal[] animals = {dog,cat};
		Plant[] plants = {rose,sunflower};
		Creature[] creatures = {dog,cat,rose,sunflower};
		
		for(Animal a : animals) {
			a.bark();
		}
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("");
		
		for(Plant p : plants) {
			p.makeFlowers();
		}
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("");
		
		for(Creature c : creatures) {
			c.live();
		}
	}

}
