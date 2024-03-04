package BaiTap_Buoi4;

import java.util.Scanner;

public class Bai3_TinhTongSoChan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int so, tongSo = 0;
		do {
			System.out.print("Nhập số bạn muốn(Số 0 thoát): ");
			so = Integer.parseInt(sc.nextLine());
			if (so % 2 == 0) {
				tongSo = tongSo + so;
			}
		} while (so != 0);
		System.out.println("Tổng các số bạn vừa nhập: " + tongSo);

	}

}
