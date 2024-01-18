package drivePractice02;

public class Q08 {

	public static void main(String[] args) {
		/* 「Q08」クラスを作成し、
			{3,8,10,5,4}という配列に入っている奇数をすべて表示する
	
			[実行例]
			3
			5
		*/
		
		int[] nums = {3,8,10,5,4};
		
		//拡張for文でトライ
		
		for (int value : nums) {
			if ((value % 2) == 0) {
				continue;
			} else {
				System.out.println(value);
			}
		}
		
		
	}

}
