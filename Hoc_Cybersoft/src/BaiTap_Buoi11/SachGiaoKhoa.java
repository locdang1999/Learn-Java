package BaiTap_Buoi11;

public class SachGiaoKhoa extends Sach {

	private String tinhTrang;
	// private String loaiSach;
	final float giaSachCu = 0.5f;

	public SachGiaoKhoa() {
		super();
		super.loaiSach = "SGK";
	}

	public SachGiaoKhoa(String maSach, String ngayNhap, float donGia, int soLuong, String nhaXuatBan, double thanhTien,
			String loaiSach, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thanhTien, loaiSach);
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhập tình trạng sách: ");
		this.tinhTrang = sc.nextLine();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println(toString() + ", Loại sách: " + this.loaiSach + ", Tình trạng: " + this.tinhTrang
				+ ", Thanh tiền: " + tinhTien() + "]");
	}

	@Override
	public double tinhTien() {
		if (this.tinhTrang.equalsIgnoreCase("mới") && !"".equals(this.tinhTrang)) {
			this.thanhTien = super.tinhTien();
		}
		if (this.tinhTrang.equalsIgnoreCase("cũ") && !"".equals(this.tinhTrang)) {
			this.thanhTien = super.tinhTien() * giaSachCu;
		}
		return this.thanhTien;
	}

}
