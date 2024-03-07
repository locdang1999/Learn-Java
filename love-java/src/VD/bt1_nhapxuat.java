package VD;

import java.util.Scanner;

public class bt1_nhapxuat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của bạn: ");
		String name = sc.nextLine();
		System.out.println("Nhập tuổi của bạn: ");
		int age = sc.nextInt();
		System.out.println("Nhập địa chỉ của bạn: ");
		sc=new Scanner(System.in);
		String dc = sc.nextLine();
		System.out.println("Nhập email của bạn: ");
		String eMail = sc.nextLine();
		System.out.println("Nhập số điện thoại cảu bạn: ");
		String phoneNumber = sc.nextLine();
		System.out.println("Họ và tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Địa chỉ: " + dc);
		System.out.println("Email: " + eMail);
		System.out.println("Số điện thoại: " + phoneNumber);
	}
}
