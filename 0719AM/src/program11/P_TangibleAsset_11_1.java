package program11;

public abstract class P_TangibleAsset_11_1 extends P_Asset_11_1 implements P_Thing_11_1 {
	String color;
	double weight;
	
	public P_TangibleAsset_11_1(String name , int price , String color) {
		super(name,price);
		this.color = color;
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
