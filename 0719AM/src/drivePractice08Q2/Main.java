package drivePractice08Q2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int randAlphabet;
		String Alphabet;
		int randScore;
		Person[] person = new Person[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			randAlphabet =  new Random().nextInt(6)+1;
			
			switch(randAlphabet) {
			case 1:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("A" , randScore);
			break;
			case 2:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("B" , randScore);
			break;
			case 3:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("C" , randScore);
			break;
			case 4:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("D" , randScore);
			break;
			case 5:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("E" , randScore);
			break;
			case 6:
				randScore = new Random().nextInt(1000);
				person[i] = new Person("F" , randScore);
			break;
			
			}
		}
	
		for (int i = 0; i < person.length; i++) {
			for (int j = i+1 ; j < person.length; j++) {
				if(person[i].getScore() < person[j].getScore()){
					//入れけるのはポケモン自体
					Person temp = person[i];
					person[i] = person[j];
					person[j] = temp;
				}
			}
		}
			
		for (int i = 0 ; i < 10 ; i++ ) {
			System.out.println(person[i].getName() + "は" + person[i].getScore());
		}
		

	}

}
