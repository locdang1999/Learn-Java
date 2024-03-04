package TD44_Buoi1;

import java.util.Scanner;

public class Bt2_operator {
	public static void main(String [] args) {
		/*
		 * Viết chương trình cho người dùng nhập vào 3 môn toán , văn, anh
		 * In ra tổng tb 3 môn
		 */
		/*Scanner sc = new Scanner(System.in);
		float diemToan=0,diemVan=0,diemAnh=0,tong=0;
		System.out.print("Nhập điểm môn Toán: ");
		diemToan=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm môn Toán: ");
		diemVan=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm môn Toán: ");
		diemAnh=Float.parseFloat(sc.nextLine());
		tong=(diemToan+diemVan+diemAnh)/3;
		System.out.println("Tổng điểm 3 môn:" + tong);*/
		Scanner sc = new Scanner(System.in);
		float tong=0;
		System.out.print("Nhập điểm môn Toán: ");
		tong=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm môn Toán: ");
		tong=tong+Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm môn Toán: ");
		tong=tong+Float.parseFloat(sc.nextLine());
		//tong=(diemToan+diemVan+diemAnh)/3;
		System.out.println("Tổng điểm 3 môn:" + tong/3);
	}

}
