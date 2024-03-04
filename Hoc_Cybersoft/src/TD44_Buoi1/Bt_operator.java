package TD44_Buoi1;

import java.util.Scanner;

public class Bt_operator {
	public static void main(String [] args) {
		/*
		 * NHâp 3 số tự nhiên
		 * In ra tổng 3 số vừa nhập
		 */
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Nhập số tự nhiên thứ nhất: ");
		int a = sc.nextInt();
		System.out.print("Nhập số tự nhiên thứ nhất: ");
		int b = sc.nextInt();
		System.out.print("Nhập số tự nhiên thứ nhất: ");
		int c = sc.nextInt();
		int S=a+b+c;
		System.out.print("Tổng 3 số vừa nhập: " + S);*/
		System.out.print("Nhập số tự nhiên thứ 1: ");
		//String  a3 = sc.nextLine();
		int a=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số tự nhiên thứ 1: ");
		//String  a3 = sc.nextLine();
		int b=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số tự nhiên thứ 1: ");
		//String  a3 = sc.nextLine();
		int c=Integer.parseInt(sc.nextLine());
		int S=a+b+c;
		System.out.print("Tổng 3 số vừa nhập: " + S);


	}
}
