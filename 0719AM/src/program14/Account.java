package program14;

public class Account {
	String accountNumber;
	int balance;

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}

	public boolean equals(Object obj) {
		
		// 参照型だったとして、アドレスが同一か確認。
		// 同一であれば問答無用で中身が同じなので、Trueになる。
		if (this == obj) {
			return true;
		}
		
		
		
		// 引数で貰ったObjectの中身が比較先と同一だった場合IF入り
		if (obj instanceof Account) {
			// 変数objをダウンキャストして、Accountクラスの変数を使えるようにする
			// obj.accountNumber は 型違いなので利用できない。
			// Account an3 = (Account)obj.accountNumber;
			Account a = (Account) obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();

			if (an1.equals(an2)) {
				return true;
			}
		}

		return false;
	}
}
