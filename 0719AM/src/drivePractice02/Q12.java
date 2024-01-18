package drivePractice02;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		/*	「Q12」クラスを作成し、
			１～１００の乱数を100個作りその中に77があるかを探索する。
			あれば、その最初のインデックスを表示し、なければ「含まれていない」と表示する。
			[実行例]
			インデックス52が77です
		 */
		
		int generateNum  = 10;	// 生成する乱数の総数
		int searchNum 	 = 7;	// 乱数内で探す数
		
		int [] indexNums = new int [generateNum];
		
		// 配列内で使用
		int count = 0;
		
		// 乱数生成用
		for (int i = 0 ; i < indexNums.length; i++) {
			indexNums[i] = new java.util.Random().nextInt(generateNum)+1;
		}
		
		// デバック用
		System.out.println(Arrays.toString(indexNums));
		
		// 
		for (int i = 0 ; i < indexNums.length; i++) {
			count++;
			
			if (indexNums[i] == searchNum) {
				System.out.println("インデックス"+ count + "が" + searchNum + "です。");
				break;
			}

			if (count == generateNum) {
				System.out.println("含まれていない。");
			}
		}
		
		/* 失敗作：冗長すぎる
		int generateNum = 10; 				// 発生させる乱数の総数
		int[] nums = new int [generateNum]; // [乱数]個分が入る配列
		int flag   = generateNum+1;			// [乱数]個が関与しない数をフラグとして設定
		
		int search = 7;						//検索したい数
		int random = 0; 					//for内で乱数を発生させたいので先に宣言
		
		
		for (int i = 0 ; i < nums.length;i++) {
			random = new java.util.Random().nextInt(generateNum)+1;
			
			// flag が 初期化された数 でなければ作動。
			if (flag != generateNum+1) {
				random = new java.util.Random().nextInt(generateNum)+1;
				nums[i] = random;
				
			} else {
				// 検索したい数 が 乱数 だった場合、flag に i を代入させる
				// 乱数出ない場合は通常作動
				if (random == search) {
					flag = i;
					nums[i] = random;
					System.out.println(flag); //デバック用
				} else {
					nums[i] = random;
				}
			
			}
		}
		
		//デバック用
		System.out.println(Arrays.toString(nums));
		
		if (flag != generateNum+1) {
			System.out.println("インデックス"+ (flag+1) +"が"+ search +"です");				
		} else {
			System.out.println("含まれていません。");
		}
		*/
		
	}

}

