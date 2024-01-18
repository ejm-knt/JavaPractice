package program12;

public class Matango extends Monster{
	final int LEVEL = 10;

	
	public Matango(int hp , char suffix) {
		super(hp , suffix);
	}

	public void run() {
		System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
	}
	
}
