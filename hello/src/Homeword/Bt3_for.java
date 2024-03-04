package Homeword;

import java.util.Scanner;

/*
 * In ra hình sau

*

**

***

****

*****

N = 5

Yêu cầu : Nhập N từ bàn phím, và in ra cây như hình trên
 */
public class Bt3_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị cây với N= ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
