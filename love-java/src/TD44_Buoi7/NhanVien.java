package TD44_Buoi7;

public class NhanVien {
	// Thuộc tính của đối tượng
	public String tenNhanVien;
	public String maNhanVien;
	public String soCMND;
	public String SDT;
	public String email;
	public byte gioiTinh;
	float soNgayLam;
	float luongMotNgay;
	
	//Phương thức khởi tạo contructor
	public NhanVien() {
		System.out.println("Phương thức khởi tạo đã được gọi");
		maNhanVien="";
		tenNhanVien="lộc";
		soCMND="";
		SDT="";
		email="";
		soNgayLam=22;
		luongMotNgay=200;
	}
	
	//Contructor có tham số, hàm mà truyền tham số giống nhau trong java không được mà phải thêm đối số tiếp trong hàm tạo đầu tiên
	public NhanVien(String tenNV) {
		this.tenNhanVien=tenNV;//thuộc tính= tham số truyền vào
		
	}
	
	
	// Phương thức của các đối tượng
	public void tinhLuong() {
		System.out.println("Tính lương cho nhân viên");
	}

	public void tinhTongNgayLam() {
		System.out.println("Tính tổng ngày đi làm");
	}

	public void tinhTongNgayNghi() {
		System.out.println("Tính số ngày nghỉ");
	}

}
