package drivePractice01;

public class Q12 {

	public static void main(String[] args) {
		// 「Q12」クラスを作成し、
		//スペイン語で日曜は何と言うかという３択問題を出題し、答えを番号で入力させる。
		//正解だったら。「OK!」不正解だったら「NG」と出力する。
		//（switch文を使用すること）
		System.out.println("スペイン語で日曜は何?");
		System.out.println("1:Lunes,2:Jueves,3:Domingo >");
		int questionNum = new java.util.Scanner(System.in).nextInt();
		
		switch (questionNum) {
			case 1:
				System.out.println("NG");
				break;
			case 2:
				System.out.println("NG");
				break;
			case 3:
				System.out.println("OK");
				break;
		
		}
	}

}
