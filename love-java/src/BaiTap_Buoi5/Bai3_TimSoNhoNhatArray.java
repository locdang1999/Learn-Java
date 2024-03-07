package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai3_TimSoNhoNhatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Tìm số nhỏ nhất trong mảng.
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số lượng phần tử trong mảng bạn muốn: ");
		soPhanTu = Integer.parseInt(sc.nextLine());
		int[] arraySoDuong = new int[soPhanTu];

		// xử lý
		// nhập giá trị phần tử cho mảng
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= ", i);
			arraySoDuong[i] = Integer.parseInt(sc.nextLine());
		}
		// Xuất các phần tử trong mảng và tìm phần tử nhỏ nhất trong mảng
		//System.out.println("Xuất các phần tử trong mảng");

		int min = arraySoDuong[0];// khởi tạo biến min là biến nhỏ nhất và gán bằng phần tử thứ nhất của mảng
		for (int i = 1; i < arraySoDuong.length; i++) {
			//System.out.format("a[%d]= %d \n", i, arraySoDuong[i]);
			if (min > arraySoDuong[i]) {
				min = arraySoDuong[i];
			}
		}
		// xuất ra kết quả màn hình
		System.out.println("Số nhỏ nhất trong mảng là: " + min);

	}

}
