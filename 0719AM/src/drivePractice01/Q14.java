package drivePractice01;

public class Q14 {

	public static void main(String[] args) {
		// 「Q14」クラスを作成し、
		// サイコロを２個ふって、２個の合計を点数とする。ただし、ゾロ目の場合は点数は
		// 合計値の２倍となる。
		// サイコロの目と点数を表示せよ。
		
		int diceNum1 = new java.util.Random().nextInt(6)+1;
		int diceNum2 = new java.util.Random().nextInt(6)+1;
		
		// ゾロ目trueなら合計数を2倍
		if (diceNum1 == diceNum2) {
			System.out.println("dice1:" + diceNum1 + " dice2:"+ diceNum2 + " score:"+(diceNum1 + diceNum2)*2 ); 
		} else {
			System.out.println("dice1:" + diceNum1 + " dice2:"+ diceNum2 + " score:"+(diceNum1 + diceNum2) ); 
		}
		
	}

}
