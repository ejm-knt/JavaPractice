package drivePractice06Q1;

public class Book {
	int pagesNum ;
	int price;
	
	public Book(int pagesNum , int price) {
		this.pagesNum = pagesNum;
		this.price = price;
	}
	
	public void PrintBookInfo() {
		System.out.println("ページ数 : " + this.pagesNum);
		System.out.println("価格 : " + this.price);
	}
}
