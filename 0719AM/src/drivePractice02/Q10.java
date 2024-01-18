package drivePractice02;

public class Q10 {

	public static void main(String[] args) {
		/* 「Q10」クラスを作成し、
			{3,8,10,5,4}という配列を逆順に並び替える。
			変更された配列を出力する。
			[実行例]
			4
			5
			10
			8
			3
		*/
		
		int[] nums = {3,8,10,5,4};
		
		for (int i = (nums.length-1) ; i >= 0 ; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
