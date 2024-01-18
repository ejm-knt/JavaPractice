package main;

import java.util.Arrays;

public class Main02 {

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
				gameBody();
				System.out.println("");
			} else if (select == 2) {
				shutDown = true;
				System.out.println("終了します。");
			} else {
				continue;
			}
		}

	}
	
	public static int[] createCard() {
		int[] number = new int[13];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		System.out.println(Arrays.toString(number));
		return number;
	}
		
	public static void gameBody() {
		int playerCoin = 10;
		boolean gameOver = false;
		boolean high = false;
		int[] number = createCard();
		int[] haveNumber = new int[3];
		int count = 0;
		
			while(gameOver == false) {
				while(count < 10) {
					
					System.out.println("難易度は普通？難しい？(残り回数:"+ (10 - count) +"回");
					System.out.println("※「難しい」と得る/失うコインは2倍。ただし、配られるカードが6,7,8。");
					System.out.println("");
					
					System.out.print("1.普通 2.難しい 3.ゲームをやめる(数字で入力)>");
					int modeAndRate = new java.util.Scanner(System.in).nextInt(); //1:通常 2:ハード 3:終了
								
						switch (modeAndRate) {
							case 1:
								normalMode(number, haveNumber);
								highAndLow(haveNumber);
								playerCoin += result(isWin(haveNumber));
								System.out.println("現在の所持金 >" + playerCoin);
								count++;
								break;
							
							case 2:
								hardMode(number, haveNumber);
								highAndLow(haveNumber);
								playerCoin += result(isWin(haveNumber)) * 2;
								System.out.println("現在の所持金 >" + playerCoin);
								count++;
								break;
							
							case 3:
								gameOver = true;
								break;
								
							default:
								continue;
						}
					
						if(playerCoin==0||count == 10){
							System.out.println("ゲームオーバー");
							gameOver = true;
						}
					
				}
			}
		}
		
	public static void normalMode(int[] number , int[] haveNumber){
		int random = new java.util.Random().nextInt(13);
		int player = number[random];
		
		System.out.println("");
		System.out.println("難易度 普通 でプレイ");
		System.out.println("あなたの数字は"+ player +"です。");
		
		random = new java.util.Random().nextInt(13);
		int enemy  = number[random];
		
		haveNumber[0] = player;
		haveNumber[1] = enemy;
	}
	
	public static void hardMode(int[] number , int[] haveNumber){
		int random = new java.util.Random().nextInt(3)+5;
		int player = number[random];
		System.out.println("");
		System.out.println("難易度 難しい でプレイ");
		System.out.println("あなたの数字は"+ player +"です。");
		
		random = new java.util.Random().nextInt(13);
		int enemy  = number[random];
		
		haveNumber[0] = player;
		haveNumber[1] = enemy;
	}
	
	public static void highAndLow(int[] haveNumber) {
		System.out.print("1.High 2.Low(数字で入力)>");
		int select = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("");
		
		System.out.println("相手の数字は"+ haveNumber[1] +"です。");
		
		haveNumber[2] = select;
	}
	
	public static boolean isWin (int[] haveNumber) {
		boolean high = false;
		System.out.println(Arrays.toString(haveNumber));
		
		// 勝利条件：P < E の時、High(1) 選択
			if (haveNumber[0] < haveNumber[1] && haveNumber[2] == 1) {
				high = true;
			}
			
			// 勝利条件：P > E の時、Low(2) 選択
			if (haveNumber[0] > haveNumber[1] && haveNumber[2] == 2) {
				high = true;
			}
			
			return high;
	}
	
	public static int result (boolean high) {
		int tempCoin = 0;
		
		if (high == true) {
			System.out.println("あなたの勝ち!!");
			System.out.println("所持金が追加されます。");
			System.out.println("");
			tempCoin += 1;
		} else {
			System.out.println("あなたの負け!!");
			System.out.println("所持金が没収されます。");
			System.out.println("");
			tempCoin -= 1;
		}
		
		return tempCoin;
	}

}


