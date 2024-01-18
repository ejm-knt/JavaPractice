package program02;

public class MainP79 {

	public static void main(String[] args) {
	//型の変換(P79 - コード2-5)
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		
	//表2-7 数値型に関する代入の可否
	//型として大きい物で宣言されている場合、小さい型へ代入はできない
		short s = 10 ;
		//本来byte型にも10は入るが、
		//byteより大きいshort型に10を代入しているため
		//下記の代入宣言はエラーになってしまう		
		//byte b = s;
		System.out.println(s);
		
		//ただし、生数値であれば代入可能
		byte b = 10;
		System.out.println(b);
	}

}
