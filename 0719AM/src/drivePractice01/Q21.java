package drivePractice01;

public class Q21 {

	public static void main(String[] args) {
		//「Q21」クラスを作成し、
		//0~999の乱数を繰り返し生成し、777が出るまでの回数を求める。
		//(while(true)を使うこと　）
		int randomNum ;
		int count = 0;
		
		while(true) {
			randomNum = new java.util.Random().nextInt(1000);
			count++;
			
			//デバック用
			System.out.println(randomNum);
			
			if (randomNum == 777) {
				System.out.println("777は" + count + "回目にでました。");
				break;
			}
			
		}
		
		
//		Q16に類題があったので参考
//		do {
//		randomNum = new java.util.Random().nextInt(101);
//		count++;
//		
//		//デバック用
//		System.out.println(randomNum);
//		
//		} while (randomNum < 100) ;	
//		System.out.println(count + "回目に100が出ました！");

	}

}
