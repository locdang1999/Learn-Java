package Project;

public class TruongPhong extends QLNhanSu {
	private int soLuongNV;
	final int luongTP = 200;

	public TruongPhong() {
		super();
		this.chucVu = "Trưởng phòng";
		this.luongMotNgay = luongTP;
	}

	public TruongPhong(int stt, String maSo, String hoTen, String sDT, String chucVu, float soNgayLamViec,
			float luongMotNgay, int soLuongNV) {
		super(stt, maSo, hoTen, sDT, chucVu, soNgayLamViec, luongMotNgay);
		this.soLuongNV = soLuongNV;
	}

	public int getSoLuongNV() {
		return soLuongNV;
	}

	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		/*
		 * System.out.println(", " + this.chucVu + ", " + String.valueOf(this.soLuongNV)
		 * + ", " + tinhLuong());
		 */
		System.out.println(String.format("%16.0f |", this.luongMotNgay) + String.format("%17.0f |", tinhLuong())
				+ String.format("%16s |", getChucVu()) + String.format("%19s", String.valueOf(this.soLuongNV) + "nv"));
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() * this.luongMotNgay + 100 * this.soLuongNV;
	}

	public void tangNhanVien() {
		this.soLuongNV++;
	}

	public void giamNhanVien() {
		this.soLuongNV--;
	}

}
