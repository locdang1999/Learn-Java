package TD44_Buoi6;

import java.util.Scanner;

public class BTNhom_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		int[] mangInt;
		System.out.print("Nhập số phần tử: ");
		n = Integer.parseInt(scanner.nextLine());
		mangInt = new int[n];
		mangInt = taoSoNgauNhien(mangInt, -100, 100);
		xuatMang(mangInt);
		System.out.println();
		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] < 0) {
				System.out.println(i + ", "+mangInt[i]);
				for (int j = i+1; j < mangInt.length; j++) {
					if(mangInt[i]==mangInt[j]) {
						System.out.println(j + ", "+mangInt[j]);
					}
				}
				break;
			}
		}
	}

	private static int[] taoSoNgauNhien(int[] mangInt, int a, int b) {
		for (int i = 0; i < mangInt.length; i++) {
			mangInt[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangInt;
	}

	private static void xuatMang(int[] mangInt) {
		// xuất mảng
		System.out.print("Mảng đã nhập: ");
		for (int i = 0; i < mangInt.length; i++) {
			System.out.print(mangInt[i] + " ");
		}
	}

}
