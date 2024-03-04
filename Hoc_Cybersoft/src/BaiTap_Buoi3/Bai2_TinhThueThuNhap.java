package BaiTap_Buoi3;

import java.util.Scanner;

public class Bai2_TinhThueThuNhap {
	
	//Tính thuế thu nhập
	public static float tinhThueThuNhap(float tongThuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue,thuethuNhap=0;
		thuNhapChiuThue=tongThuNhap-4-soNguoiPhuThuoc*1.6f;
		if(thuNhapChiuThue<=60) {
			thuethuNhap=thuNhapChiuThue*5/100;
		}
		if(thuNhapChiuThue>60 && thuNhapChiuThue<=120) {
			thuethuNhap=thuNhapChiuThue*10/100;
		}
		if(thuNhapChiuThue>120 && thuNhapChiuThue<=216) {
			thuethuNhap=thuNhapChiuThue*15/100;
		}
		if(thuNhapChiuThue>216 && thuNhapChiuThue<=384) {
			thuethuNhap=thuNhapChiuThue*20/100;
		}
		if(thuNhapChiuThue>384 && thuNhapChiuThue<=624) {
			thuethuNhap=thuNhapChiuThue*25/100;
		}
		if(thuNhapChiuThue>624 && thuNhapChiuThue<=960) {
			thuethuNhap=thuNhapChiuThue*30/100;
		}
		if(thuNhapChiuThue>960) {
			thuethuNhap=thuNhapChiuThue*35/100;
		}
		return thuethuNhap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String hoTen;
		float tongThuNhap;
		int soNguoiPhuThuoc;
		
		System.out.print("Nhập họ và tên: ");
		hoTen=sc.nextLine();
		System.out.print("Nhập tổng thu nhập năm(triệu): ");
		tongThuNhap=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số người phụ thuộc: ");
		soNguoiPhuThuoc=Integer.parseInt(sc.nextLine());
		
		//xuất
		System.out.println("Thuế thu nhập cá nhân phải trả: " + String.format("%.0f",tinhThueThuNhap(tongThuNhap, soNguoiPhuThuoc) ) + " triệu");


	}

}
