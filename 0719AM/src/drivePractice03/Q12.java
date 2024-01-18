package drivePractice03;
import java.util.Arrays;
public class Q12 {
		
//	ヒントを元に4桁の数字を当てましょう。いわゆるHit&Blowです。
//	短いターンで推理して高得点を目指せ！
//
//	【ルール】
//	・答えとなる4桁の数字（数はバラバラ）を当てればクリア
//	・桁数と数字があっている個数がHit
//	・桁数はあっていないが、数字があっている個数がBlow
//	（例：入力として"1234"、答えが「1354」の時）
//	　1桁目：入力の1が桁数、数字共に答えと同じなのでHit
//	　2桁目：入力の2は答えに含まれない、残念！
//	　3桁目：入力の3は、答えの2桁目、Blow
//	　4桁目：入力の4が桁数、数字共に答えと同じなのでHit
//	　よって、Hitが2、Blowが1、となります。
	public static void main(String[] args) {
		boolean clearFlag = false; 		// 全問正解true
		int[] ansNums = new int[4];	// 回答の配列
		int[] inputNums = new int[4];	// 回答者の配列
		int loopCount 	= 0;			// プレイ回数
		
		//冒頭説明を表示するだけのメソッド
		readMe();
		
		//乱数を生成、配列への格納
		createAns(ansNums);
		
		//全Hitするまで無限ループ
		while(clearFlag == false) {
		
			//回答者の回答入力
			playerInput(inputNums,clearFlag);
			//System.out.println("あなたの入力した数字は"+ Arrays.toString(inputNums) + "です。");
					
			loopCount++;
			
			//全Hitで(ループ)終了 + 結果発表
			if(ansJudge(ansNums , inputNums) == true) {
				System.out.println("全Hitおめでとう！！！！！！！！");
				System.out.println("記録は" + loopCount + "回でした！");
				clearFlag = true;
			} else {
				System.out.println("現在" + loopCount + "回目です！");
				System.out.println("");
			}
			
		}
	}
	
	public static void readMe() {
		System.out.println("ヒントを元に4桁の数字を当てましょう。いわゆるHit&Blowです。 \n"
				+ "短いターンで推理して高得点を目指せ！\n"
				+ "\n"
				+ "【ルール】 \n"
				+ "・答えとなる4桁の数字（数はバラバラ）を当てればクリア \n"
				+ "・桁数と数字があっている個数がHit \n"
				+ "・桁数はあっていないが、数字があっている個数がBlow \n"
				+ "\n"
				+ "	（例：入力として\"1234\"、答えが「1354」の時） \n"
				+ "	1桁目：入力の1が桁数、数字共に答えと同じなのでHit \n"
				+ "	2桁目：入力の2は答えに含まれない、残念！ \n"
				+ "	3桁目：入力の3は、答えの2桁目、Blow \n"
				+ "	4桁目：入力の4が桁数、数字共に答えと同じなのでHit \n"
				+ "	よって、Hitが2、Blowが1、となります。\n");
	}
	
	public static int[] createAns (int[] ansNums) {
		int ansNum;
		
		//乱数生成、配列格納 x4
		for (int i = 0 ; i < ansNums.length; i++) {
			ansNum = new java.util.Random().nextInt(9)+1;
			ansNums[i] = ansNum;
			}	
		
		//重複時に配列内更新
		for (int i = 0; i < ansNums.length-1; i++) {
			for (int j = i+1; j < ansNums.length; j++) {
				if (ansNums[i] == ansNums[j]) {
					//System.out.println(Arrays.toString(ansNums) + i + "&" +j +"true"); //動作確認用
					ansNum = new java.util.Random().nextInt(9)+1;
					ansNums[j] = ansNum;
					j--;
				}
			}
		}
		
		//System.out.println(Arrays.toString(ansNums));		// 動作確認用
		System.out.println("ゲームスタート！");
		
		return ansNums;
	}
	
	public static void playerInput (int[] inputNums , boolean clearFlag) {
		while (clearFlag == false) {
			System.out.println("4桁目の被らない数字を入力してください");
			
			try {
				int inputNum = new java.util.Scanner(System.in).nextInt();
				
				if (inputNum >= 1234 && inputNum < 10000) {
					String inputNumStr = Integer.toString(inputNum);
					char[] charArray = inputNumStr.toCharArray();
					System.out.println(Arrays.toString(charArray));	//動作確認用
	
					for (int i = 0 ; i < inputNums.length; i++) {
						inputNums[i] = charArray[i];
						inputNums[i] = inputNums[i] - 48;
						clearFlag = true;
					}
					
				} else {
					System.out.println("1234 ～ 9876の数字を入力してください");
				}
				
			} catch (Exception e){
				continue;
			}
		}
	
//			1桁づつ入力するタイプを実装しちゃった。見づらいので、廃止。
//			for(int i = 0 ; i < inputNums.length; i++) {
//				System.out.println((i+1) +"桁目を入力してください");
//				inputNum = new java.util.Scanner(System.in).nextInt();
//								
//				if (inputNum > 0 && inputNum < 10) {
//					inputNums[i] = inputNum;
//				} else {
//					System.out.println("1 ～ 9の数字を入力してください");
//					i--;
//				}
//			}		
//	}
	}	
	
	public static boolean ansJudge (int[] ansNums , int[] inputNums) {
		boolean check = false;
		int hit = 0;
		
		// 回答乱数と入力数字を比較
		for (int i = 0; i < ansNums.length; i++) {
			if(ansNums[i] == inputNums[i]) {
				System.out.println((i+1) + "桁目 Hit！");
				hit++;
			} else if (ansNums[0] == inputNums[i] || ansNums[1] == inputNums[i] || ansNums[2] == inputNums[i] || ansNums[3] == inputNums[i]) {
				System.out.println((i+1) + "桁目 blow！");
			} else {
				System.out.println((i+1) + "桁目に" + inputNums[i] + "は含まれません！残念！");
			}
			
			// 全Hitでループ終了
			// Hit3以下で応援文 + 再ループ
			if (hit == 4) {
				check = true;
			} else if (i == 3 && hit < 4) {
				System.out.println("全Hitじゃないのでやり直し～！ファイト！");
			}
			
		}
		return check;
	}
}

