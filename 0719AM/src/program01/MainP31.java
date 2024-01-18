package program01;

//クラスブロックです。
public class MainP31 {

		//P31の内容を書き起こしたもの
		public static void main(String[] args) {
		System.out.println("RPG:スッキリ魔王征伐");
		System.out.println("Ver.0.1 by 湊");
		System.out.println("<ただいま鋭意学習・制作中>");
		System.out.println("プログラムを終了します。");

		//P49の内容をかなり改変して書き起こしたもの
		//x^3 + y^3 + z^3 = 42 がLong型でできるか挑戦
		//ちなみに int だと初期化時に数値側にエラーが出る
		/*単一の計算では数値が大きすぎるため結果が正しくないが、
		 *一括で解を求めると正しくなる謎
		*/
		long x = -80538738812075974L;
		long y = 80435758145817515L;
		long z = 12602123297335631L;
		System.out.println(x*x*x + y*y*y + z*z*z);		

		//P51の内容を書き起こしたもの
		float weight = 67.52F;
		System.out.println(weight * 3.14);
		double height = 169.87;
		System.out.println(height * 3.14);
		
		//P53の内容を一部改変して書き起こしたもの
		int age = 30;
		System.out.println("私のストライクゾーンは"+age+"歳くらいなんだよね～");
		
		age *= 3;
		System.out.println("嘘… 本当は" + age + "歳くらいがどストライクなんだ…");		
	}	
}
