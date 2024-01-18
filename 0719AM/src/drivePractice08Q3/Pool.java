package drivePractice08Q3;

public class Pool {
	private double water; //現在の水量

	public Pool() {
		this.water = 0;
	}

	//引数として渡された水量だけ給水する
	//ただし満水（600.0立方メートル）を超える分は給水しない
	public void feedWater(double water) {

		if ((this.water + water) >= 600.0) {
			this.water = 600.0;
			System.out.println("600.0立方メートル給水しました。");
		} else {
			this.water += water;
			System.out.println(water + "立方メートル給水しました。");
		}
	}

	//引数として渡された水量だけ排水する
	public void drainWater(double water) {
		if ((this.water - water) <= 0.0) {
			this.water = 0.0;
			System.out.println("全て排水しました。");
		} else {
			this.water -= water;
			System.out.println(water + "立方メートル排水しました。");
		}
	}

	//現在の水量を表示する
	public void display() {
		System.out.println("現在の水量は" + this.water + "です。");
	}
}
