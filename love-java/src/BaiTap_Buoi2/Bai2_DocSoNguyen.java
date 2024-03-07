package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai2_DocSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int so,kq1,kq2,kq3;
		System.out.print("Nhập số có 3 chữ số bạn muốn chuyển đổi: ");
		so=sc.nextInt();
		//xử lý
		kq1=so/100;
		kq2=so%100/10;
		kq3=so%10;
		//xuất
		//trăm
		System.out.print("Chuyển đổi thành chữ: ");
		if(kq1==1) {
			System.out.print("Một trăm");
		}else if(kq1==2) {
			System.out.print("Hai trăm");
		}else if(kq1==3) {
			System.out.print("Ba trăm");
		}else if(kq1==4) {
			System.out.print("Bốn trăm");
		}else if(kq1==5) {
			System.out.print("Năm trăm");
		}else if(kq1==6) {
			System.out.print("Sáu trăm");
		}else if(kq1==7) {
			System.out.print("Bảy trăm");
		}else if(kq1==8) {
			System.out.print("Tám trăm");
		}else if(kq1==9) {
			System.out.print("Chín trăm");
		}
		//chục
		if(kq2==0) {
			if(kq3==0) {
				System.out.print(" chẵn");
			}else {
				System.out.print(" lẻ ");
			}
		}else if(kq2==1) {
			System.out.print(" mười ");
		}else if(kq2==2) {
			System.out.print(" hai mươi ");
		}else if(kq2==3) {
			System.out.print(" ba mươi ");
		}else if(kq2==4) {
			System.out.print(" bốn mươi ");
		}else if(kq2==5) {
			System.out.print(" năm mươi ");
		}else if(kq2==6) {
			System.out.print(" sáu mươi ");
		}else if(kq2==7) {
			System.out.print(" bảy mươi");
		}else if(kq2==8) {
			System.out.print(" tám mươi ");
		}else if(kq2==9) {
			System.out.print(" chín mươi ");
		}
		//đơn vị
		if(kq3==0) {
			System.out.print("");
		}else if(kq3==1) {
			System.out.print("một");
		}else if(kq3==2) {
			System.out.print("hai");
		}else if(kq3==3) {
			System.out.print("ba");
		}else if(kq3==4) {
			System.out.print("bốn");
		}else if(kq3==5) {
			System.out.print("năm");
		}else if(kq3==6) {
			System.out.print("sáu");
		}else if(kq3==7) {
			System.out.print("bảy");
		}else if(kq3==8) {
			System.out.print("tám");
		}else if(kq3==9) {
			System.out.print("chín");
		}*/
		int so,tram,chuc,donVi;
		System.out.print("Nhập số có 3 chữ số bạn muốn chuyển đổi: ");
		so=Integer.parseInt(sc.nextLine());
		//xử lý
		tram=so/100;
		chuc=so%100/10;
		donVi=so%10;
		//xuất
		//hàng trăm
		switch (tram) {
		case 1:
			System.out.print("Một trăm");
			break;
		case 2:
			System.out.print("Hai trăm");
			break;
		case 3:	
			System.out.print("Ba trăm");
			break;
		case 4:	
			System.out.print("Bốn trăm");
			break;
		case 5:	
			System.out.print("Năm trăm");
			break;
		case 6:	
			System.out.print("Sáu trăm");
			break;
		case 7:	
			System.out.print("Bảy trăm");
			break;
		case 8:	
			System.out.print("Tám trăm");
			break;
		case 9:	
			System.out.print("Chín trăm");
			break;
		}
		
		//hàng chục
		switch (chuc) {
		case 0:
			if(donVi==0) {
				System.out.print(" chẵn");
			}else {
				System.out.print(" lẻ ");
			}
			break;
		case 1:
			System.out.print(" mười ");
			break;
		case 2:
			System.out.print(" hai mươi ");
			break;
		case 3:	
			System.out.print(" ba mươi ");
			break;
		case 4:	
			System.out.print(" bốn mươi");
			break;
		case 5:	
			System.out.print(" năm mươi ");
			break;
		case 6:	
			System.out.print(" sáu mươi ");
			break;
		case 7:	
			System.out.print(" bảy mươi ");
			break;
		case 8:	
			System.out.print(" tám mươi ");
			break;
		case 9:	
			System.out.print(" chín mươi ");
			break;
		}
		//hàng đơn vị
		switch (donVi) {
		case 1:
			if(chuc==0) {
				System.out.print("một");
			}else {
				System.out.print("mốt");
			}
			break;
		case 2:
			System.out.print("hai");
			break;
		case 3:	
			System.out.print("ba");
			break;
		case 4:	
			System.out.print("bốn");
			break;
		case 5:	
			System.out.print("năm");
			break;
		case 6:	
			System.out.print("sáu");
			break;
		case 7:	
			System.out.print("bảy");
			break;
		case 8:	
			System.out.print("tám");
			break;
		case 9:	
			System.out.print("chín");
			break;
		}
		
	}

}
