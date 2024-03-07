package Project;

public class GiamDoc extends QLNhanSu implements INhap {
	private float coPhanCT;
	final int luongGD = 300;

	public GiamDoc() {
		super();
		this.chucVu = "Giám Đốc";
		this.luongMotNgay = luongGD;
	}

	public GiamDoc(int stt, String maSo, String hoTen, String sDT, String chucVu, float soNgayLamViec,
			float luongMotNgay, float coPhanCT) {
		super(stt, maSo, hoTen, sDT, chucVu, soNgayLamViec, luongMotNgay);
		this.coPhanCT = coPhanCT;
	}

	public float getCoPhanCT() {
		return coPhanCT;
	}

	public void setCoPhanCT(float coPhanCT) {
		this.coPhanCT = coPhanCT;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		this.coPhanCT = this.validationCoPhan("Nhập số cổ phần %: ");
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		/*
		 * System.out.println(", " + this.chucVu + ", " + this.coPhanCT + ", " +
		 * tinhLuong());
		 */
		System.out.println(String.format("%16.0f |", this.luongMotNgay) + String.format("%17.0f |", tinhLuong())
				+ String.format("%16s |", getChucVu()) + String.format("%19s", this.coPhanCT + "%"));
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() * this.luongMotNgay;
	}

}
