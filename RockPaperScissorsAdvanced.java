package rockpaperscissorsadvanced;

import java.util.Scanner;

public class RockPaperScissorsAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Does player one choose rock, paper, or scissors? ");
		String playerOne = input.next();
		System.out.print("Does player two choose rock, paper, or scissors? ");
		String playerTwo = input.next();
		
		
		if ((playerOne.equals("rock") && playerTwo.equals("scissors")) || (playerOne.equals("scissors") && playerTwo.equals("paper")) || (playerOne.equals("paper") && playerTwo.equals("rock"))) {
			System.out.println("Player one wins! ");
		} else if ((playerOne.equals("rock") && playerTwo.equals("paper")) || (playerOne.equals("paper") && playerTwo.equals("scissors")) || (playerOne.equals("scissors") && playerTwo.equals("rock"))) {
			System.out.println("Player two wins! ");
		} else { 
			System.out.println("It is a tie! ");
		}
	}	

}
