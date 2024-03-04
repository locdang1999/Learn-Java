package TD44_Buoi4;

import java.util.Scanner;

public class Demo_LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int luaChon=2;
		while(luaChon>=0) {
			System.out.println("Thực hiện chức năng thứ 2");
			luaChon--;
		}*/
		Scanner sc = new Scanner(System.in);
		float diemThi;
		int soLanThiRot=0;
		System.out.print("Nhập điểm thi: ");
		diemThi = Float.parseFloat(sc.nextLine());
		while(diemThi < 5) {
			soLanThiRot++;
			System.out.print("Nhập điểm thi: ");
			diemThi = Float.parseFloat(sc.nextLine());
		}
		System.out.println("Số lần thi rớt: " + soLanThiRot );

	}

}
