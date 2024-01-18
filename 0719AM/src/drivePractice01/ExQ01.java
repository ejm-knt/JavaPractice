package drivePractice01;

public class ExQ01 {

	public static void main(String[] args) {
		// for文を使って累乗計算をする方法
		//aのn乗を行いたい場合、aをかけるという処理をn回繰り返します。
		int a = 2;
		int n = 5;
		int result = 1;// 累乗計算の解

		//以下の実行結果となるようにコードを記入しなさい。
		//[実行結果]
		//2の4乗は16です。

		for (int i = 0 ;i < n ; i++) {
			result *= a;
		}
		System.out.print(result);
		
	}

}
