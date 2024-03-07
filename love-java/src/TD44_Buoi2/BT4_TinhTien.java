package TD44_Buoi2;

import java.util.Scanner;

public class BT4_TinhTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int houre, ray;
		float OT=1.5f,payment=0;
		System.out.print("Nhập số giờ bạn làm: ");
		houre = sc.nextInt();
		System.out.print("Nhập tiền phải trả trong 1 houre: ");
		ray = sc.nextInt();
		if(houre==40) {
			payment = houre*ray;
		}else if (houre>40) {
			payment=40*ray+(houre-40)*1.5f*ray;
		}
		System.out.println("Tiền lương phải trả: " + payment );
	}

}
