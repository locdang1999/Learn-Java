package BaiTap_Buoi6;

import java.util.Scanner;

public class Bt12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		float[] mangArray = new float[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -100, 100);

		// Xuất giá trị của mảng
		System.out.println("Giá trị của mảng: ");
		xuatMangArray(mangArray, n);

		// Hàm xóa tất cả các số âm có trong mảng
		n = xoaSoAm(mangArray, n);
		xuatMangArray(mangArray, n);
	}

	private static float[] taoGiaTriMangArray(float[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (float) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(float[] mangArray, int n) {
		for (int i = 0; i < n; i++) {
			System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
		}
	}

	private static int xoaSoAm(float[] mangArray, int n) {
		System.out.println("Xóa tất cả các số lớn nhất trong mảng số thực: ");
		int i, c;
		for (c = i = 0; i < n; i++) {
			if (mangArray[i] > 0) {
				mangArray[c] = mangArray[i];
				c++;
			}
		}
		return c;
	}

}
