package drivePractice01;

public class Q08 {

	public static void main(String[] args) {
		//「Q8」クラスを作成し、
		//0~100の乱数を一つ生成し、それが80以上なら「Excellent！」,50以上なら「Good」,
		//それ以外は「Bad」と表示する
		
		int randomNumber = new java.util.Random().nextInt(101);
		//int randomNumber =79;
		System.out.println("Score:"+ randomNumber);
		
		if (randomNumber >= 80) {
			System.out.println("Excellent！");
		} else if (randomNumber >= 50) {
			System.out.println("Good");	
		} else {
			System.out.println("Bad");
		}
		
	}

}
