package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai17_DaoNguoc {
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

		// Hàm xóa tất cả các số chẳn có trong mảng và cập nhật lại số lượng phần tử
		// trong mảng
		daoNguocMang(mangArray, n);
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

	private static void daoNguocMang(int[] mangArray, int n) {
		for (int i = 0; i <= n / 2; i++) {
			int temp = mangArray[i];
			mangArray[i] = mangArray[n - 1 - i];
			mangArray[n - 1 - i] = temp;
		}
		System.out.println("Mảng được đảo ngược lại là:");
		for (int i = 0; i < n; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}
	}

}
