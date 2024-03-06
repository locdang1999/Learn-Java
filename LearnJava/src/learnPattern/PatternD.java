package learnPattern;

public class PatternD {
	public static void main(String[] args) {
		int height = 15;
		for (int i = 0; i <= height; i++) {
			for (int start = 0; start <= height; start++) {
				if (i == 0 || i == height) {
					System.out.print("*");
				}
			}
			if (i == 0 || i == height) {
				System.out.println();
			} else {
				System.out.println(String.format("*%" + (height + 2) + "s", "*"));
			}
		}

	}
}
