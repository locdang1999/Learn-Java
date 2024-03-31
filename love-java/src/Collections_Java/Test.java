package Collections_Java;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Array
		int[] arr1 = new int[5];
		float[] arr2 = new float[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử cho mảng: ");
		int n = sc.nextInt();

		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.format("\nNhập List[%d] = ", +i);
			list[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < n; i++) {
			if (list[i] % 3 == 0) {
				total += list[i];
			}
		}
		System.out.println("Total: " + total);

	}
}
