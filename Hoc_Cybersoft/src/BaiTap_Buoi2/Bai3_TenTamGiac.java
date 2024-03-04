package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai3_TenTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int canh1,canh2,canh3;
		System.out.print("Nhập cạnh thứ  1 của tam giác: ");
		canh1=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập cạnh thứ  2 của tam giác: ");
		canh2=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập cạnh thứ  3 của tam giác: ");
		canh3=Integer.parseInt(sc.nextLine());
		//xử lý và xuất
		if(canh1==canh2 && canh1!=canh3 || canh2==canh3 && canh2!=canh1 || canh3==canh1 && canh3!=canh2) {
			System.out.println("Tam giác này là: tam giác cân");
		}else if (canh1==canh2 && canh1==canh3 && canh2==canh3) {
			System.out.println("Tam giác này là: tam giác đều");
		}else if (canh1==Math.sqrt(canh2*canh2+canh3*canh3) || canh2==Math.sqrt(canh1*canh1+canh3*canh3) || canh3==Math.sqrt(canh2*canh2+canh1*canh1)) {
			System.out.println("Tam giác này là: tam giác vuông");
		}

	}

}
