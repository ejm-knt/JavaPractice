package drivePractice01;

public class Q16 {

	public static void main(String[] args) {
		// 「Q16」クラスを作成し、
		// 0~100の乱数を繰り返し発生させ、100が出るまでの回数を数える。
		// (do~whileを使うこと)		
		int randomNum ;
		int count = 0;
		
		do {
		randomNum = new java.util.Random().nextInt(101);
		count++;
		
		//デバック用
		System.out.println(randomNum);
		
		} while (randomNum < 100) ;
		
		System.out.println(count + "回目に100が出ました！");
		
	}

}
