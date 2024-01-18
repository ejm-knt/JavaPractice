package drivePractice01;

public class Q07 {

	public static void main(String[] args) {
		//「Q7」クラスを作成し、
		//スカイツリーの高さを入力させ、それがあっていれば「OK!」間違っていれば「NG」と表示する。
		int skytreeHeight = 634;
		int userInput;
		
		System.out.print("スカイツリーの高さは？(m)>");
		userInput = new java.util.Scanner(System.in).nextInt();
		
		if (skytreeHeight == userInput) {
			System.out.println("OK");
		} else {
			System.out.println("NG");	
		}

	}

}
