package TD44_Buoi8;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class SinhVien {
	private String tenSV;
	private String maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;

	// id tự tăng
	private static int soTT = 1;

	private static String generateId() {
		return "SV" + OffsetDateTime.now().getYear() + OffsetDateTime.now().getMonthValue()+ soTT++;
	}

	// contructor
	public SinhVien() {
		tenSV = "";
		maSV =generateId();
	}

	public SinhVien(String tenSV, String maSV, float diemToan, float diemLy, float diemHoa) {
		this.tenSV = tenSV;
		this.maSV = generateId();
	}

	// getter setter
	public String getTenSV() {
		return tenSV;
	}

	public String getMaSV() {
		return maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		if (diemToan >= 0 && diemToan <= 10) {
			this.diemToan = diemToan;
			return;
		}
		System.out.println("Điểm không hợp lệ");
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		if (diemToan >= 0 && diemToan <= 10) {
			this.diemLy = diemLy;
			return;
		}
		System.out.println("Điểm không hợp lệ");
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		if (diemHoa >= 0 && diemHoa <= 10) {
			this.diemHoa = diemHoa;
			return;
		}
		System.out.println("Điểm không hợp lệ");
	}

	public float getDiemTB() {
		return diemTB;
	}

	// phương thức
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Mời bạn nhập tên sinh viên: ");
		tenSV = sc.nextLine();
		System.out.print("Mời bạn nhập điểm toán của sinh viên: ");
		diemToan= Float.parseFloat(sc.nextLine());
		System.out.print("Mời bạn nhập điểm lý của sinh viên: ");
		diemLy = Float.parseFloat(sc.nextLine());
		System.out.print("Mời bạn nhập điểm hóa của sinh viên: ");
		diemHoa = Float.parseFloat(sc.nextLine());
	}

	public float tinhDiemTB() {
		// TODO Auto-generated method stub
		return (diemHoa + diemLy + diemToan) / 3;

	}
	
	/*public String xepLoai() {
		// TODO Auto-generated method stub
		float diemTB=tinhDiemTB();
		if(diemTB>=9) 
			return " Xuất sắc";		
		
	}*/

	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println(
				String.format("%10s *", maSV)
				+ String.format("%16s *", tenSV)
				+ String.format("%7.2f *", diemToan)
				+ String.format("%7.2f *", diemLy)
				+ String.format("%7.2f", diemHoa)
				+String.format("%7.2f *")
				+ String.format("%7.2f")
			);
	}

	public void xepLoai() {
		// TODO Auto-generated method stub
		
	}


}
