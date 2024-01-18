package drivePractice01;

public class Q19 {

	public static void main(String[] args) {
		// 「Q19」クラスを作成し、
		//★をいくつ出力するかを聞き、その個数分★を出力する。
		System.out.print("いくつ★を出力しますか？>");
		int starOutput = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 0; i < starOutput; i++) {
			System.out.print("★");	
		}
		
	}

}
