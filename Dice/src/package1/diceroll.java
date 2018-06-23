package package1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class diceroll {
	
	int Dice_Phases,Outcome;
	
	public diceroll(int Dice_Phases){ //Constructor which gets the number of phases of a dice as its parameter
		this.Dice_Phases=Dice_Phases;
	}
	
	public void Dice_Outcome(){
		
		//Condition when number of phases are 4
		
		if(Dice_Phases==4){
			Outcome=ThreadLocalRandom.current().nextInt(1, 4+ 1); // Generate Random number from 1 to 4
			System.out.println("Outcome of Dice :"+Outcome);
		}
		
		//Condition when number of phases are 6
		
		else if(Dice_Phases==6){
			Outcome=ThreadLocalRandom.current().nextInt(1,6+1); // Generate Random number from 1 to 6
			System.out.println("Outcome of Dice :"+Outcome);
		}
		
		//Condition when number of phases are 2
		
		else if(Dice_Phases==2){
			String Two_Phase[]={"Head","Tail"};
			String outcome = (Two_Phase[new Random().nextInt(Two_Phase.length)]); //Select Random value from array Two_Phase
			System.out.println("Outcome of Dice :"+outcome);
		}
		
		//Condition when number of phases are other than 2,4,and 6
		
		else{
			System.out.println("Invalid Number of Dice Phases");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diceroll dice=new diceroll(4); //Passing number of phases as a parameter
		dice.Dice_Outcome();

	}

}
