package drivePractice01;

public class Q20 {
	
	public static void main(String[] args) {
		//「Q20」クラスを作成し、
		// 0~20の乱数を２個生成し、大きい方の数値から小さい方の数値を引いた差を求める。
		
		int randomNum1 = new java.util.Random().nextInt(21);
		int randomNum2 = new java.util.Random().nextInt(21);
		
		if (randomNum1 > randomNum2) {
			System.out.println
			("num1:"+ randomNum1 + "とnum2:" + randomNum2 + "の差は" +(randomNum1 - randomNum2)+ "です");
		} else {
			System.out.println
			("num2:"+ randomNum2 + "とnum1:" + randomNum1 + "の差は" +(randomNum2 - randomNum1)+ "です");			
		}
		
	}

}
