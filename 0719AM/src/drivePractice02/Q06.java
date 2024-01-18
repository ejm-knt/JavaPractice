package drivePractice02;

public class Q06 {

	public static void main(String[] args) {
		/*	「Q06」クラスを作成し、
			次の手順で配列を生成し、出力せよ。
			
			int型の配列を要素数5で用意する
			for文を利用し、0~100の乱数をそれぞれの要素に代入する
			for文を利用し、配列の内容を出力する
			
			[実行例]
			nums[0]:63
			nums[1]:87
			nums[2]:99
			nums[3]:76
			nums[4]:9
		*/
		
		int[] randomNums = new int[5];
		
		for (int i = 0; i < randomNums.length; i++) {
			int randomNum = new java.util.Random().nextInt(100)+1;
			randomNums[i] = randomNum;
			System.out.println("nums["+ i +"]: "+randomNums[i]);
		}
		
	}

}
