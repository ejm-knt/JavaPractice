package program01;

public class PracticeP58 {

	public static void main(String[] args) {
	//練習1-1
	String ア = "コンパイラ";
	String イ = "インタプリタ";
	String ウ = "ソースコード";
	String エ = "バイトコード";
	String オ = "JVM";
	
	System.out.println(
			"Javaでプログラムを開発するためには、"+ ア +"と"+ イ +"というソフトウェアが必要です。\r\n"
			+ ア +"は、私たちがJavaの文法に沿って記述した"+ ウ +"を"+ エ +"に変換してくれます。\r\n"
			+ イ +"は内部に持っている"+ オ +"の仕組みを使ってこれを解釈し、マシン語に変換してCPUに送り、CPUは命令を実行します。"
			);
	
	//練習1-2
	int a = 3;
	int b = 5;
	int c = a * b;

	System.out.println("縦幅 "+ a +" 横幅 "+ b +" の長方形の面積は、" + c);
	
	//練習1-3
	//①
	boolean questionOne = true;
	System.out.println(questionOne);
	
	//②
	char questionTwo = '駆';
	System.out.println(questionTwo);
			
	//③
	double questionThree = 3.14;
	System.out.println(questionThree);
	
	//④
	long questionFour = 314159265853979L;
	System.out.println(questionFour);
	
	//⑤ これだけちょっと遊んだ
	int attackDamege = 15;
	String questionFive = "ミナトの攻撃！敵に"+ attackDamege +"ポイントのダメージを与えた";

	System.out.println(questionFive);
	
	}

}
