package hello;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhập a=");
		a = sc.nextInt();
		int b;
		System.out.println("Nhập b=");
		b = sc.nextInt();
		int c;
		System.out.println("Nhập c=");
		c = sc.nextInt();
		double x=0;
		System.out.println(a + "x^2+" + b + "x+" + c + "=0");
		if(a==0) {
			System.out.println("Là phương trình bậc nhất");
			x=-c/b;
			System.out.println("Nghiệm phương trinh là x= " + x);
		}
	}
}
