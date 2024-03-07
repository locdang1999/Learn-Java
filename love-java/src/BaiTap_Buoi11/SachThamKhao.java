package BaiTap_Buoi11;

public class SachThamKhao extends Sach {
	private float thue;

	public SachThamKhao() {
		super();
		super.loaiSach = "STK";
	}

	public SachThamKhao(String maSach, String ngayNhap, float donGia, int soLuong, String nhaXuatBan, double thanhTien,
			String loaiSach, float thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thanhTien, loaiSach);
		this.thue = thue;
	}

	public float getThue() {
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhập thuế cho sách tham khảo: ");
		this.thue = Float.parseFloat(sc.nextLine());
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println(toString() + ", Loại sách: " + this.loaiSach + ", Thuế: " + this.thue + ", Thành tiền: "
				+ tinhTien() + "]");
	}

	@Override
	public double tinhTien() {
		this.thanhTien = super.tinhTien() + this.thue;
		return this.thanhTien;
	}

}
