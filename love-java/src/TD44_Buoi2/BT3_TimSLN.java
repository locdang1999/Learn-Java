package TD44_Buoi2;

import java.util.Scanner;

public class BT3_TimSLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int so1, so2;
		System.out.print("Nhập số thứ 1: ");
		so1=sc.nextInt();
		System.out.print("Nhập số thứ 2: ");
		so2=sc.nextInt();
		if(so1>so2) {
			System.out.println("Số lớn nhất là: " + so1);
		}else {
			if(so1==so2) {
				System.out.println("Hai số bằng nhau");
			}else{
				System.out.println("Số lớn nhất là: " + so2);
			}
		}
	}

}
