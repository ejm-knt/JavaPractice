package program02;

public class MainP85 {

	public static void main(String[] args) {
		//文字列を含む演算時の型変換(P85 - コード2-9)
		String msg = "私の年齢は" + 23 ;
		System.out.println(msg);

	    // 文字「あ」です。
	    char c = 'あ';
	    
	    // 文字に対応するUnicodeコードを取得します。
	    int code = (int)c;
	    
	    // 文字コードを表示します。
	    System.out.println(code);

	    // 文字コードを16進数で表示します。
	    System.out.println(Integer.toHexString(code));
	    
	}

}
