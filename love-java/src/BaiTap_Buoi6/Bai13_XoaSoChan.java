package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai13_XoaSoChan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, -100, 100);

		// Xuất giá trị của mảng
		System.out.println("Giá trị của mảng: ");
		xuatMangArray(mangArray, n);

		// Hàm xóa tất cả các số chẳn có trong mảng và cập nhật lại số lượng phần tử trong mảng
		n = xoaSoAm(mangArray, n);
		xuatMangArray(mangArray, n);
	}

	private static int[] taoGiaTriMangArray(int[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(int[] mangArray, int n) {
		for (int i = 0; i < n; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}
	}

	private static int xoaSoAm(int[] mangArray, int n) {
		System.out.println("Xóa tất cả các số chẵn trong mảng số thực: ");
		int i, c;
		for (c = i = 0; i < n; i++) {
			if (mangArray[i] % 2 != 0) {
				mangArray[c] = mangArray[i];
				c++;
			}
		}
		return c;
	}

}
