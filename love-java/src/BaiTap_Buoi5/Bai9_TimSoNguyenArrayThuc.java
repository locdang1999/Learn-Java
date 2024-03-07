package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai9_TimSoNguyenArrayThuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?
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
		//xuatMang(mangArray);
		// Đếm số nguyên
		//demSoNguyen(mangArray);
		System.out.println("Cạp số");
		timCapSo(mangArray);

	}

	private static void xuatMang(int[] mangArray) {
		// TODO Auto-generated method stub
		System.out.println("Các giá trị trong mảng:");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %.1f\n", i, mangArray[i]);
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
		int n = 0;
		for (int i = 0; i < mangArray.length; i++) {
			if (mangArray[i] == (int) mangArray[i]) {
				n++;
			}
		}
		System.out.println("Số lượng số nguyên trong mảng là: " + n);
	}

	private static int timKhoangCachMin(int[] mangArray) {
		// TODO Auto-generated method stub
		int khoangCanhMin = Math.abs(mangArray[0] - mangArray[1]);
		for (int i = 0; i < mangArray.length; i++) {
			for (int j = i + 1; j < mangArray.length; j++) {
				if (Math.abs(mangArray[i]-mangArray[j]) < khoangCanhMin) {
					khoangCanhMin = Math.abs(mangArray[i]-mangArray[j]);
				}
			}
		}
		return khoangCanhMin;
	}
	private static void timCapSo(int[] mangArray) {
		// TODO Auto-generated method stub
		int khoangCachMin = timKhoangCachMin(mangArray);
		for (int i = 0; i < mangArray.length; i++) {
			for (int j = i + 1; j < mangArray.length; j++) {
				if (Math.abs(mangArray[i] - mangArray[j]) == khoangCachMin) {
					System.out.println(mangArray[i]+" ,"+mangArray[j]);
				}
			}
		}

	}
}
