package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai2_CapGiaTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số phần tử cho mảng: ");
		soPhanTu = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[soPhanTu];

		// Tạo giá trị cho mảng
		mangArray = nhapMang(mangArray, 0, 10);

		System.out.println("Xuất giá trị cho các phần tử trong mảng:");
		xuatMang(mangArray);

		// Hàm tìm khoảng cách nhỏ nhất của các cặp số
		//timKhoangCachMin(mangArray);
		System.out.println("Các cặp số gần nhau nhất: ");
		timCapSo(mangArray);

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

	private static void xuatMang(int[] mangArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}

	}

	private static int[] nhapMang(int[] mangArray, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangArray;

	}

}
