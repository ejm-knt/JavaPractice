package program04;

import java.util.Arrays;

public class MainP164 {

	public static void main(String[] args) {
		// 実行結果は？ (P164 コード4-15)
		int[] arrayA = {1,2,3};
		int[] arrayB;
		
		arrayB = arrayA;
		System.out.println(arrayA[0]);

		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		
		// ぬるぽの利用 ※エラーが出る (P169 コード4-17)
		/*
		int[] array = {1,2,3};
		array = null;
		array[0] = 10;
		System.out.println(array[0]);
		*/
		
		int[] test = new int[5];
//		System.out.println(test[0]);
		System.out.println(Arrays.toString(test));
		
		String[] testS = new String[5];
//		System.out.println(testS[0]);
		System.out.println(Arrays.toString(testS));
		
	}

}
