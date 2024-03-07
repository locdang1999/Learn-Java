package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai5_TimSoChanCuoiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1.
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

		// Xuất các phần tử trong mảng và tìm số chẵn cuối trong mảng
		System.out.println("Xuất các phần tử trong mảng");

		// xuất ra kết quả màn hình
		System.out.println("Số chẵn cuối cùng trong mảng có trong mảng là: " + timSoChan(arraySoDuong));

	}

	private static int timSoChan(int[] arraySoDuong) {
		// TODO Auto-generated method stub
		int soChan = arraySoDuong[0];
		for (int i = 0; i < arraySoDuong.length; i++) {
			System.out.format("a[%d]= %d \n", i, arraySoDuong[i]);
			if (arraySoDuong[i] % 2 == 0) {
				soChan = arraySoDuong[i];
			}
		}
		if (soChan % 2 == 0) {
			return soChan;
		}
		return -1;

	}

}
