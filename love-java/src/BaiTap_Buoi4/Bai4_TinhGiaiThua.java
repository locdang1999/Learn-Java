package BaiTap_Buoi4;

import java.util.Scanner;

public class Bai4_TinhGiaiThua {

	// xử lý tính giai thừa của số n
	public static void tinhGiaiThua(int soN) {
		int giaiThua = 1;
		if (soN == 0) {
			System.out.println("Giai thừa số 0!= 1");
			return;
		}
		System.out.print("Giai thừa số " + soN + "!= " + soN);
		do {
			giaiThua = giaiThua * soN;
			// System.out.print("*"+soN);
			soN--;
			if (soN == 0) {
				break;
			}
			System.out.print("*" + soN);
		} while (soN > 0);
		System.out.println("= " + giaiThua);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soN;
		System.out.print("Nhập số n: ");
		soN = Integer.parseInt(sc.nextLine());
		// xuất
		tinhGiaiThua(soN);

	}

}
