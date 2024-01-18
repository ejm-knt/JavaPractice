package program13;

public class P_Wand_13 {
	private String name = "エスカルゴ";	//杖の名前
	private double power = 50;	//杖の魔力

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		
		if(power < 0.5 && power > 100) {
			throw new IllegalArgumentException("0.5以下、100以上には設定できない");
		}
		
		this.power = power;
	}
	
	
}
