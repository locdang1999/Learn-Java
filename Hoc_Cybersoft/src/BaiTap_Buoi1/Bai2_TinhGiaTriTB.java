package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai2_TinhGiaTriTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float so;
		System.out.print("Nhập số thực thứ 1: ");
		so=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số thực thứ 2: ");
		so=so + Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số thực thứ 3: ");
		so=so + Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số thực thứ 4: ");
		so=so + Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số thực thứ 5: ");
		so=so + Float.parseFloat(sc.nextLine());
		//xử lý
		so=so/5;
		//xuất
		System.out.println("Giá trị trung bình của 5 số thực vừa nhập: " + so);
	}

}
