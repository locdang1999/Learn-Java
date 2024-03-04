package TD44_Buoi3;

import java.util.Scanner;

public class Baitap_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Viết chương trính in menu như sau:
		 * Menju: 
		 * 1. Chức năng 1
		 * 2. Chức năng 2
		 * 3. Chức năng 3
		 * 4. Chức năng 4
		 * 0. Thoát
		 * Lựa chọn:
		 * Nếu lựa chọn không nằm trong menu thì in ra thông báo không hợp lệ;
		 * Thực hiện các chức năng tương ứng theo lựa chọn của người dùng
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int soChon;
		System.out.println("Menu:");
		System.out.println("1. Chức năng 1");
		System.out.println("2. Chức năng 2");
		System.out.println("3. Chức năng 3");
		System.out.println("4. Chức năng 4");
		System.out.println("0. Thoát");
		System.out.print("Mời bạn chọn: ");
		soChon=Integer.parseInt(sc.nextLine());
		while(soChon>=0) {
			switch(soChon) {
				case 1: 
					System.out.println("Chức năng 1");
					break;
				case 2:
					System.out.println("Chức năng 2");
					break;
				case 3:
					System.out.println("Chức năng 3");
					break;
				case 4:
					System.out.println("Chức năng 4");
					break;
				case 0:
					System.out.println("Bạn đã thoát chương trình");
					System.exit(0);
				default:
					System.out.println("Lựa chọn không hợp lệ");
					break;
			}
			System.out.print("Mời bạn chọn: ");
			soChon=Integer.parseInt(sc.nextLine());
		}
		
	}

}
