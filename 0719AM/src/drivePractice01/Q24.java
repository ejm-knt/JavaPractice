package drivePractice01;

public class Q24 {

	public static void main(String[] args) {
		//「Q24」クラスを作成し、
		// 二つの数値を入力させ、その2値の入れ替えを行え。
		int tempNum ;
		
		System.out.print("xに代入する数値をいれてください。>");
		int randomNum1 = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("yに代入する数値をいれてください。>");		
		int randomNum2 = new java.util.Scanner(System.in).nextInt();
		
		tempNum = randomNum1;
		randomNum1 = randomNum2;
		randomNum2 = tempNum;
		
		System.out.println("2つの数値を入れ替えました。x:"+randomNum1+",y:"+randomNum2);				
	}

}
