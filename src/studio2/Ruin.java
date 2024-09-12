package studio2;
import java.util.*;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		double startAmount, winChance, winLimit;
		
		System.out.println("Start Amount: ");
		startAmount = scan.nextDouble();
		System.out.println("Win Chance: ");
		winChance = scan.nextDouble()/100.0;
		System.out.println("Win Limit: ");
		winLimit = scan.nextDouble();
		int totalSimulations = 0;
		int totalLosses = 0;
		double currentMoney = startAmount;
		
		while((currentMoney < winLimit) && (currentMoney > 0)) {
			totalSimulations +=1;
			if(Math.random() < winChance) {
				currentMoney +=1;
			}else {
				currentMoney -=1;
				totalLosses +=1;
			}
			
		}
		System.out.println("Simulation exited with "+ totalLosses + " losses and " + currentMoney +" dollars.");
	}

}
