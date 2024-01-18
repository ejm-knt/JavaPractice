package program03;

public class MainP126 {

	public static void main(String[] args) {
		//基本的なfor文(P126 コード3-7)
		for (int i = 0; i < 100; i++) {
		System.out.println("こんにちわ" + (i+1));
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i+1) + "週目→");
		}
		
		int sum = 0;
		for (int i = 0 ; i < 3 ; i++) {
			sum += i ;
		}
		System.out.println("\n"+sum);

	}

}
