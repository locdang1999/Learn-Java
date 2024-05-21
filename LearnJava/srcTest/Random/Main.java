package Random;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int num = 0;
		Random rand = new Random();
		num = rand.nextInt(999999);
		System.out.println(num);
	}
}
