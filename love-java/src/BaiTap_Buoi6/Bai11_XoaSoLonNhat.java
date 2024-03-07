package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai11_XoaSoLonNhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		float[] mangArray = new float[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -100, 100);

		// Xuất giá trị của mảng
		xuatMangArray(mangArray, n);

		// Hàm xóa tất cả các số lớn nhất trong mảng số thực và cập nhật lại số lượng phần tử trong mảng
		n = xoaSoLonNhat(mangArray, n);
		xuatMangArray(mangArray, n);
	}

	private static float[] taoGiaTriMangArray(float[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (float) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(float[] mangArray, int n) {
		System.out.println("Giá trị của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.format("a[%d]= %.1f \n", i, mangArray[i]);
		}
	}

	private static int xoaSoLonNhat(float[] mangArray, int n) {
		System.out.println("Xóa tất cả các số lớn nhất trong mảng số thực: ");
		float max = timMax(mangArray, n);
		int i, c;
		for (c = i = 0; i < n; i++) {
			if (mangArray[i] != max) {
				mangArray[c] = mangArray[i];
				c++;
			}
		}
		return c;
	}


	private static float timMax(float[] mangArray, int n) {
		// TODO Auto-generated method stub
		float max = mangArray[0];
		for (int i = 1; i < n; i++) {
			max = (max < mangArray[i]) ? mangArray[i] : max;
		}
		return max;
	}

}
