package BaiTap_Buoi1;

import java.util.Scanner;

public class BT2_Tong3ChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int so,tongSo=0;
		System.out.print("Nhập số nguyên dương có 3 chữ số: ");
		so=Integer.parseInt(sc.nextLine());
		//xử lý
		//so=so/100+(so%100)/10+so%10;
		while(so>0) {
			tongSo=tongSo+so%10;
			so=so/10;
		}
		//xuât
		System.out.println("Tổng số nguyên dương có 3 chữ số là: " + tongSo);
	}

}
