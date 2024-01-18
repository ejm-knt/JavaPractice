package program05;

public class Practice5_4 {
		// 練習問題5-4
		// 三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は25.0cm²
		// 円の半径が5.0cmの場合、面積は78.5cm²
	
	public static double calcTriangleArea(double bottom , double height) {
		double calcTriangleArea = bottom * height / 2;		
		return calcTriangleArea;
	}

	public static double calcCrircleArea(double radius) {
		double calcCrircleArea = radius * radius * 3.14;
		return calcCrircleArea;
	}

	public static void main(String[] args) {
		System.out.println(calcTriangleArea(10,5));
		System.out.println(calcCrircleArea(5));
		
	}

//	public static void calcTriangleArea(double bottom , double height) {		
//		System.out.println((bottom * height) / 2);
//	}
//
//	public static void calcCrircleArea(double radius) {
//		System.out.println(radius * radius * 3.14);
//	}
//
//	public static void main(String[] args) {
//		calcTriangleArea(10,5);
//		calcCrircleArea(5);		
//	}

}