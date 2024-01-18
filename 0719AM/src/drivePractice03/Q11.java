package drivePractice03;

import java.util.Arrays;

public class Q11 {
	
	public static void main(String[] args) {
		int selectNum = 0;                 // 選択した番号を保持する変数。
		boolean createAccountFlag = false; // 新しくアカウントを作成したかどうかのフラグ
		boolean loginFlag = false;         // ログインしたかどうかのフラグ
		String[] account = new String[2];  // アカウントを保持する配列 [0]にID [1]にPASS
		
	while(selectNum < 6) {		
		selectNum = information();
		
			switch(selectNum) {
			case 0:
				System.out.println(Arrays.toString(account));
				break;
				
			case 1:
				createAccount(account);
				createAccountFlag = true;
				break;
				
			case 2:
				displayAccount(account,createAccountFlag);
				break;
				
			case 3:
				loginChecker(account,createAccountFlag);
				loginFlag = true;
				break;
				
			case 4:
				execution(account,loginFlag);
				break;
				
			case 5:
				logout(account,loginFlag);
				loginFlag = false;
				break;
			
			case 6:
				System.out.println("アプリケーションを終了します");	
				break;
			}
		}
	}
	
	public static int information() {
		System.out.println("ログインアプリケーションを開始します");	
		System.out.println("----------------------------------------------");	
		System.out.println("どの処理をしますか？");	
		System.out.println
		("1:新規作成  2:ID・PASS確認   3:ログイン  4:実行  5:ログアウト  6:終了");	
		int selectNum = new java.util.Scanner(System.in).nextInt();	
		
		System.out.println("");	
		return selectNum;
	}
	
	public static int createAccount(String[] account) {
		String inputUserId;
		String inputUserPassword;
		
		
		do {System.out.println("IDを入力してください。");	
			inputUserId = new java.util.Scanner(System.in).nextLine();		
			System.out.println("Passwordを入力してください。");
			inputUserPassword = new java.util.Scanner(System.in).nextLine();
			
				if(inputUserId.equals("") || inputUserPassword.equals("")) {
					System.out.println("ID・PASSは１文字以上入力してください");
					System.out.println("");
				} else {
					account[0] = inputUserId;
					account[1] = inputUserPassword;
					System.out.println("登録が完了しました。");
					System.out.println("");
				}
			
		} while (inputUserId.equals("") || inputUserPassword.equals("")); 
		
		int selectNum = 1;
		return selectNum;
	}

	public static int displayAccount(String[] account , boolean createAccountFlag) {
		if(createAccountFlag == false) {
			System.out.println("アカウントを作成してください");
			System.out.println("");
		} else {
			System.out.println("あなたのIDは"+ account[0] +" , Passは"+ account[1]);
			System.out.println("");
		}
		int selectNum = 1;
		return selectNum;
	}
	
	public static int loginChecker(String[] account , boolean createAccountFlag) {
		String inputUserId;
		String inputUserPassword;
		boolean loginFlag = false;
		
		if(createAccountFlag == false) {
			System.out.println("アカウントを作成してください");
			System.out.println("");
		} else {
			do {System.out.println("IDを入力してください。");	
				inputUserId = new java.util.Scanner(System.in).nextLine();		
				System.out.println("Passwordを入力してください。");
				inputUserPassword = new java.util.Scanner(System.in).nextLine();
				
					if(inputUserId.equals(account[0]) && inputUserPassword.equals(account[1])) {
						System.out.println("ログイン完了");
						System.out.println("");
						loginFlag = true;
					} else {
						System.out.println("入力が間違っています");
						System.out.println("");
					}
			} while (loginFlag == false); 
		}
		
		int selectNum = 1;
		return selectNum;
	}
	
	public static int execution(String[] account , boolean loginFlag) {
		if(loginFlag == false) {
			System.out.println("ログインしてください。");
			System.out.println("");
		} else {
			System.out.println(account[0] +"さんこんにちは");
			System.out.println("");
		}
		int selectNum = 1;
		return selectNum;
	}

	public static int logout(String[] account , boolean loginFlag) {
			if(loginFlag == false) {
				System.out.println("ログインしてください。");
				System.out.println("");				
			} else {
				System.out.println("ログアウトが完了しました。");
				System.out.println("");				
			}
			
			int selectNum = 1;
			return selectNum;
		}
	
	}

