package program04;

import java.util.Arrays;

public class MainP160 {

	public static void main(String[] args) {
		// DNAの記号をランダムに表示する (P160 コード4-12)
		
		// 10個格納可能な配列を宣言
		int[] seq = new int[10];
		
		//塩基配列をランダムに生成する
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		System.out.println(Arrays.toString(seq));	// 配列用デバック
		
		//生成した塩基配列の記号を表示 (冗長Ver)
		/*
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
				case 0:
					System.out.print("A ");
					break;
				case 1:
					System.out.print("T ");
					break;
				case 2:
					System.out.print("G ");
					break;
				case 3:
					System.out.print("C ");
					break;
			}
		*/
		
		//生成した塩基配列の記号を表示 (短縮Ver)
		char [] base = {'A','T','G','C'};
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
			}
		}
	}
