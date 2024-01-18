package drivePractice07Q2;

import java.util.Scanner;

public class PCApp {

	public static void main(String[] args) {
		int mode = 0 ;
		int inputDevice = 0;
		
		PC pc = new PC();
		Mouse mouse = new Mouse();
		Memory memory = new Memory();
		CardReader cardReader = new CardReader();
		
		while (mode != 3) {
			System.out.println("--------------------------------------------------------\n"
					+ "0:アプリ実行      1:USBデバイス接続     2:USBデバイス取り外し     3:終わり");
			
			mode = new Scanner(System.in).nextInt();
				
			switch (mode) {
				case 0:
					pc.execApp();
				break;
				
				case 1:
					while(pc.getDevice() == null) {
						System.out.println("どのデバイスを接続しますか   0:マウス       1:メモリー      2:カードリーダー");

						inputDevice = new Scanner(System.in).nextInt();
						switch(inputDevice) {
							case 0:
								pc.setDevice(mouse);
							break;
							
							case 1:
								pc.setDevice(memory);
							break;
							
							case 2:
								pc.setDevice(cardReader);
							break;
							
							default:
								System.out.println("0～2で入力してください。");
						}
					}
					
					System.out.println("接続しました。");
				break;
								
				case 2:
					if(pc.getDevice() == null) {
					System.out.println("接続をして下さい");
					} else {
					pc.setDevice(null);
					System.out.println("デバイスを取り外しました。");
					}
				break;

				case 3:
					System.out.println("アプリケーションを終了します。");
				return;
				
				default:
					System.out.println("0～3で入力してください。");
			}
		}
	}
}
