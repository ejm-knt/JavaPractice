package drivePractice08Q1;

public class Main {

	public static void main(String[] args) {
		Pokemon[] pokes = new Pokemon[3];
		
		pokes[0] = new Pokemon("ひとかげ",100);
		pokes[1] = new Pokemon("ぜにがめ",50);
		pokes[2] = new Pokemon("フシギダネ",200);
		
		for (int i = 0; i < pokes.length; i++) {
			for (int j = i+1 ; j < pokes.length; j++) {
				if(pokes[i].getHp() < pokes[j].getHp()){
					//入れけるのはポケモン自体
					Pokemon temp = pokes[i];
					pokes[i] = pokes[j];
					pokes[j] = temp;
				}
			}
		}
		
		for(Pokemon item : pokes){
			System.out.println(item.getName() + "[" +item.getHp()+ "]");
		}
	}

}
