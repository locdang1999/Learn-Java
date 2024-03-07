package BaiTap_Buoi4;

import java.util.Scanner;

public class Bai7_TroChoiOanTuTi {

	/*
	 * Quy ước: 1=bao, 2=búa, 3=kéo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean tiepTuc = false;
		int luaChon, demNguoi = 0, demMay = 0;
		do {
			int mayChon = (int) (Math.random() * 3 + 1);
			luaChon = inQuyUoc(sc);
			tiepTuc = chonQuyUoc(luaChon, mayChon);
			// đếm số lần thắng của máy và người chơi
			if (mayChon == 2 && luaChon == 1 || mayChon == 3 && luaChon == 2 || mayChon == 1 && luaChon == 3) {
				demNguoi++;
			}
			if (mayChon == 3 && luaChon == 1 || mayChon == 1 && luaChon == 2 || mayChon == 2 && luaChon == 3) {
				demMay++;
			}
			sc.nextLine();

		} while (tiepTuc == true);
		// xử lý kết quả xem ai thắng và in ra tỷ số
		xuLyKetQua(demMay, demNguoi);

	}

	private static boolean chonQuyUoc(int luaChon, int mayChon) {
		// TODO Auto-generated method stub
		// int demNguoi=0, demMay=0;
		boolean tiepTuc = true;
		switch (luaChon) {
		case 1:
			System.out.println("Bạn chọn: bao");
			if (mayChon == 1) {
				System.out.println("Máy chọn: bao");
				System.out.println("Bạn với máy hòa");
			}
			if (mayChon == 2) {
				System.out.println("Máy chọn: búa");
				System.out.println("Bạn thắng máy thua");
			}
			if (mayChon == 3) {
				System.out.println("Máy chọn: kéo");
				System.out.println("Máy thắng bạn thua");
			}

			break;
		case 2:
			System.out.println("Bạn chọn: búa");
			if (mayChon == 1) {
				System.out.println("Máy chọn: bao");
				System.out.println("Máy thắng bạn thua");
			}
			if (mayChon == 2) {
				System.out.println("Máy chọn: búa");
				System.out.println("Bạn với máy hòa");
			}
			if (mayChon == 3) {
				System.out.println("Máy chọn: kéo");
				System.out.println("Bạn thắng máy thua");
			}

			break;
		case 3:
			System.out.println("Bạn chọn: kéo");
			if (mayChon == 1) {
				System.out.println("Máy chọn: bao");
				System.out.println("Bạn thắng máy thua");
			}
			if (mayChon == 2) {
				System.out.println("Máy chọn: búa");
				System.out.println("Máy thắng bạn thua");
			}
			if (mayChon == 3) {
				System.out.println("Máy chọn: kéo");
				System.out.println("Bạn với máy hòa");
			}

			break;
		case 0:
			tiepTuc = false;

			break;
		default:
			System.out.println("Lỗi mời bạn nhập lại");
		}
		return tiepTuc;

	}

	private static int inQuyUoc(Scanner sc) {
		int luaChon;
		// TODO Auto-generated method stub
		System.out.println("---Trò chơi oẳn tù tì---");
		System.out.println("Quy ước trò chơi:");
		System.out.println("1. Bao");
		System.out.println("2. Búa");
		System.out.println("3. Kéo");
		System.out.println("0. Thoát game");
		System.out.print("Mời bạn đưa ra lựa chọn: ");
		luaChon = Integer.parseInt(sc.nextLine());
		return luaChon;
	}

	private static void xuLyKetQua(int demMay, int demNguoi) {
		if (demMay > demNguoi) {
			System.out.println("Máy thắng nhiều nhất");
			System.out.println("Tỷ số: " + demMay + "/" + demNguoi);
		}
		if (demMay < demNguoi) {
			System.out.println("Bạn thắng nhiều nhất");
			System.out.println("Tỷ số: " + demNguoi + "/" + demMay);
		}
	}

}
