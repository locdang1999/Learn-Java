package TD44_Main;

import java.util.Scanner;

import TD44_Buoi9_10_11_12.QuanLiNhanSu.Congty;
import TD44_Buoi9_10_11_12.QuanLiNhanSu.NhanVien;
import TD44_Buoi9_10_11_12.QuanLiNhanSu.QuanLiNhanSu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * Congty ct=new Congty(); ct.nhapThongTin(sc); ct.xuatThongTin();
		 */
		boolean flag = true;
		int n;
		do {
			inMenu();
			System.out.println("Mời bạn chọn chức năng: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			case 0:

				break;

			default:
				break;
			}

		} while (true);

	}

	static void inMenu() {
		System.out.println("1.Nhập thông tin công ty");
		System.out.println("2.Phân bổ nhân viên vào trưởng phòng");
		System.out.println("3.Thêm/xóa nhân viên một nhân sự");
		System.out.println("4.Xuất thông tin toàn bộ nhân viên trong công ty");
		System.out.println("5.Tính tổng lương cho toàn công ty");
		System.out.println("6.Tìm nhân viên thường có lương cao nhất");
		System.out.println("7.Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("8.Sắp xếp nhân viên theo thứ tự abc");
		System.out.println("9.Sắp xếp nhân viên theo thứ  tự lương giảm dần");
		System.out.println("10.Tìm giám đốc có nhiều cổ phiểu nhất");
		System.out.println("11.Tính/Xuất thu nhập của từng giám đốc");
		System.out.println("0.Thoát chương trình");
	}

}
