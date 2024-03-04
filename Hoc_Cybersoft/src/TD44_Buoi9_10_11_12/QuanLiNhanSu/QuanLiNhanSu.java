package TD44_Buoi9_10_11_12.QuanLiNhanSu;

import java.util.Scanner;

public class QuanLiNhanSu {
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luongMotNgay;

	// Hàm tạo không đối
	public QuanLiNhanSu() {
		// Khởi tạo trước để không bị lỗi null
		maSo = "";
		hoTen = "";
		soDienThoai = "";
	}

	// Hàm tạo có đối số
	public QuanLiNhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec, float luongMotNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
	}

	// Tạo bộ setter và getter cho thuộc tính của đối tượng
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(float luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập thông tin của bạn: ");

	}

	public void xuatThongTin() {
		System.out.println("Xuất thông tin của bạn");

	}

	public double tinhLuong() {
		return soNgayLamViec * luongMotNgay;
	}

}
