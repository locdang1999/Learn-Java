package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai7_TongCacSoCoChuSoHangChucLa_5 {
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

		// Hàm tính tổng các số có chữ số hàng chục là 5
		tinhTongChuSo(mangArray);
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

	private static void tinhTongChuSo(int[] mangArray) {
		System.out.println("Tổng các chữ số có hàng chục bằng 5 ");
		for (int i = 0; i < mangArray.length; i++) {
			int tong = 0;
			if ((Math.abs(mangArray[i]) / 10) % 10 == 5) {
				tong = tong + (mangArray[i] / 100) + ((mangArray[i] / 10) % 10) + (mangArray[i] % 10);
				System.out.format("Tổng a[%d]= %d= %d \n", i, mangArray[i], tong);
			}
		}
	}

}
