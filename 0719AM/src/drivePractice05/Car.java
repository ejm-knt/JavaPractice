package drivePractice05;

public class Car {
	double gasoline;
	double nenpi;
	double gasolineMax;
	
	public Car(double gasoline , double nenpi , double gasolineMax) {
		this.gasoline = gasoline;
		this.nenpi = nenpi;
		this.gasolineMax = gasolineMax;
	}
	
	//ガソリン残量を表示
	public void displayGasoline() {
		System.out.println("現在の燃料は" + this.gasoline + "リットルです。");
	}
	
	//ガソリンを給油するメソッド。gasolineは給油量(リットル)
	//gasolineMaxを超えないようにする
	public void addGasoline(double gasoline) {
		
		if(gasolineMax >= gasoline + this.gasoline) {
			System.out.println(gasoline + "リットル給油します。");
			this.gasoline += gasoline;
		} else {			
			System.out.println((this.gasolineMax - this.gasoline)  + "リットル給油します。");
			this.gasoline = this.gasolineMax;
		}
		
		System.out.println("現在の燃料は"+ this.gasoline + "リットルです");
	}

	//車を走行させるメソッド。distanceは走行距離(キロメートル)
	//１ℓでnenpi分走れる
	public void run(double distance) {
		double distanceLimit = this.gasoline * this.nenpi;
		
		if(distanceLimit <= distance) {
			System.out.println("ガソリンが足りません");
		} else {
			System.out.println(distance + "キロ走行します");
			this.gasoline = this.gasoline - (distance / this.nenpi);  
		}
		
	}
	
}
