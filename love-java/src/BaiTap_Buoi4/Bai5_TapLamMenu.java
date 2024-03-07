package BaiTap_Buoi4;

import java.util.Scanner;

public class Bai5_TapLamMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soA, soB;
		boolean tiepTuc = false;//biến cờ để thoát vòng lập
		do {
			inMenu();
			System.out.print("Nhập số thứ nhất: ");
			soA = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập số thứ nhất: ");
			soB = Integer.parseInt(sc.nextLine());
			tiepTuc = xuLyMenu(soA, soB, sc);
			sc.nextLine();
		} while (tiepTuc);

	}

	//Hàm xử lý Menu
	private static boolean xuLyMenu(int soA, int soB, Scanner sc) {
		// TODO Auto-generated method stub
		boolean tiepTucChay = true;//biến cờ để thoát switch
		int ketQua = 0, chucNang;
		System.out.print("Chọn chức năng: ");
		chucNang = Integer.parseInt(sc.nextLine());
		//xử lý và xuất kết quả
		switch (chucNang) {
		case 1:
			ketQua = soA + soB;
			System.out.println("Tổng 2 số là: " + ketQua);
			break;
		case 2:
			ketQua = soA - soB;
			System.out.println("Tổng 2 số là: " + ketQua);
			break;
		case 3:
			ketQua = soA / soB;
			System.out.println("Tổng 2 số là: " + ketQua);
			break;
		case 4:
			ketQua = soA * soB;
			System.out.println("Tổng 2 số là: " + ketQua);
			break;
		case 0:
			tiepTucChay = false;
			break;

		default:
			System.out.println("Lựa chọn không hợp lệ");
		}
		return tiepTucChay;

	}

	//Hàm cho biết thông tin menu
	private static void inMenu() {
		// TODO Auto-generated method stub
		System.out.println("---Menu---");
		System.out.println("1.Tính tổng 2 số");
		System.out.println("2.Tính hiệu 2 số");
		System.out.println("3.Tính thương 2 số");
		System.out.println("4.Tính tích 2 số");
		System.out.println("0.Kết thúc chương trình");

	}

}
