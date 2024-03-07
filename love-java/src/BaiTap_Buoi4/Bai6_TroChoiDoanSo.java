package BaiTap_Buoi4;

import java.util.Scanner;

public class Bai6_TroChoiDoanSo {

	public static boolean xuLyDuDoan(int soNhap, int soNgauNhien, int dem) {
		boolean tiepTuc = true;
		if (soNhap == soNgauNhien) {
			System.out.println("Congratulations (Chúc mừng bạn đã đoán đúng)");
			tiepTuc = false;
			System.out.println("Số lần bạn đoán để tìm ra số bí ẩn: " + (dem + 1));
		}
		if (soNhap > soNgauNhien) {		
			System.out.println("Bạn đã nhập 1 số lớn hơn số ngẫu nhiên");
			System.out.println("Mời bạn đoán lại");
		}
		if (soNhap < soNgauNhien) {
			System.out.println("Bạn đã nhập 1 số nhỏ hơn số ngẫu nhiên");
			System.out.println("Mời bạn đoán lại");
		}
		return tiepTuc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean tiepTuc = false;
		int soNgauNhien = (int) (Math.random() * 999 + 1);
		int soNhap, dem = 0;

		// test ket qua
		// System.out.println(soNgauNhien);

		// xử lý nhập xuát
		do {
			// test kết quả
			// int soNgauNhien = (int) (Math.random() * 999 + 1);
			// System.out.println(soNgauNhien);

			// nhập
			System.out.print("Mời bạn dự đoán số ngẫu nhiên: ");
			soNhap = Integer.parseInt(sc.nextLine());
			// gán biến cờ để xet giá trị cho vong while
			tiepTuc = xuLyDuDoan(soNhap, soNgauNhien, dem);
			// đếm số lần người dùng đoán
			dem++;

		} while (tiepTuc == true);

	}

}

//Máy tự đoán bạn chỉ nhập số đầu
/*
 * public class SuaBaiTap {
	public static void main(String[] args) {
		int soNgauNhien = (int) (Math.random() * 999 + 1);
		int soThapNhat = 1, soCaoNhat = 1000;
		int soDoan, soLanDoan = 0;
		do {
			soLanDoan++;
			soDoan = (soCaoNhat + soThapNhat) / 2;
			System.out.println("======> Số đoán: " + soDoan);
			if(soDoan > soNgauNhien) {
				System.out.println("Số vừa đoán lớn hơn số bí mật.\nVui lòng đoán lại");
				soCaoNhat = soDoan;
			} else if(soDoan < soNgauNhien) {
				System.out.println("Số vừa đoán bé hơn số bí mật.\nVui lòng đoán lại");
				soThapNhat = soDoan;
			}
		} while(soDoan != soNgauNhien);
		System.out.println("Chúc mừng bạn đã đoán đúng.");
		System.out.println("Số bí mật là " + soNgauNhien);
		System.out.println("Số lần đã đoán là " + soLanDoan);
	}
}
 */
