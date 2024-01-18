package program11;

public class P_Computer_11_1 extends P_TangibleAsset_11_1{
	String makerName;
	double weight;
	
	public P_Computer_11_1(String name ,int price , String color , String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	public String getMakerName() {
		return this.makerName;
	}
}
