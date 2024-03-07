package VD;

import java.util.Scanner;

/*Nhập số nguyên x, in ra x là số chẵn hay số lẻ*/
public class bt2_Ktra_sochanle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Nhập số nguyên x");
		x = sc.nextInt();
		if(x%2==0) {
			System.out.println(x + " là số chẵn");
		}
		else {
			System.out.println(x + " là số lẻ");
		}
	}

}
