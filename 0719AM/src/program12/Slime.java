package program12;

public class Slime extends Monster {
	String name = "スライム"; //個体名
	
	public Slime (int hp , char suffix) {
		super(hp , suffix);
	}
	
	public void run() {
		System.out.println(this.name + this.suffix + "は、体をうねらせて逃げ出した。");
	}

}
