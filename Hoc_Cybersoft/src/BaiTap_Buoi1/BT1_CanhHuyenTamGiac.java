package BaiTap_Buoi1;

import java.util.Scanner;

public class BT1_CanhHuyenTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double canhBen1,canhBen2,canhH;
		System.out.print("Nhập canh bên thứ nhất: ");
		canhBen1=Double.parseDouble(sc.nextLine());
		System.out.print("Nhập canh bên thứ hai: ");
		canhBen2=Double.parseDouble(sc.nextLine());
		//xử lý
		canhH=Math.sqrt(Math.pow(canhBen1, 2)+Math.pow(canhBen2, 2));
		//xuất
		System.out.println("Giá trị cạnh huyền cảu tam giác vuông: " + canhH);
	}

}
