package drivePractice02;

public class Q09 {

	public static void main(String[] args) {
		/* 「Q09」クラスを作成し、
			{3,8,10,5,4}という配列の要素をすべて２倍にする。
			変更された配列を出力する。
			[実行例]
			6
			16
			20
			10
			8
		*/
		
		int[] nums = {3,8,10,5,4};
		for (int twoTimes : nums) {
			twoTimes *= 2;
			System.out.println(twoTimes);
		}
		
		
	}

}
