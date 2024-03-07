package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai8_TinhTongSoTriTuyetDoiLienSau {

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

		// Hàm tính tổng các số lớn hơn số đứng sau trị tuyệt đối
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
		System.out.println("Tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó: ");
		float tongMax = 0;
		for (int i = 0; i < mangArray.length - 1; i++) {
			for (int j = i + 1; j <= i + 1; j++) {
				if (mangArray[i] > Math.abs(mangArray[j])) {
					System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
					tongMax += mangArray[i];
				}
			}
		}
		System.out.format("Tổng các số thực dương có trong mảng: %.1f", tongMax);
	}

}
