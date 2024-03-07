package TD44_Buoi7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Demo đối tượng
		//Nhân viên
		NhanVien nhanVien1 = new NhanVien("Lộc đẹp trai");//NhanVien1 sẽ là biến intance của lớp NhanVien
		nhanVien1.tinhTongNgayLam();
		
		if(nhanVien1.tenNhanVien.equalsIgnoreCase("Lộc")) {
			System.out.println("Chào Lộc dễ thương");
		}
		//System.out.println();
		/*//Sinh viên
		SinhVien sinhVien1= new SinhVien();
		sinhVien1.tenSinhVien="Lộc";
		System.out.println("Tên sinh viên " + sinhVien1.tenSinhVien);*/
		//nest class lopws giups vieecj cho lop chinh
	}

}
