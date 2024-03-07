package TD44_Buoi1;

import java.util.Scanner;

public class DemoNhapXuat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên của bạn: ");
		String name = sc.nextLine();	
		System.out.println(name+" đang nhìn bạn kìa!!!");
		//Chuyển đổi nhập là số sang số
		System.out.print("Nhập số: ");
		String chuoiNhap=sc.nextLine();
		int So1 = Integer.parseInt(chuoiNhap);//Đổi chuổi là int sang int
		System.out.println("Số vừa nhập: " + So1);
	}
}
