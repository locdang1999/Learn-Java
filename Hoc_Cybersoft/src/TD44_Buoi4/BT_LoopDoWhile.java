package TD44_Buoi4;

import java.util.Scanner;

public class BT_LoopDoWhile {
	
	/*
	 * code style
	 * 1> clean code: ngay hàng thẳng lối, cách đặt tên hàm, biến,lớp,...
	 * 2> code flow: lệnh khối nào nằm trong khối đó
	 * 3> abstract level:
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chonMenu, soA,soB;
		boolean tiepTucChay=false;
		System.out.print("Mời bạn nhập số thứ 1: ");
		soA=Integer.parseInt(sc.nextLine());
		System.out.print("Mời bạn nhập số thứ 2: ");
		soB=Integer.parseInt(sc.nextLine());
		chonMenu=inMenu(sc);
		xuLyMenu(chonMenu, soA, soB);
		
	}

	private static boolean xuLyMenu(int chonMenu, int soA, int soB) {
		// TODO Auto-generated method stub
		boolean tiepTucChay=true;
		switch (chonMenu) {
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 0:
			tiepTucChay=false;
			break;

		default:
			System.out.println("Lựa chọn không hợp lệ");
		}
		return tiepTucChay;
	}

	private static int inMenu(Scanner sc) {
		// TODO Auto-generated method stub
		int chonMenu;
		System.out.println("----Menu----");
		System.out.println("1: Tính tổng");
		System.out.println("2: Tính hiệu");
		System.out.println("3: Tính nhân");
		System.out.println("4: Tính chia");
		System.out.println("0: Tính thoát");
		System.out.print("Mời bạn chọn Menu: ");
		chonMenu=Integer.parseInt(sc.nextLine());
		return chonMenu;
	}

}
