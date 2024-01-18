package program02;

public class MainP86 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//命令実行の文(P86 - コード2-10)
		//いつもの
		String name = "すがわら";
		String message;
		
		//命令実行の文中で式を利用することも可能
		System.out.println(name + "さん、こんにちわ");
		
		//こっちはmessageに全文を代入
		message = name + "さん、こんにちわ";
		System.out.println(message);
		
		//改行なし画面出力の命令(P88 - コード2-11)
		//System.out.print(①);
		String nameSugawara = "すがわら";
		System.out.print("私の名前は");
		System.out.print(nameSugawara);
		System.out.println("です。");
		
		//2つの値を比較して大きいほうの数値を代入する(P89 - コード2-12)
		//int m = Math.max(①,②);
		int a = 5;
		int b = 3;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println("比較実験："+ a + "と" + b + "とで大きいほうは" +max);
		System.out.println("比較実験："+ a + "と" + b + "とで小さいほうは" +min );
		
		//文字列を数値に変換する命令(P90 - コード2-13)
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" + (n + 1) + "歳になりますね。");
		
		//ちなみに、(n+1)の()を外してしまうと、311歳になってしまう。
		//これは左から順に計算される際に、String と int (31)が結合→テキスト化する
		//そのテキストに1が結合されるため
		System.out.println("あなたは来年" + n + 1 + "歳になりますね。");
		
		//乱数を生成する命令(P92 - コード2-14)
		//試したところ0以上の整数しか指定できず、負の値を入れるとエラー
		//()内未入力だと負の値も出力するが値の指定がないため数は途方もなくなる
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、"+ r +"歳ですよね？");
		
		//通常0以上の乱数発生だが、1以上にしたい場合（サイコロなど）は+1を入れる
		//1-6の全パターン確認済み
		int dice = new java.util.Random().nextInt(6)+1;
		System.out.println("あなたはサイコロを振った。"+ dice +"が出た");
		
		//キーボードから入力を受け付ける命令(P93 - コード2-15)
		System.out.println("あなたの名前を入力してください。");
		String inputName = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int inputAge = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、"+ inputAge +"歳の"+ inputName +"さん");
	}

}
