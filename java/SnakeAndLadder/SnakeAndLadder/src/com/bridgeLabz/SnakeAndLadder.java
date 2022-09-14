/**
 * 
 */
package com.bridgeLabz;

import java.util.Random;

/**
 * @author Admin
 *
 */
public class SnakeAndLadder {

	/**
	 * UC5
	 * Ensure the player gets to exact winning position 100
	 */
	public static void main(String[] args) {
		//Driving Class
		//Initializing and declaring final since there will be only one player
		final int noOfPlayer=1;
		int position =0;
		int diceno =0;
		int positionmoved = 0;
		int checkForOption;
		while (positionmoved < 100) {
		//  for dice
		Random r = new Random();
		diceno =r.nextInt(6)+1;
		System.out.println("diceno"+diceno);
		
		// for option
		Random r1 = new Random();
		checkForOption = r1.nextInt(3);
		System.out.println("option"+checkForOption);
		if(checkForOption == 0) {
			System.out.println("NO PLAY");
			positionmoved = 0+positionmoved;
			System.out.println("positionMoved"+positionmoved);
		}else if(checkForOption == 1) {
			System.out.println("LADDER");
			positionmoved= positionmoved+diceno;
			System.out.println("positionMoved"+positionmoved);
		}else if(checkForOption == 2){
			System.out.println("SNAKE");
			positionmoved= positionmoved-diceno;
			System.out.println(positionmoved);
			if(positionmoved <= 0) {
				positionmoved=0;
			}
			System.out.println("positionMoved"+positionmoved);
		}
			System.out.println(positionmoved);
			if(positionmoved > 100) {
				positionmoved = positionmoved - diceno;
			}
		}
	}
}
