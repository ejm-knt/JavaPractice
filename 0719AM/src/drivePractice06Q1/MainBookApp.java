package drivePractice06Q1;

import java.util.Scanner;

public class MainBookApp {

	public static void main(String[] args) {
		int bookPageNum;
		int bookPrice;
		int notebookPageNum;
		int notebookPrice;
		String inputContent;
		int mode = 0;
		
		System.out.println("本のページ数を入力してください");
		bookPageNum = new Scanner(System.in).nextInt();
		
		System.out.println("本の価格を入力してください");
		bookPrice = new Scanner(System.in).nextInt();
		
		System.out.println("ノートのページ数を入力してください");
		notebookPageNum = new Scanner(System.in).nextInt();
		
		System.out.println("ノートの価格を入力してください");
		notebookPrice = new Scanner(System.in).nextInt();
		
		Book book = new Book(bookPageNum, bookPrice);
		Notebook notebook = new Notebook(notebookPageNum, notebookPrice);
		
		while(mode != 4) {
			System.out.println("----------------------------------------------------------------\n"
					+ "1.本の情報表示   /  2.ノートの情報表示   /  3.ノートに追加書込   /  4.終了");
			
			mode = new Scanner(System.in).nextInt();
			
			switch (mode) {
			case 1:
				System.out.println("1.本の情報表示");
				book.PrintBookInfo();
			break;
			
			case 2:
				System.out.println("2.ノートの情報表示");
				notebook.PrintBookInfo();
			break;
			
			case 3:
				System.out.println("3.ノートに追加書込");
				System.out.println("書き込む内容を書いて下さい");
				inputContent = new Scanner(System.in).nextLine();
				notebook.InputContent(inputContent);
			break;	
				
			case 4:
				System.out.println("4.終了");
				System.out.println("アプリケーションを終了します");	
			return;
			
			default:
				System.out.println("1～4の番号で入力してください");	
			break;
			}
		}
	}
}
