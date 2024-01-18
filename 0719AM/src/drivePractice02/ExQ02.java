package drivePractice02;

import java.util.Arrays;

public class ExQ02 {

	public static void main(String[] args) {
		/* 	exQ2
	
			行数と列数を入力させ、その表を0～99の乱数で埋め尽くす。
			
			多次元配列を使用し、以下の実行結果となるようにプログラムを作成しなさい。
			
			[実行結果]
			
			何行?>3
			何列?>5
			 85 17 40 20  4
			 95 90 37 41 70
			 44 84 99 25 49
		*/
		
		System.out.print("何行?>");
		int cellX = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("何列?>");
		int cellY = new java.util.Scanner(System.in).nextInt();
		
		int[][] sheet = new int[cellY][cellX];
		System.out.println(Arrays.deepToString(sheet));
		
		System.out.println(sheet.length);		//3 X に対応
		System.out.println(sheet[0].length);	//5 Y に対応
		
		for (int i = 0 ; i < sheet.length; i++) {
			for (int j = 0 ; j < sheet[0].length; j++) {
				sheet[i][j] = new java.util.Random().nextInt(100);
				System.out.print(sheet[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		

	}

}
