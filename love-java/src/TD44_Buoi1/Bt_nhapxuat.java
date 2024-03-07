package TD44_Buoi1;

import java.util.Scanner;

public class Bt_nhapxuat {
	public static void main(String [] args) {
		/*
		 * Viết chương trình cho người dùng nhạp họ ,tên và tuổi
		 * In ra tông tin dạng sau:
		 * họ tên - tuổi
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ của bạn: ");
		String ho=sc.nextLine();
		System.out.print("Nhập tên của bạn: ");
		String ten=sc.nextLine();
		System.out.print("Nhập tuổi của bạn: ");
		byte age = sc.nextByte();
		System.out.println(ho + " " + ten + " - " + age);
	}

}
