package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai6_TinhTongGiaTriDuong {

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

		// Hàm tính tổng các giá trị dương
		tinhTong(mangArray);
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

	private static void tinhTong(float[] mangArray) {
		System.out.println("Tổng các số thực dương: ");
		float tongDuong = 0;
		for (int i = 0; i < mangArray.length; i++) {
			if (mangArray[i] > 0) {
				System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
				tongDuong = tongDuong + mangArray[i];
			}
		}
		System.out.format("Tổng các số thực dương có trng mảng: %.1f", tongDuong);
	}

}
