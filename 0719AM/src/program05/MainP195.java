package program05;

public class MainP195 {

	public static void main(String[] args) {
		// 引数の例(渡す値が複数の場合) (P195 コード5-5)
		add(200,10);
		add(300,20);
		
	}

	public static void add(int x,int y) {
		int ans = x + y;
		
		System.out.println(x + "+" + y + "=" + ans);
		}
	
}
