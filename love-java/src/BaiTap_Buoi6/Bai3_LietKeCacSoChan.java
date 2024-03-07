package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai3_LietKeCacSoChan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, y;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -100, 100);

		// Xuất giá trị của mảng
		xuatMangArray(mangArray);

		// Nhập giá trị cho đoạn
		System.out.print("Nhập x của đoạn[x,y]: ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập y của đoạn[x,y]: ");
		y = Integer.parseInt(sc.nextLine());
		// Hàm liệt kê các số chẵn trong đoan x,y
		lietKeSoChan(mangArray, x, y);
	}

	private static int[] taoGiaTriMangArray(int[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(int[] mangArray) {
		System.out.println("Giá trị của mảng: ");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}
	}

	private static void lietKeSoChan(int[] mangArray, int x, int y) {
		for (int i = 0; i < mangArray.length; i++) {
			if (x <= mangArray[i] && mangArray[i] <= y && mangArray[i] % 2 == 0) {
				System.out.format("a[%d]= %d \n", i, mangArray[i]);
			}
		}
	}

}
