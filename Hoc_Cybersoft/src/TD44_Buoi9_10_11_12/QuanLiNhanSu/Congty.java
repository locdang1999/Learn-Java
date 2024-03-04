package TD44_Buoi9_10_11_12.QuanLiNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class Congty {
	private String tenCongTy;
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<QuanLiNhanSu> dsNhanSu;

	public Congty() {
		tenCongTy = "";
		maSoThue = "";
		dsNhanSu = new ArrayList<QuanLiNhanSu>();
	}

	public Congty(String tenCongTy, String maSoThue, double doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		dsNhanSu = new ArrayList<QuanLiNhanSu>();
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public double getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(double doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	// Phương thức của đối tượng-methods
	public void nhapThongTin(Scanner sc) {
		System.out.println("---Mời bạn nhập thông tin của công ty---");
		System.out.print("Tên công ty: ");
		tenCongTy = sc.nextLine();
		System.out.print("Mã số thuế của công ty: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh số tháng của công ty: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());

	}

	public boolean themNhanSu(QuanLiNhanSu ns) {
		return true;
	}

	public boolean xoaNhanSu(QuanLiNhanSu ns) {
		return true;
	}

	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println("---Thông tin công ty---");
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.format("Doanh thu tháng: %d", doanhThuThang);
	}

}
