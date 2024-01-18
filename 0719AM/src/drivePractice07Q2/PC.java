package drivePractice07Q2;

public class PC{
	UsbConnectable device;
	
	//処理内容：フィールドを用いてメソッドを実行
	public void execApp() {
		
		if(getDevice() == null) {
			System.out.println("アプリケーションを実行できます。先にUSBを接続して下さい");
		} else {
			getDevice().usbConnect();
		}
	}
	
	//処理内容：フィールドの値を返す
	public UsbConnectable getDevice() {
		return this.device;
	}
	
	//処理内容：引数を用いてフィールドに値を入れる
	public void setDevice(UsbConnectable device) {
		this.device = device;
	}
	
}
