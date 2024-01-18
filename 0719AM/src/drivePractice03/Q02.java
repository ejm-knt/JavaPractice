package drivePractice03;

public class Q02 {

//	名前(String)と年齢(int)を引数で受け取り、挨拶をするメソッドを作成する。
//	mainメソッドで名前と年齢を入力させ、実行例のようになるようにせよ。
//
//	[実行例]
//	お名前を入力してください>Yamada
//	年齢をいれてください>20
//	Yamada(20)さん、こんにちは!
	
	public static void main(String[] args) {
		System.out.print("お名前を入力してください>");
		String inputName =inputName();
		
		System.out.print("年齢を入力してください>");
		int inputAge =inputAge();
				
		System.out.println(inputName +"("+ inputAge +")さん、こんにちは！");
	}
	
	public static String inputName() {
		String inputName = new java.util.Scanner(System.in).nextLine();
		return inputName;
	}
	
	public static int inputAge() {
		int inputAge = new java.util.Scanner(System.in).nextInt();
		return inputAge;
	}
	
	

}
