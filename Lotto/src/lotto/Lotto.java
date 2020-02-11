package lotto;

import java.security.SecureRandom;

public class Lotto {
	
	// Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9)
	int[] randomNumbers = new int[3];

	// Randomly populates the array for a lotto object
	public Lotto() {
		SecureRandom randomObject = new SecureRandom();		
		randomNumbers[0] = 1 + randomObject.nextInt(9);
		randomNumbers[1] = 1 + randomObject.nextInt(9);
		randomNumbers[2] = 1 + randomObject.nextInt(9);
	}
	
	// Include a method in the class to return the array.	
	public int[] returnArray() {	
		return randomNumbers;
	}
}
