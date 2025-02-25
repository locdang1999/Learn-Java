package laernBasic;

import java.security.SecureRandom;

//Day 1 - Generating a random number within a specific range.

public class Day001 {
	
	public static final SecureRandom SECURE_RANDOM = new SecureRandom();
	
	
	public static void main(String[] args) {
		System.out.println("Generating a number between 50 and 100...");
		System.out.println(randomNumberBetween(50, 100));
		System.out.println(SECURE_RANDOM.getAlgorithm());
	}
	
	private static int randomNumberBetween(int minimum, int maximum) {
		return SECURE_RANDOM.nextInt(maximum - minimum) + minimum;
	}

}
