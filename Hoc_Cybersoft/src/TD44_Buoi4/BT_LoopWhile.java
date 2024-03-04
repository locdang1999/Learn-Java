package TD44_Buoi4;

import java.util.Scanner;

public class BT_LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tính tổng các số lớn hơn không do người dùng nhập
		 * CHương trình sẽ dừng khi nhập số âm hoặc 0
		 */
		Scanner sc = new Scanner(System.in);
		int so,tong=0;
		System.out.print("Nhập số: ");
		so = Integer.parseInt(sc.nextLine());
		while(so>0) {
			if(so>0) {
				tong=so+so;
			}
			System.out.print("Nhập số: ");
			so = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Tổng các số bạn vừa nhập: " + tong);

	}

}
