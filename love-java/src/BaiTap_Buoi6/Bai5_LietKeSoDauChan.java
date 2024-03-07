package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai5_LietKeSoDauChan {

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

		// Hàm liệt kê các số đầu là số chẵn
		lietKeSoDauChan(mangArray);
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

	private static void lietKeSoDauChan(int[] mangArray) {
		System.out.println("Các số có chữ số đầu tiên là số lẻ: ");
		for (int i = 0; i < mangArray.length; i++) {
			if (demSo(Math.abs(mangArray[i])) + 1 == 3 && (mangArray[i] / 100) % 2 == 0) {
				System.out.format("a[%d]= %d \n", i, mangArray[i]);
			}
			if (demSo(Math.abs(mangArray[i])) + 1 == 2 && (mangArray[i] / 10) % 2 == 0) {
				System.out.format("a[%d]= %d \n", i, mangArray[i]);
			}
			if (demSo(Math.abs(mangArray[i])) == 0 && (mangArray[i] % 10) % 2 == 0) {
				System.out.format("a[%d]= %d \n", i, mangArray[i]);
			}
		}
	}

	private static int demSo(int i) {
		int dem = 0;
		while (i >= 10) {
			i /= 10;
			dem++;
		}
		return dem;
	}
}
