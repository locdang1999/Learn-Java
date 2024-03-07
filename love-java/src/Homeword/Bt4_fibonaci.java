package Homeword;

import java.util.Scanner;

/*
 * Cho biểu thức Fibonaci như sau

F(0) = 1

F(1) = 1

F(n) = F(n-1) + F(n-2)

Nhập từ bản phím số max. In ra tất cả các số Fibonaci có giá trị nhỏ hơn max.
 */


public class Bt4_fibonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị max của dãy Fibonci= ");
		int max = sc.nextInt();
		int a=0;
		if(max==1 || max==2) {
			 System.out.println("Dãy Fibonatci= 1");
		}else {
			int a_1=1;
			int a_2=1;
			System.out.println("Dãy Fibonaci nhỏ hơn max là: a(1)= 1");
			System.out.println("Dãy Fibonaci nhỏ hơn max là: a(2)= 1");
			for(int i=3; i<max; i++) {
				a = a_1+a_2;
				a_1 =a_2;
				a_2=a;
				if(a<max) {
					System.out.println("Dãy Fibonaci nhỏ hơn max là: a("+i+")= " +a);
				}
			}
		}
	}
}
