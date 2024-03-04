package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai1_TinhTienLuongNV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int luong=100000,luongNV,ngayLam;
		System.out.print("Nhập số ngày làm của nhân viên: ");
		ngayLam=Integer.parseInt(sc.nextLine());
		//xử lý
		luongNV=ngayLam*luong;
		//xuất
		System.out.println("Tiền lương của nhân viên theo số ngày làm: " + luongNV);
	}

}
