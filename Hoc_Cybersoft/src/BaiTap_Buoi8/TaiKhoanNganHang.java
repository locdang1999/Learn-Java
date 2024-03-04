package BaiTap_Buoi8;

import java.util.Scanner;

public class TaiKhoanNganHang {
	private String soTK;
	private String tenTK;
	private double soTienTrongTK;

	public TaiKhoanNganHang() {

	}

	public TaiKhoanNganHang(String soTK, String tenTK, double soTienTrongTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTrongTK = soTienTrongTK;
	}

	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoTienTrongTK() {
		return soTienTrongTK;
	}

	public void setSoTienTrongTK(double soTienTrongTK) {
		this.soTienTrongTK = soTienTrongTK;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập số tài khoản: ");
		soTK=sc.nextLine();
		System.out.print("Nhập tên tài khoản: ");
		tenTK=sc.nextLine();
		System.out.print("Số tiền trong tài khoản");
		soTienTrongTK=Double.parseDouble(sc.nextLine());
	}

}
