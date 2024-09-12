package studio2;
import java.util.*;
public class PiApproximation {

	public static void main(String[] args) {
		double xPos, yPos;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Num of iterations");
		int iterations = scan.nextInt();
		double numDarts = 0;
		double totalDarts = 0;
		double approximation;
		for(int i = 0; i < iterations; i++) {
			xPos = Math.random();
			yPos = Math.random();

			if((Math.pow(xPos, 2) + Math.pow(yPos, 2))<=1) {
				numDarts +=1;
				totalDarts +=1;
			}else {
				totalDarts +=1;
			}
		}
		approximation = (numDarts/totalDarts)*4;
		System.out.println(approximation);
	}

}
