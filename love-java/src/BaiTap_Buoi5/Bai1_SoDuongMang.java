package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai1_SoDuongMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Tổng các số dương  trong mảng.
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu,tongSoDuong=0;
		System.out.print("Nhập số lượng phần tử trong mảng bạn muốn: ");
		soPhanTu = Integer.parseInt(sc.nextLine());
		int[] arraySoDuong = new int[soPhanTu];

		// xử lý
		// nhập giá trị phần tử cho mảng
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= ", i);
			arraySoDuong[i] = Integer.parseInt(sc.nextLine());
		}
		// Xuất các phần tử trong mảng và cộng các phần tử là số nguyên dương trong mảng
		System.out.println("Xuất các phần tử trong mảng");
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= %d \n", i, arraySoDuong[i]);
			if(arraySoDuong[i]>0) {
				tongSoDuong=tongSoDuong+arraySoDuong[i];
			}
		}
		//xuất ra kết quả màn hình
		System.out.println("Tổng các số nguyên dương có trong mảng là: " + tongSoDuong);

	}

}
