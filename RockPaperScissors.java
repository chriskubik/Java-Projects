package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.print("Does player one choose rock, paper, or scissors? ");
	String playerOne = input.next();
	System.out.print("Does player two choose rock, paper, or scissors? ");
	String playerTwo = input.next();
	
	if (playerOne.equals("rock")) {
		if (playerTwo.equals("scissors")) {
			System.out.println("player one wins! ");
		} else if (playerTwo.equals("paper")) {
			System.out.println("player two wins! ");
		} else if (playerTwo.equals("rock")) {
			System.out.println("it is a tie! ");
		}
	}
	
	if (playerOne.equals("paper")) {
		if (playerTwo.equals("scissors")) {
			System.out.println("player two wins! ");
		} else if (playerTwo.equals("rock")) {
			System.out.println("player one wins! ");
		} else if (playerTwo.equals("paper")) {
			System.out.println("It is a tie! ");
		}
	}
	 if (playerOne.equals("scissors")) {
		 if (playerTwo.equals("rock")) {
			 System.out.println("player two wins! ");
		 } else if (playerTwo.equals("paper")) {
			 System.out.println("plaer one wins! ");
		 } else if (playerTwo.equals("scissors")) {
			 System.out.println("It is a tie! ");
		 }
	 }
	}
}
