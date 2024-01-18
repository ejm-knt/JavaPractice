package drivePractice01;

public class Q10 {

	public static void main(String[] args) {
		//「Q10」クラスを作成し、
		//0~100の乱数を１０個生成し、５０以上の値の個数を求める。
		int count = 0;
		for (int i = 0; i < 10 ;i++) {
			int randomNumber = new java.util.Random().nextInt(101);
			System.out.println(randomNumber);
			if (randomNumber >= 50) {
				count++;				
			}
		}
		System.out.println("50以上のscoreは"+count+"個ありました。");
		
	}

}
