package BaiTap.Buoi7;
import java.util.Scanner;

public class HinhChuNhat {

		private float chieuDai;
		private float chieuRong;
		private float  chuVi;
		private float  dienTich;

		// contructor
		public void HinhChucNhat() {	
		}

		public void HinhChucNhat(float chieuDai, float chieuRong) {
			this.chieuDai = chieuDai;
			this.chieuRong = chieuRong;
		}

		// getter setter
		public float getChieuDai() {
			return chieuDai;
		}

		public void setChieuDai(float chieuDai) {
			this.chieuDai = chieuDai;
		}

		public float getChieuRong() {
			return chieuRong;
		}

		public void setChieuRong(float chieuRong) {
			this.chieuRong = chieuRong;
		}

		// methods
		public void nhapThongTin(Scanner sc) {
			// TODO Auto-generated method stub
			System.out.println("Nhập chiều dài");
			chieuDai = Integer.parseInt(sc.nextLine());
			System.out.println("Nhập chiều rộng");
			chieuRong = Integer.parseInt(sc.nextLine());

		}

		public void xuatThongTin() {
			// TODO Auto-generated method stub
			System.out.println("Chiều dài hình chữ nhật: " + chieuDai);
			System.out.println("Chiều dài hình chữ nhật: " + chieuRong);
			for (int i = 0; i < chieuDai; i++) {
				for (int j = 0; j < chieuRong; j++) {
					System.out.println("*");
					System.out.println();
				}
			}
		}
}
