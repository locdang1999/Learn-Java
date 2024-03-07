package Project;

import java.util.Scanner;

public class QLNhanSu {
	protected int stt;
	protected String maSo;
	protected String hoTen;
	protected String SDT;
	protected String chucVu;
	protected float soNgayLamViec;
	protected double luongMotNgay;
	protected Scanner sc = new Scanner(System.in);

	public QLNhanSu() {
		this.maSo = "";
	}

	public QLNhanSu(int stt, String maSo, String hoTen, String sDT, String chucVu, float soNgayLamViec,
			float luongMotNgay) {
		stt = stt;
		this.maSo = maSo;
		this.hoTen = hoTen;
		SDT = sDT;
		this.chucVu = chucVu;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

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

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public Float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public double getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(double luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}

	public void nhapThongTin() {
		/*
		 * System.out.print("Nhập mã nhân viên: "); this.maSo = sc.nextLine();
		 */
		System.out.print("Nhập họ tên nhân viên: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhập số điện thoại nhân viên: ");
		this.SDT = sc.nextLine();
		System.out.print("Nhập số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(sc.nextLine());
	}

	public void xuatThongTin() {
		// System.out.println(String.format("%2s", this.maSo));
		/*
		 * System.out.print(this.stt + ", " + this.maSo + ", " + this.hoTen + ", " +
		 * this.SDT + ", " + this.soNgayLamViec);
		 */
		System.out.print(String.format("%1s |", this.stt) + String.format("%10s |", this.maSo)
				+ String.format("%16s |", this.hoTen) + String.format("%16s |", this.SDT)
				+ String.format("%12.1f |", this.soNgayLamViec));
	}

	public double tinhLuong() {
		return this.soNgayLamViec;
	}

	// Tách Tên
	public String tachTen() {
		String ten = null;
		int viTriKhoangTrangCuoi = this.hoTen.trim().lastIndexOf(" ");
		ten = this.hoTen.substring(viTriKhoangTrangCuoi + 1, this.hoTen.length());
		return ten;
	}

}
