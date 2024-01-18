package drivePractice08Q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int selectNum = 0;
		double amountOfWater;
		Pool pool = new Pool();

		while (selectNum != 4) {
			System.out.println("----------------------------------------------------\n"
					+ "1.給水  / 2.排水  / 3.表示  / 4.終了\n"
					+ "");

			selectNum = new Scanner(System.in).nextInt();

			switch (selectNum) {
			case 1:
				System.out.println("給水する水量を入力して下さい");
				amountOfWater = new Scanner(System.in).nextInt();

				if (amountOfWater <= 0) {
					System.out.println("給水量は正の値をいれてください。");
				} else {
					pool.feedWater(amountOfWater);
				}
				break;

			case 2:
				System.out.println("排水する水量を入力して下さい");
				amountOfWater = new Scanner(System.in).nextInt();

				if (amountOfWater <= 0) {
					System.out.println("排水量は正の値をいれてください。");
				} else {
					pool.drainWater(amountOfWater);
				}
				break;

			case 3:
				pool.display();
				break;

			case 4:
				System.out.println("アプリケーションを終了します。");
				return;
				
			}
		}
	}
}
