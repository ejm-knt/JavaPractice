package program12;

public class DeathBat extends Monster{
	String name = "地獄コウモリ"; //個体名
	
	public DeathBat (int hp , char suffix) {
		super(hp , suffix);
	}

	public void run() {
		System.out.println(this.name + this.suffix + "は、羽ばたいて逃げ出した。");
	}	
}
