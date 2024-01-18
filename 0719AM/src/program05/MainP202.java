package program05;

public class MainP202 {
	
	public static int add(int x,int y) {
		// 戻り値の例(P202 コード5-7)
		int addAns = x + y;
		return addAns;
	}
	
	public static void main(String[] args) {
//		int x = 100;
//		int y = 200;
		int addAns = add(100,200);
		System.out.println(addAns);
	}

}
