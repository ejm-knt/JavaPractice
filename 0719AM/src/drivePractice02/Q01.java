package drivePractice02;

public class Q01 {

	public static void main(String[] args) {
		// 「chapter02」パッケージ→「Q01」クラスを作成し、
		/*	次の手順で配列を生成し、出力せよ。

			int型の配列を宣言する。
			配列の要素数を3にする。
			最初の要素に30を代入
			次の要素に70を代入
			最後の要素に10を代入
			出力
	
			[実行例]
			nums[0]:30 nums[1]:70 nums[2]:10
		*/
		
		int[] nums = new int[3];
		nums[0] = 30;
		nums[1] = 70;
		nums[2] = 10;
		
		for (int i = 0 ;i < nums.length ; i++) {
			System.out.print("nums["+ i + "]:"+nums[i]+" ");
		}
	}

}
