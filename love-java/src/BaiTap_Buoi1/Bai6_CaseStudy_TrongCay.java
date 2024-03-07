package BaiTap_Buoi1;

import java.util.Scanner;

public class Bai6_CaseStudy_TrongCay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chieuDS, rCay, kgCay,slCay;
		System.out.print("Nhập chiều dài của sân: ");
		chieuDS = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập bán kính của cây phát triển đầy đủ: ");
		rCay = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập không gian cần thiết giữa các cây phát triển đầy đủ: ");
		kgCay = Integer.parseInt(sc.nextLine());
		//xử lý
		slCay=chieuDS/(rCay*2+kgCay);
		double pi=3.14, tongKG=0;
		tongKG=Math.pow(rCay, 2)*pi*slCay;
		//xuất
		System.out.println("Số lượng cây có thể được trồng trong sân: " + slCay);
		System.out.println("Tổng không gian sẽ được chiếm bởi những cây được trông hoàn toàn: " + tongKG);
	}

}
