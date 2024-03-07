package Kienthuc;

import java.util.Scanner;

public class bai5_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập i");
		n = sc.nextInt();
		for(int i=0; i<=n;i++) {
			System.out.println("i" + i + "=" + i);
		}
		int a;
		System.out.println("Nhập a");
		a=sc.nextInt();
		while(a<=10) {
			System.out.println("Giá trị trong vòng while " + a);
			break;
		}
		do {
			System.out.println("Giá trị trong vòng do while " + a);
			a++;
		}while(a<=10);
	}
}