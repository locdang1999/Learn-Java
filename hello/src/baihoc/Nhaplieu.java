package baihoc;

import java.util.Scanner;

public class Nhaplieu {
	public static void main (String[] args) {
		//Mỗi kiểu dữ liệu đều có 1 Scanner riêng
		Scanner sc = new Scanner(System.in);
		//MaSV
		System.out.println("Moi ban nhap Ma sinh vien");
		String maSV=sc.nextLine();
		//TenSV
		//khoi tao lai Scanner khi chuyen qua lai giua cac kieu du lieu
		sc = new Scanner(System.in);
		System.out.println("Moi ban nhap tên sinh viên");
		String tenSV = sc.nextLine();
		//GT
		sc = new Scanner(System.in);
		System.out.println("Moi ban nhap giới tính");
		Boolean gt=sc.nextBoolean();
		//Email
		sc = new Scanner(System.in);
		System.out.println("Moi ban nhap email");
		String email=sc.nextLine();
		//Sđt
		sc = new Scanner(System.in);
		System.out.println("Moi ban nhap sđt");
		int sdt=sc.nextInt();
		//Point
		sc = new Scanner(System.in);
		System.out.println("Moi ban nhap điểm");
		Float point=sc.nextFloat();
		//Xuất dữ liệu
		System.out.println("MaSV cua ban la: " + maSV);
		System.out.println("Họ và tên của bạn là: " + tenSV);
		System.out.println("Giới tính của bạn là: " + gt);
		System.out.println("Email của bạn là: " + email);
		System.out.println("Telephone number: " + sdt);
		System.out.println("Point of you: " + point);
	}
}
