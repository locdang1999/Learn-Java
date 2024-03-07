package TD44_Buoi8;

import java.util.Scanner;

public class SinhVienChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien sv= new SinhVien();
		sv.nhapThongTin(sc);
		sv.xuatThongTin();
		sv.tinhDiemTB();
		sv.xepLoai();

	}

}
