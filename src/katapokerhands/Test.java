/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katapokerhands;

public class Test{
	public static void main(String[] args){
		String[] inputs = new String[]{
			"Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH",
			"Black: 2H 4S 4C 2D 4H  White: 2S 8S AS QS 3S",
			"Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C KH",
			"Black: 2H 3D 5S 9C KD  White: 2D 3H 5C 9S KH"
		};

		String[] goals = new String[]{
			"White wins. - with high card: Ace",
			"Black wins. - with full house: 4 over 2",
			"Black wins. - with high card: 9",
			"Tie."
		};

		for (int i = 0; i < inputs.length; i++){
			String input = inputs[i];
			KataPokerHands game = new KataPokerHands(input);
			String[] hands = game.getHandsString().split("\n");
			String output = game.getResult();
			String goal = goals[i];

			System.out.println("Input : " + input);
			System.out.println("Hands : " + hands[0]);
			System.out.println("      : " + hands[1]);
			System.out.println("Output: " + output);
			System.out.println("Goal  : " + goal + "\n");
		}
	}
}