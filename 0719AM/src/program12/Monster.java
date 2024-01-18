package program12;

public abstract class Monster {
	int hp;
	char suffix;
	
	public Monster (int hp , char suffix) {
		this.hp = hp;
		this.suffix = suffix;
	}
	
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}
}
