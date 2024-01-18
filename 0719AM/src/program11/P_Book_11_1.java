package program11;

public class P_Book_11_1 extends P_TangibleAsset_11_1{
	String isbn;
	double weight;
	
	public P_Book_11_1(String name ,int price , String color , String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
}
