package drivePractice01;

public class Q23 {

	public static void main(String[] args) {
		//「Q23」クラスを作成し、
		// 1~20を順番に出力する。ただし、３の倍数は出力しない。
		// (continueを用いる)
		
		for (int i = 1 ; i <= 20 ; i++) {
			
			if ((i%3 == 0)) {
				continue;
			} else {
				System.out.println(i);
			}
			
		}
	}

}
