package testCode01;

public class WhileLoopTest {

	public static void main(String[] args) {
		boolean flag = false;
		int input;
		
		int ans	= new java.util.Random().nextInt(2)+1;
		System.out.println(ans);
		
		//無限ループの抜け方
		while(flag == false) {
			System.out.println("入力");
			input = new java.util.Scanner(System.in).nextInt();
			
			if (input == ans) {
				flag = true;
			}
		}
		
		//	結果
		/*	Whileの中身が true なら無限ループになるので、
		 * 	flag = false  なら whileの中身を
		 * 	flag == false にすることで無限ループになる。
		 * 
		 * 	また、どこかの段階で flag に true を代入することで
		 * 	while の中身が while(false) になるため、ループが終了する。
		 */	

	}

}
