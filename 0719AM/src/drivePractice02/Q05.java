package drivePractice02;

public class Q05 {

	public static void main(String[] args) {
		/*	次の手順で配列を生成し、出力せよ。

			boolean型の配列を宣言すると同時にtrue,false,false,true,trueの値で初期化する。
			「第何戦の結果を調べますか(1~5)>」ときく
			trueならば勝ち,そうでなければ負けと出力する。
			
			[実行例]
			第何戦の結果を調べますか(1~5)>5
			第5戦は[勝ち]です。		 
		 */
		
		boolean[] warRecords = {true , false , false , true , true};
		
		System.out.print("第何戦の結果を調べますか(1~5)> ");
		int input = new java.util.Scanner(System.in).nextInt(); 
		
		if (warRecords[input-1] == true) {
			System.out.print("第"+ input +"戦目は[勝ち]です。");
		} else {
			System.out.print("第"+ input +"戦目は[負け]です。");
		}
			
	}

}
