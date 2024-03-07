package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai4_ThangBaoNhieuNgay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month,year;
		System.out.print("Nhập tháng bạn muốn biết ngày: ");
		month = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập năm của tháng đó: ");
		year = Integer.parseInt(sc.nextLine());
		//xử lý và xuất kết quả
		while(month>0 && month<12) {
			switch (month) {
			case 1:
				System.out.println("Tháng 1 năm " + year +" có: 31 ngày");
				break;
			case 2:
				if(year%4==0 && year!=100 || year%400==0) {
					System.out.println("Tháng 2 năm " + year +" có: 29 ngày");
				}else {
					System.out.println("Tháng 2 năm " + year +" có: 28 ngày");
				}
				break;
			case 3:
				System.out.println("Tháng 3 năm " + year +" có: 31 ngày");
				break;
			case 4:
				System.out.println("Tháng 4 năm " + year +" có: 30 ngày");
				break;
			case 5:
				System.out.println("Tháng 5 năm " + year +" có: 31 ngày");
				break;
			case 6:
				System.out.println("Tháng 6 năm " + year +" có: 30 ngày");
				break;
			case 7:
				System.out.println("Tháng 7 năm " + year +" có: 31 ngày");
				break;
			case 8:
				System.out.println("Tháng 8 năm " + year +" có: 31 ngày");
				break;
			case 9:
				System.out.println("Tháng 9 năm " + year +" có: 30 ngày");
				break;
			case 10:
				System.out.println("Tháng 10 năm " + year +" có: 31 ngày");
				break;
			case 11:
				System.out.println("Tháng 11 năm " + year +" có: 30 ngày");
				break;
			case 12:
				System.out.println("Tháng 12 năm " + year +" có: 31 ngày");
				break;
			}
			System.out.print("Nhập tháng bạn muốn biết ngày: ");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập năm của tháng đó: ");
			year = Integer.parseInt(sc.nextLine());
		}
		
	}

}
