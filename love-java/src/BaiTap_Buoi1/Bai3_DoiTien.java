package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai3_DoiTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tienV,tienD,tyGia=23500;
		System.out.print("Nhập số tiền USD bạn muốn quy đổi: ");
		tienD=Integer.parseInt(sc.nextLine());
		//xử lý
		tienV=tienD*tyGia;
		//xuất
		System.out.println("Quy đổi USD-->VND: " + tienV +"VND");
	}

}
