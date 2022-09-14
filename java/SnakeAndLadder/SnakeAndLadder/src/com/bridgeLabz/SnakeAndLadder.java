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
	 * @param args
	 */
	public static void main(String[] args) {
		//Driving Class
		//Initializing and declaring final since there will be only one player
		final int noOfPlayer=1;
		int startpostion =0;
		int n=0;
		Random r = new Random();
		n=r.nextInt(6)+1;

		System.out.println(n);
	}

}
