package TD44_Buoi3;

import java.util.Scanner;

public class BT_TimSoLonNhat {
	
	public static int timSoLonNhat(int a, int b, int c) {
		int ketQua=0;
		if(a>b && a>c || a==b && a>c) {
			ketQua=a;
		}
		if(b>a && b>c || b==a && b>c) {
			ketQua=b;
		}
		if(c>b && c>a || c==a && c>b) {
			ketQua=c;
		}
		return ketQua;
	}
	public static boolean timChan(int d) {
		if(d%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhập số thứ nhất: ");
		a=Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ 2: ");
		b=Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ 3: ");
		c=Integer.parseInt(sc.nextLine());
		int max = timSoLonNhat(a, b, c);
		System.out.println("Số lớn nhất trong 3 số là: " + max);
		if(timChan(Integer.parseInt(sc.nextLine()))) {
			System.out.println("Là số chẵn");
		}
	}

}
