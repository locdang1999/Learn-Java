package VD;

import java.util.Scanner;

/*Giải phương trinhg bậc 2 
 *ax^2+bx+c=0 
 */

public class bt3_ptb2 {
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
		float x=0;
		float x1,x2;
		System.out.println(a + "x^2+" + b + "x+" + c + "=0");
		if(a==0) {
			System.out.println("Là phương trình bậc nhất");
			x=-c/b;
			System.out.println("Nghiệm phương trinh là x= " + x);
		}
		else {
			float delta=0;
			delta = (int) Math.pow(b, 2) - 4*a*c; //pow hàm dùng cho số mũ
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			}else if (delta==0) {
				x1=-b/(2*a);
				System.out.println("Phương trình có nghiệm kép x1=x2= " + x1);
			}else if (delta>0) {
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				delta = (float) Math.sqrt(delta);//Hàm sử dụng căn: (kiểu dữ liệu)thư viện.tên hàm(tên biến)
				x1=(-b+delta)/(2*a);
				System.out.println("x1= " + x1);
				x2=(-b-delta)/(2*a);
				System.out.println("x2= " + x2);
			}
		}
	}
}