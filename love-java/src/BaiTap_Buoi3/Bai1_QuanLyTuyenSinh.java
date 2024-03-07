package BaiTap_Buoi3;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Bai1_QuanLyTuyenSinh {
	
	public static float tinhTongDiemThi(float diemThi1, float diemThi2, float diemThi3) {
		float ketQua;
		ketQua=diemThi1+diemThi2+diemThi3;
		return ketQua;
	}
	
	public static float xetDoiTuong (int doiTuong) {
		float ketQua=0;
		switch (doiTuong) {
		case 1:
			ketQua=ketQua+2.5f;
			break;
		case 2:
			ketQua=ketQua+1.5f;
			break;
		case 3:
			ketQua=ketQua+1;
			break;	
		case 0:
			System.out.println("Bạn không thuộc đối tượng ưu tiên");
			ketQua=ketQua;
			break;
		}	
		return ketQua;
	}
	public static float xetKhuVuc (String khuVuc) {
		float ketQua=0;
		if(khuVuc.equalsIgnoreCase("A")) {
			ketQua=ketQua+2;
		}
		if(khuVuc.equalsIgnoreCase("B")) {
			ketQua=ketQua+1;
		}
		if(khuVuc.equalsIgnoreCase("C")) {
			ketQua=ketQua+0.5f;
		}
		if(khuVuc.equalsIgnoreCase("X")) {
			System.out.println("Bạn không thuộc khu vực ưu tiên");
			ketQua=ketQua;
		}
		return ketQua;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int doiTuong;
		float diemChuan,diemThi1,diemThi2,diemThi3;
		String khuVuc;
		float tongDiem;
		
		System.out.print("Nhập điểm chuẩn của hội đồng: ");
		diemChuan=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm thi môn thứ 1: ");
		diemThi1=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm thi môn thứ 2: ");
		diemThi2=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập điểm thi môn thứ 3: ");
		diemThi3=Float.parseFloat(sc.nextLine());
		System.out.print("Nhập khu vực(Nhập X nếu không thuộc khu vực ưu tiên): ");
		khuVuc=sc.nextLine();
		System.out.print("Nhập đối tương dự thi(Nhập 0 nếu không thuộc đối tượng ưu tiên): ");
		doiTuong=Integer.parseInt(sc.nextLine());
		
		//xử lý và xuất
		tongDiem=tinhTongDiemThi(diemThi1, diemThi2, diemThi3)+xetKhuVuc(khuVuc)+xetDoiTuong(doiTuong);
		if(tongDiem==diemChuan && diemThi1!=0 && diemThi2!=0 && diemThi3!=0 || tongDiem>diemChuan && diemThi1!=0 && diemThi2!=0 && diemThi3!=0) {
			System.out.println("Thí sinh đã đậu với tổng điểm là: " + tongDiem);
			return;
		}
		System.out.println("Thí sinh đã rớt với tổng điểm là: " + tongDiem);
		
	}

}
