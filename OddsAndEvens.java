package oddsandevens;

import java.util.Random;
import java.util.*;


public class OddsAndEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
	// Intro
	System.out.println("Let's play a game called Odds and Evens");
	System.out.print("What is your name? ");
	String userName = input.next();
	System.out.print("Hi " + userName + ", which do you choose? (O)dds or (E)vens? ");
	String oddsanswer = input.next();
	if (oddsanswer.equals("O")) {
		System.out.println(userName + " has picked odds! The computer will be evens ");
	} if (oddsanswer.equals("E")) {
			System.out.println(userName + " has picked evens! The computer will be odds ");
	}
			System.out.println("---------------------------------------------");
			
			// Takes in the number of "fingers" the user wants to play, and uses
			// the random generator to decide what the computer will play
			System.out.print("How many \"fingers\" do you put out? ");
			int userNumber = input.nextInt();
			Random rand = new Random();
			int computerNumber = rand.nextInt(6);
			System.out.println("The computer plays " + computerNumber + " \"fingers\" ");
			System.out.println("---------------------------------------------");
			
			// Sum adds the two integers of userNumber and computerNumber
			int sum = userNumber + computerNumber;
			System.out.println(userNumber + " + " + computerNumber + " = " + sum);
			boolean oddOrEven = sum % 2 == 0;
			int rem = (sum)%2;
			
			// Who wins based on the final answer being even or odd and declares the winner
			
	if (rem==0)	{
			System.out.println(sum + " is " + " even! ");		
			if (oddsanswer.equals("E")) {	
			System.out.println("That means " + userName + " wins! ");
			} else { 
			System.out.println("That means the computer wins! ");
	}
	} else {
		System.out.println(sum + " is " + " odd! ");
	 if (oddsanswer.equals("O")) {
		System.out.println("That means " + userName + " wins! ");
	
	} else {
		System.out.println("That means the computer wins! ");
		}
	
	}
	
}

}	
