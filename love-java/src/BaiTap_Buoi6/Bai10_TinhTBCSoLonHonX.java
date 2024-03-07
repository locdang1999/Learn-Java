package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai10_TinhTBCSoLonHonX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		float[] mangArray = new float[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -1000, 1000);

		// Xuất giá trị của mảng
		xuatMangArray(mangArray);

		// Tính trung bình cộng các số nhỏ hơn x do người dùng nhập
		float x;
		System.out.println("Tính trung bình cộng các số nhỏ hơn x");
		System.out.print("Nhập x: ");
		x = Float.parseFloat(sc.nextLine());
		// Hàm tính tổng các số lớn hơn số x
		tinhTrungBinhCong(mangArray, x);
	}

	private static float[] taoGiaTriMangArray(float[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (float) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(float[] mangArray) {
		System.out.println("Giá trị của mảng: ");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
		}
	}

	private static void tinhTrungBinhCong(float[] mangArray, float x) {
		float trungBinhCong = 0;
		int dem = 0;
		for (int i = 0; i < mangArray.length - 1; i++) {
			if (mangArray[i] > x) {
				System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
				trungBinhCong += mangArray[i];
				dem++;
			}
		}
		System.out.format("Tổng các số thực dương có trng mảng: %.1f\n", trungBinhCong);
		trungBinhCong /= dem;
		System.out.format("Tổng các số thực dương có trng mảng: %.1f", trungBinhCong);
	}

}
