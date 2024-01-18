package main;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		animals[0] = new Dog("ポチ", 15, "土佐犬");
		animals[1] = new Cat("タマ", 10, "スコティッシュフォールド");
		animals[2] = new Dog("ジョセフィーヌ", 3, "トイプードル");
		animals[3] = new Cat("絹江", 5, "スフィンクス");
		animals[4] = new Dog("獅子丸", 7, "チャウチャウ");

		try {
			for (Animal i : animals) {
				i.showProfile();
				i.cry();

				if (i instanceof Cat) {
					((Cat) i).nails();
				}
			}
		} catch (ClassCastException e) {
			System.out.println("要素の中身がCatインスタンスではないので例外です。");
			e.printStackTrace();
		}

	}

}
