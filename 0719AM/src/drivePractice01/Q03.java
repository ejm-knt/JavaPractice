package drivePractice01;

public class Q03 {

	public static void main(String[] args) {
//		「Q3」クラスを作成し、
//		xに10を代入し、それに５を３回足し結果を出力せよ。(whileと+=を使うこと)
		int x = 10;
		int count = 0;
		
		while(count < 3) {
			count++;
			x += 5;
		}
		
		System.out.println("Ans:" + x);
	}

}
