package drivePractice03;

public class Q07 {

//	名前(String)を引数で受け取り、挨拶をするメソッドを作成する。
//	mainメソッドで名前を入力させ、実行例のようになるようにせよ。
//
//	[実行例]
//	お名前を入力してください>Yamada
//	Yamadaさん、こんにちは!
	
	public static void main(String[] args) {
		System.out.print("お名前を入力してください>");
		String inputName = new java.util.Scanner(System.in).nextLine();
		
		outputName(inputName);
	}

	public static void outputName(String name) {
		System.out.println(name + "さん、こんにちは!");
	}
	
}
