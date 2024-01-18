package drivePractice01;

public class Q15 {

	public static void main(String[] args) {
		//「Q15」クラスを作成し、
		// 1~100までの和を求めよ。
		int sum = 0;
		
		for (int i = 0; i < 101; i++) {
			sum+=i;
		}
		
		System.out.println("1から100まで足すと"+ sum +"です" );
	}

}