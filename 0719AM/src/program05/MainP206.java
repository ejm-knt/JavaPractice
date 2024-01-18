package program05;

public class MainP206 {
	// オーバーロード(引数の型が異なる場合) (P206 コード5-10)
	// オーバーロード(引数の数が異なる場合) (P207 コード5-11)
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y , int z) {
		return x + y + z;
	}
	
	public static double add(double x , double y) {
		return x + y;
	}
	
	public static String add(String x , String y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		//int add x2
		System.out.println(add(100 , 200));
		
		//int add x3
		System.out.println(add(100 , 200 , 300));
		
		//double add
		System.out.println(add(3.5 , 2.7));
		
		//String add
		System.out.println(add("100","200"));
	}

}
