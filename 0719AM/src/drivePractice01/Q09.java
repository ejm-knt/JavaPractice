package drivePractice01;

public class Q09 {

	public static void main(String[] args) {
		//「Q9」クラスを作成し、
		//0~9の乱数を5つ生成し、それの合計(sum)と平均(avg)を求める
		
		int sum = 0;
		double ave = 0;
		for (int i = 0; i < 5; i++) {
			int randomNumber = new java.util.Random().nextInt(10);
			sum += randomNumber;			
			}
		System.out.println("5個の数値の合計は"+sum+"平均は"+(double)sum/5);
		}
		
	}


