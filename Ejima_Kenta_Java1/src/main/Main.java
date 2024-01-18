package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		boolean shutDown = false; //trueでループ終了
		int select;
		
		while (shutDown == false) {
			System.out.println("HighAndLowGameを遊びますか？");
			System.out.print("1.はい 2.いいえ(数字で入力)>");
			select = new java.util.Scanner(System.in).nextInt();
			System.out.println("");
			
			// 1と2以外選択で再ループしてエラー回避
			if (select == 1) {
				highAndLow();
				System.out.println("");
			} else if (select == 2) {
				shutDown = true;
				System.out.println("終了します。");
			} else {
				continue;
			}
		}

	}
	
	public static void highAndLow() {

		int[] number = new int[13];
		boolean high = false;
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		
		System.out.println(Arrays.toString(number));
		
		int random = new java.util.Random().nextInt(13);
		int player = number[random];
		
		System.out.println("あなたの数字は"+ player +"です。");
		
		random = new java.util.Random().nextInt(13);
		int enemy  = number[random];
		
		System.out.println("1.High 2.Low(数字で入力)>");
		int select = new java.util.Scanner(System.in).nextInt();
		System.out.println("");
		
		System.out.println("相手の数字は"+ enemy +"です。");
		
		// 勝利条件：P < E の時、High(1) 選択
		if (player < enemy && select == 1) {
			high = true;
		}
		
		// 勝利条件：P > E の時、Low(2) 選択
		if (player > enemy && select == 2) {
			high = true;
		}
		
		if (high == true) {
			System.out.println("あなたの勝ち!!");
		} else {
			System.out.println("あなたの負け!!");
		}
		
	}

}
