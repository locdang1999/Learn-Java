package BaiTap_Buoi11;

import java.sql.Date;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Sach {
	protected String maSach;
	protected String ngayNhap;
	protected float donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	protected double thanhTien;
	protected String loaiSach;
	Scanner sc = new Scanner(System.in);

	public Sach() {

	}

	public Sach(String maSach, String ngayNhap, float donGia, int soLuong, String nhaXuatBan, double thanhTien,
			String loaiSach) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
		this.thanhTien = thanhTien;
		this.loaiSach = loaiSach;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + "";
	}

	public void nhapThongTin() {
		System.out.print("Nhập mã sách: ");
		this.maSach = sc.nextLine();
		System.out.print("Nhập đơn giá của cuốn sách: ");
		this.donGia = Float.parseFloat(sc.nextLine());
		System.out.print("Nhập số lượng của sách: ");
		this.soLuong = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập tên nhà xuất bản của cuốn sách: ");
		this.nhaXuatBan = sc.nextLine();
	}

	public void xuatThongTin() {
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println(String.format("%39s", "") + "DANH SÁCH CÁC LOẠI SÁCH" + String.format("%39s", ""));
		System.out.println("+---------------------------------------------------------------------------------+");
	}

	public double tinhTien() {
		this.thanhTien = this.soLuong * this.donGia;
		return thanhTien;
	}

}
