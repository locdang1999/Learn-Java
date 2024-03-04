package TD44_Buoi2;

import java.util.Scanner;

public class BT_if {
	public static void main (String [] args) {
		/*
		 * Nhập sô nguyên
		 * Nếu là số âm thì in ra số dương
		 */
		Scanner sc = new Scanner(System.in);
		int soThuc;
		System.out.print("Nhập số thực: ");
		soThuc=sc.nextInt();
		if(soThuc <0) {
			//soThuc=soThuc*(-1);
			//soThuc*=-1;
			soThuc=-soThuc;
		}
		System.out.println(soThuc);
	}
}
