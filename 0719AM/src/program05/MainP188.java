package program05;

public class MainP188 {
	// mainメソッド以外からメソッドを呼び出す (P188 コード5-3)
	
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}
	
	public static void main(String[] args) {
		methodA();
	}

}
