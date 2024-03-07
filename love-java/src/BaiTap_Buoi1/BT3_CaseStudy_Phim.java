package BaiTap_Buoi1;

import java.util.Scanner;

public class BT3_CaseStudy_Phim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tenPhim;
		int giaVeL,giaVeN,soVeL,soVeN,tyLeTT,tongVeBan,doanhThu,tienTT,tienCL;
		System.out.print("Nhập tên phim: ");
		tenPhim = sc.nextLine();
		System.out.print("Nhập giá vé người lớn: ");
		giaVeL=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập giá vé trẻ em: ");
		giaVeN=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số vé người lớn đã bán: ");
		soVeL=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số vé trẻ em đã bán: ");
		soVeN=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập tỷ lệ % quyên góp từ thiện: ");
		tyLeTT=Integer.parseInt(sc.nextLine());
		//xử lý
		tongVeBan=soVeL+soVeN;
		doanhThu=soVeL*giaVeL+soVeN*giaVeN;
		tienTT=doanhThu*tyLeTT/100;
		tienCL=doanhThu-tienTT;
		//xuất
		System.out.println(String.format("%-20s"," ").replace("","_*"));
		System.out.println("Tên phim:"+ String.format("%28s"," ").replace(" ",".") + tenPhim);
		System.out.println("Số vé đã bán:"+ String.format("%24s"," ").replace(" ",".") + tongVeBan);
		System.out.println("Doanh thu:"+ String.format("%27s"," ").replace(" ",".") + doanhThu);
		System.out.println("Trích % từ thiện:"+ String.format("%20s"," ").replace(" ",".") + tyLeTT + "%");
		System.out.println("Tổng tiền trích từ thiện:"+ String.format("%12s"," ").replace(" ",".") + tienTT);
		System.out.println("Tổng thu sau khi trừ:"+ String.format("%16s"," ").replace(" ",".") + tienCL);
	}

}
