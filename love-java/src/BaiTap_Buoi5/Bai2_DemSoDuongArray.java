package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai2_DemSoDuongArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Đếm có bao nhiêu số dương trong mảng.
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu,demSoDuong=0;
		System.out.print("Nhập số lượng phần tử trong mảng bạn muốn: ");
		soPhanTu = Integer.parseInt(sc.nextLine());
		int[] arraySoDuong = new int[soPhanTu];

		// xử lý
		// nhập giá trị phần tử cho mảng
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= ", i);
			arraySoDuong[i] = Integer.parseInt(sc.nextLine());
		}
		// Xuất các phần tử trong mảng và đếm các phần tử là số dương trong mảng
		System.out.println("Xuất các phần tử trong mảng");
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= %d \n", i, arraySoDuong[i]);
			if(arraySoDuong[i]>0) {
				demSoDuong++;
			}
		}
		//xuất ra kết quả màn hình
		System.out.println("Các số dương có trong mảng là: " + demSoDuong);

	}

}
