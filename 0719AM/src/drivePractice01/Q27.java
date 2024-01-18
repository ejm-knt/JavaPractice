package drivePractice01;

public class Q27 {

	public static void main(String[] args) {
		//「Q27」クラスを作成し、
		//実行例のような描画をせよ。
		//[実行例]
		//★
		//★★
		//★★★
		
		//数値を変えれば出力の★が増える
		int starCount = 3; 
		
		for (int i = 0; i < starCount ; i++) {
			for (int j = 0 ; j < (i+1) ; j++) {
				System.out.print("★");
			}
			System.out.println ("");
		
		}
	}
}

