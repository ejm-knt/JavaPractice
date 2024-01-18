package program02;

public class MainP67 {

	public static void main(String[] args) {
	//エスケープシーケンス(P67 - コード2-3)
		String msg;
		msg = "私の好きな記号は\"です。";
		System.out.println(msg);
		System.out.println("私の好きな記号は二重引用符(\")です。");		

	//エスケープシーケンス一部改変版(P67 - コード2-3)
		String test;
		test = "天光満つる処に我は在り 黄泉の門開く処に汝在り 出でよ 神の雷";
		String test2;
		test2 = "インディングネイション！";
		System.out.println("\"" + test + "\"" + "\n" + test2);
	}

}
