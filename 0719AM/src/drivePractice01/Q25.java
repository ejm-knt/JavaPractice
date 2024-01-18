package drivePractice01;

public class Q25 {

	public static void main(String[] args) {
		//「Q25」クラスを作成し、
		// 0~20の乱数を３個生成し、それを小さい順に出力する。
		int x = new java.util.Random().nextInt(21);
		int y = new java.util.Random().nextInt(21);
		int z = new java.util.Random().nextInt(21);
		
		System.out.println("3つの乱数を小さい順に並べました。");
		if(x < y && x < z){
			if (y < z){
				System.out.println(x +"," + y + "," + z);
			}else{
				System.out.println(x + "," + z + "," + y);
			}
		}else if(y < z && y < x){
			if (x<z){
				System.out.println(y +"," + x + "," + z);
			}else{
				System.out.println(y + "," + z +"," + x);
			}
		}else{
			if(y < x){
				System.out.println(z + "," + y + "," + x);
			}else{
				System.out.println(z + "," + x + "," + y);
			}
		}
	}
}
