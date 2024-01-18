package drivePractice02;

public class Q02 {

	public static void main(String[] args) {
		/* 	次の手順で配列を生成し、出力せよ。

			String型の配列を宣言する。
			配列の要素数を3にする。
			最初の要素にBananaを代入
			次の要素にAppleを代入
			最後の要素にOrangeを代入
			出力
			
			[実行例]
			fruits[0]:Banana fruits[1]:Apple fruits[2]:Orange
		*/
		
		String[] fruits = new String[3];
		fruits[0] = "Banana";
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		
		for (int i = 0 ;i < fruits.length ; i++) {
			System.out.print("fruits["+ i + "]:"+fruits[i]+" ");
		}
	}

}
