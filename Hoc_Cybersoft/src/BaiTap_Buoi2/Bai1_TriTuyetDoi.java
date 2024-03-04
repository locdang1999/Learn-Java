package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai1_TriTuyetDoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float so1, so2, so3;
		System.out.print("Nhập số thực thứ 1: ");
		so1=sc.nextFloat();
		System.out.print("Nhập số thực thứ 2: ");
		so2=sc.nextFloat();
		System.out.print("Nhập số thực thứ 3: ");
		so3=sc.nextFloat();
		if(so1<0){
			so1=-so1;
		}
		if (so2<0) {
			so2=-so2;
		}
		if (so3<0) {
			so3=-so3;
		}
		System.out.format("3 số thực trên (chuyển âm qua dương nếu có): a=%.0f b=%.0f c=%.0f", so1,so2,so3);
	}

}
