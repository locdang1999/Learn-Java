package Project;

public class NhanVien extends QLNhanSu {
	private String truongPhongQL;
	final int luongNV = 100;

	public NhanVien() {
		super();
		this.chucVu = "NhanVien";
		this.luongMotNgay = luongNV;
		this.truongPhongQL = null;
	}

	public NhanVien(int stt, String maSo, String hoTen, String sDT, String chucVu, float soNgayLamViec,
			float luongMotNgay, String truongPhongQL) {
		super(stt, maSo, hoTen, sDT, chucVu, soNgayLamViec, luongMotNgay);
		this.truongPhongQL = truongPhongQL;
	}

	public String getTruongPhongQL() {
		return truongPhongQL;
	}

	public void setTruongPhongQL(String truongPhongQL) {
		this.truongPhongQL = truongPhongQL;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		/*
		 * System.out.println(", " + this.chucVu + ", " + this.truongPhongQL + ", " +
		 * tinhLuong());
		 */
		System.out.println(String.format("%16.0f |", this.luongMotNgay) + String.format("%17.0f |", tinhLuong())
				+ String.format("%16s |", getChucVu()) + String.format("%19s", this.truongPhongQL));
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() * this.luongMotNgay;
	}

}
