package drivePractice09Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int selectNum = 0;
		int selectCat;

		//猫リストの作成
		List<Cat> cats = new ArrayList<>();

		while (selectNum != 3) {
			System.out.print("***Cat Collection***\n"
					+ "1.Collect 2.Play 3.End >");

			selectNum = new Scanner(System.in).nextInt();

			switch (selectNum) {
			case 1:
				char catType = respornCatType(); //AorBorCランダム生成メソッド
				String catName = catNaming(); //猫の名付けメソット
				cats.add(new Cat(catType, catName)); //生成猫をリストイン
				break;

			case 2:
				//猫を所有していなければPlay不可
				if (cats.isEmpty()) {
					System.out.println("You do not have anyone to play with.");
					break;
				}

				//forで猫リストの一覧表示
				for (Cat c : cats) {
					System.out.println(c.toString());
				}

				//遊ぶ猫を選択 > 猫遊びメソッド
				System.out.print("Who do you play with?>");
				selectCat = new Scanner(System.in).nextInt();
				cats.get(selectCat).play();
				break;

			case 3:
				System.out.println("Game over");
				return;
			}
		}
	}

	public static char respornCatType() {
		char[] typePattern = { 'A', 'B', 'C' };
		int respornType = new Random().nextInt(3);
		char catType = typePattern[respornType];
		System.out.println(catType + "-type cat appeared!");
		return catType;
	}

	public static String catNaming() {
		System.out.print("Please name this cat >");
		String inputName = new Scanner(System.in).nextLine();
		System.out.println("\"" + inputName + "\" joined!");
		return inputName;
	}
}
