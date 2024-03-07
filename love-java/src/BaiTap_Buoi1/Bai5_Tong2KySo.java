package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai5_Tong2KySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kySo;
		System.out.print("Mời bạn nhập 1 số có 2 chữ số: ");
		kySo=Integer.parseInt(sc.nextLine());
		//xử lý
		kySo=kySo/10 + kySo%10;
		//xuất
		System.out.println("Tổng 2 ký số: " + kySo);
	}

}
