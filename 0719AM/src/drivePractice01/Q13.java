package drivePractice01;

public class Q13 {

	public static void main(String[] args) {
		// 「Q13」クラスを作成し、
		// 日本の信号で渡っていい色を出題し、漢字一文字で入力させる。
		// 入力された文字が「青」または「緑」なら、「OK!」、それ以外なら「NG」と出力する。
		// （switch文を使用すること）
		System.out.println("日本の信号で渡っていい色は(漢字一文字)?");
		String questionColor = new java.util.Scanner(System.in).nextLine();
		int ans = 0;
		
		// switch を利用するため、青or緑をifで数値変換させる
		if (questionColor.equals("青")||questionColor.equals("緑")) {
			ans ++;
		}

		switch (ans) {
			case 1:
				System.out.println("OK");
				break;
			default:
				System.out.println("NG");
		}
		
			
	}

}
