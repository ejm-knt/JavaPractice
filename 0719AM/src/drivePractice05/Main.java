package drivePractice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int select = 0;
		Car car = new Car(30.0 , 8.4 , 60.0);
		
		while (select != 4) { 
			System.out.println("1. 走行 / 2. 給油 / 3. 残量表示 / 4. 終了");
			select = new Scanner(System.in).nextInt();
			
			switch (select) {
				case 1:
					System.out.println("何キロ走行しますか？");
					int inputDistance = new java.util.Scanner(System.in).nextInt();
					car.run(inputDistance);
				break;
				
				case 2:
					System.out.println("何リットル給油しますか？");
					int inputGasoline = new java.util.Scanner(System.in).nextInt();
					car.addGasoline(inputGasoline);
				break;
				
				case 3:
					car.displayGasoline();
				break;
				
				case 4:
					System.out.println("アプリケーションを終了します。");
				break;	
			}
		}
	}

}
