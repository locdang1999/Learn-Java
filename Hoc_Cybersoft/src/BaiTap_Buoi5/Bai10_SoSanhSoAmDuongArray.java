package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai10_SoSanhSoAmDuongArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		soPhanTu = Integer.parseInt(sc.nextLine());

		// Tạo mảng
		int[] mangArray = new int[soPhanTu];

		// Nhập giá trị các phần tử của mảng
		nhapMang(mangArray, sc);

		// Xuất mảng
		xuatMang(mangArray);
		// Đếm số nguyên
		demSoNguyen(mangArray);

	}

	private static void xuatMang(int[] mangArray) {
		// TODO Auto-generated method stub
		System.out.println("Các giá trị trong mảng:");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %d\n", i, mangArray[i]);
		}

	}

	private static void nhapMang(int[] mangArray, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Nhập giá trị từng phần tử cho mảng: \n");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= ", i);
			mangArray[i] = Integer.parseInt(sc.nextLine());
		}

	}

	private static void demSoNguyen(int[] mangArray) {
		int soDuong = 0, soAm = 0;
		for (int i = 0; i < mangArray.length; i++) {
			if (mangArray[i] > 0) {
				soDuong++;
			}
			if (mangArray[i] < 0) {
				soAm++;
			}
		}
		if (soDuong > soAm) {
			System.out.println("Số dương nhiều hơn với số lượng là: " + soDuong);
		}
		if (soDuong < soAm) {
			System.out.println("Số âm nhiều hơn với số lượng là: " + soAm);
		}
		if (soAm == soDuong) {
			System.out.println("Hai số bằng nhau với số lượng là: " + soAm);
		}

	}

}
