package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai4_LietKeCacSoToanChuSoLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -1000, 1000);

		// Xuất giá trị của mảng
		xuatMangArray(mangArray);

		// Hàm liệt kê các số toàn chữ số lẻ
		lietKeSoLe(mangArray);
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

	private static void lietKeSoLe(int[] mangArray) {
		System.out.println("Các số toàn là chữ số lẻ: ");
		for (int i = 0; i < mangArray.length; i++) {
			if ((mangArray[i] / 100) % 2 != 0 && ((mangArray[i] / 10) % 10) % 2 != 0 && (mangArray[i] % 10) % 2 != 0) {
				System.out.format("a[%d]= %d \n", i, mangArray[i]);
			}
		}
	}

}
