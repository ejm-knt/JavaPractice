package testStudy;

public class Study01 {

	public static void main(String[] args) {
//		int[] points = new int[4];
//		double[] weights = new double[5];
//		boolean[] answers = new boolean[3];
//		String[] names = new String[3];
		
		
//		int [] moneyList = {121902 , 8302 , 55100};
//		
//		for (int i = 0; i < moneyList.length; i++) {
//			System.out.println(moneyList[i]);
//		}
//		
//		for(int value : moneyList) {
//			System.out.println(value);
//		}
		
//		NullPointerException
//		ArrayIndexOutOfBoundsException
		
//		int[] numbers = {3,4,9};
//		System.out.println("１桁の数字入力よろ");
//		int input = new java.util.Scanner(System.in).nextInt();
//		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == input) {
//				System.out.println("あたり～");
//			}
//		}

		double bottom = 10.0;
		double heigth = 5.0;
		System.out.println(
		calcTriangleArea(bottom,heigth)
		);
	}
	

	
	public static double calcTriangleArea(double bottom , double height) {		
		return bottom * height /2 ;
	}

}
