package program12;

public class Goblin extends Monster {
	String name = "ゴブリン"; //個体名
	
	public Goblin (int hp , char suffix) {
		super(hp , suffix);
	}

	public void run() {
		System.out.println(this.name + this.suffix + "は、腕をふって逃げ出した。");
	}
	
}
