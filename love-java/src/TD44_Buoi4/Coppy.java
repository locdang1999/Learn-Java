package TD44_Buoi4;

import java.util.Scanner;

public class Coppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * Luyện tập do while
			 */
	/*		Scanner scanner = new Scanner(System.in);
			boolean tiepTucChay = false;
			int luaChon, soA, soB;
			System.out.print("Nhập số nguyên thứ nhất: ");
			soA = Integer.parseInt(scanner.nextLine());
			System.out.print("Nhập số nguyên thứ hai: ");
			soB = Integer.parseInt(scanner.nextLine());
			do {
				luaChon = inMenu(scanner);
				tiepTucChay = xuLyMenu(luaChon, soA, soB);
				//dùng khống để ngưng màn hình 
				scanner.nextLine();
			} while (tiepTucChay);
			System.out.println("Kết thúc chương trình.");*/
		int so=0;
		do {
			int so1=(int) (Math.random()*3+1);
			//int so=(int) (Math.random()*3);
			System.out.println(so1);
			so++;
		} while (so<10);
		
		}
		/*private static boolean xuLyMenu(int luaChon, int soA, int soB) {
			boolean tiepTucChay = true;
			switch(luaChon) {
				case 1:
					break;
				case 2:
					break;
				case 3: 
					break;
				case 4:
					break;
				case 0:
					tiepTucChay = false;
					break;
				default:
			}
			return tiepTucChay;
		}
		private static int inMenu(Scanner scanner) {
			System.out.println("Menu: ");
			System.out.println("\t1. Tính tổng.");
			System.out.println("\t2. Tính hiệu.");
			System.out.println("\t3. Tính nhân.");
			System.out.println("\t4. Tính chia.");
			System.out.println("\t0. Thoát.");
			System.out.print("Lựa chọn: ");
			int luaChon = Integer.parseInt(scanner.nextLine());
			return luaChon;
		}*/


}
