package Buoi1;

import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int so ;
		System.out.print("Nhập số bạn muốn kiểm tra: ");
		so = Integer.parseInt(sc.nextLine());
		if(so/10==0) {
			System.out.println("Chữ số của số bạn vừa nhập có 1 chữ số");
		}else if(so/10<10) {
			System.out.println("Chữ số của số bạn vừa nhập có 2 chữ số");
		}else if (so/10<100) {
			System.out.println("Chữ số của số bạn vừa nhập có 3 chữ số");
		}
	}
}
