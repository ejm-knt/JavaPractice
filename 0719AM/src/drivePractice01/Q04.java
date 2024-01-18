package drivePractice01;

public class Q04 {

	public static void main(String[] args) {
		//「Q4」クラスを作成し、
		//1~10の乱数を生成して、それが偶数か奇数かを判定
		int num = new java.util.Random().nextInt(10)+1;
		if (num%2==0) {
			System.out.println(num+"は偶数");
		} else {
			System.out.println(num+"は奇数");
		}
	}

}
