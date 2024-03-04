package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai6_SoLeSoChan {
	/*
	 * Cho 3 số nguyên. Xuất ra bao nhiêu số lẻ bao nhiêu số chẵn
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int so1,so2,so3,tongSoChan=0,tongSoLe=0;
		System.out.print("Nhập số nguyên thứ 1: ");
		so1=sc.nextInt();
		System.out.print("Nhập số nguyên thứ 2: ");
		so2=sc.nextInt();
		System.out.print("Nhập số nguyên thứ 3: ");
		so3=sc.nextInt();
		//xử lý
		if(so1%2==0) {
			tongSoChan=++tongSoChan;
		}else {
			tongSoLe=++tongSoLe;
		}
		if(so2%2==0) {
			tongSoChan=++tongSoChan;
		}else {
			tongSoLe=++tongSoLe;
		}
		if(so3%2==0) {
			tongSoChan=++tongSoChan;
		}else {
			tongSoLe=++tongSoLe;
		}
		//xuất
		System.out.println("Tổng số chẵn là: " + tongSoChan);
		System.out.println("Tổng số lẻ là: " + tongSoLe);

	}

}
