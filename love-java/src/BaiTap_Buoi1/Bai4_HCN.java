package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai4_HCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chieuD, chieuR, dienTich,chuVi;
		System.out.print("Nhập chiều dài HCN: ");
		chieuD=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập chiều rộng HCN: ");
		chieuR=Integer.parseInt(sc.nextLine());
		//xử lý
		chuVi=(chieuD+chieuR)*2;
		dienTich=chieuD*chieuR;
		//xuất
		System.out.println("CHu vi HCN là: " + chuVi);
		System.out.println("Diện tích hình chữ nhật là: " + dienTich);
	}

}
