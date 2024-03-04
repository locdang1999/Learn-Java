package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai9_TinhTrungBinhCongSNT {
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

		// Hàm tính trung bình cộng các số nguyên tố
		tinhTrungBinhCongSNT(mangArray);
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

	private static void tinhTrungBinhCongSNT(int[] mangArray) {
		System.out.println("Trung bình cộng các số nguyên tố:");
		int soNguyenTo = 0, dem = 0;
		float tongSoNguyenTo = 0;
		for (int i = 0; i < mangArray.length; i++) {
			if (timSoNguyenTo(Math.abs(mangArray[i]))) {
				soNguyenTo = mangArray[i];
				dem++;
				System.out.format("a[%d]= %d \n", i, soNguyenTo);
				tongSoNguyenTo += soNguyenTo;
			}
		}
		System.out.format("Tổng các số nguyên tố: %.0f \n", tongSoNguyenTo);
		tongSoNguyenTo /= dem;
		System.out.format("Trung bình cộng các số nguyên tố: %.1f \n", tongSoNguyenTo);
	}

	private static boolean timSoNguyenTo(int i) {
		if (i <= 1) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
