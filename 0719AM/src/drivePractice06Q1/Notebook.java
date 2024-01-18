package drivePractice06Q1;

public class Notebook extends Book {
	String content;
	
	public Notebook(int pagesNum , int price) {
		super(pagesNum , price);
		content = "";
	}
	
	public void InputContent(String content) {
		this.content += content;
	}
	
	public void PrintBookInfo() {
		super.PrintBookInfo();
		System.out.println("内容 : " + this.content);
	}
}
