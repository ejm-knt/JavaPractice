package program04;

import java.util.Arrays;

public class MainP173 {

	public static void main(String[] args) {
		// 2次元配列の利用 (P173 コード4-18)
		int[][] scores = new int[2][3];
		
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		
		//System.out.println(scores[1][1]);
		
		for (int value : scores[0]) {
			System.out.println(value);
		}
		
		for (int value : scores[1]) {
			System.out.println(value);
		}
		
		System.out.println(Arrays.toString(scores[0]));
		System.out.println(Arrays.toString(scores[1]));
		
	}

}
