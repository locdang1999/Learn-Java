package BaiTap_Buoi11;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QLSach {
	private ArrayList<Sach> dsSach;
	Scanner sc = new Scanner(System.in);

	public QLSach() {
		dsSach = new ArrayList<Sach>();
	}

	public QLSach(ArrayList<Sach> dsSach) {
		this.dsSach = dsSach;
	}

	public ArrayList<Sach> getDsSach() {
		return dsSach;
	}

	public void setDsSach(ArrayList<Sach> dsSach) {
		this.dsSach = dsSach;
	}

	public void chonMenu() {
		int chon = 0;
		boolean flag = false;
		String chonChucNang = "";
		do {
			inMenu();
			System.out.print("Mời bạn chọn chức năng: ");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				System.out.print("Mời bạn chọn chức năng nhập/xuất(n/x): ");
				chonChucNang = sc.nextLine();
				if (chonChucNang.equalsIgnoreCase("N") && !"".equals(chonChucNang)) {
					nhapSach();
				}
				if (chonChucNang.equalsIgnoreCase("X") && !"".equals(chonChucNang)) {
					xuatSach();
				}
				if ("".equals(chonChucNang)) {
					System.out.println("Bạn bỏ trống hoặc chọn sai ^_^");
				}
				break;
			case 2:
				System.out.println("Tổng tiền của loại SGK: " + tinhTongTienSGK());
				System.out.println("Tổng tiền của loại STK: " + tinhTongTienSTK());
				break;
			case 3:
				System.out.println("Trung bình cộng đơn giá của sách tham khảo: " + tinhTBCDonGiaSTK());
				break;
			case 4:
				xuatSGKOfNXB();
				break;
			case 0:
				flag = true;
				System.out.println("Chương trình kết thúc ^_^");
				break;
			default:
				System.out.println("Mời bạn chọn đúng chức năng ^_^");
			}

		} while (!flag);
	}

	private void inMenu() {
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("|                        MENU                                  |");
		System.out.println("|    Chọn 1: Nhập/xuất danh sách các loại sách                 |");
		System.out.println("|    Chọn 2: Tính tổng thành tiền cho từng loại                |");
		System.out.println("|    Chọn 3: Tính trung bình cộng giá sách tham khảo           |");
		System.out.println("|    Chọn 4: Xuất ra sách giáo khoa của nhà xuất bản X         |");
		System.out.println("| (*)Chọn 0: Thoát chương trình                                |");
		System.out.println("+--------------------------------------------------------------+");

	}

	private void nhapSach() {
		String chonLoaiSach = "";
		System.out.print("Mời bạn chọn loại sách bạn muốn nhập sách giáo khoa/sách tham khảo(SGK,STK): ");
		chonLoaiSach = sc.nextLine();
		if ("".equals(chonLoaiSach)) {
			System.out.println("Bạn bỏ trống hoặc nhập sai rồi ^_^");
		}
		if (chonLoaiSach.equalsIgnoreCase("SGK") && !"".equals(chonLoaiSach)) {
			Sach sgk = new SachGiaoKhoa();
			sgk.setNgayNhap(layNgayNhapSach());
			sgk.nhapThongTin();
			this.dsSach.add(sgk);
			System.out.println("Bạn đã thêm thành công ^_^");
		}
		if (chonLoaiSach.equalsIgnoreCase("STK") && !"".equals(chonLoaiSach)) {
			Sach stk = new SachThamKhao();
			stk.nhapThongTin();
			this.dsSach.add(stk);
			System.out.println("Bạn đã thêm thành công ^_^");
		}
	}

	private void xuatSach() {
		if (this.dsSach.isEmpty()) {
			System.out.println("Mời bạn nhập ít nhất 1 loại sách");
		}
		System.out.println("Danh sách các loại sách");
		for (Sach s : this.dsSach) {
			if (s instanceof SachGiaoKhoa) {
				s.xuatThongTin();
			}
		}
		for (Sach s : this.dsSach) {
			if (s instanceof SachThamKhao) {
				s.xuatThongTin();
			}
		}
	}

	private double tinhTongTienSGK() {
		double tongTien = 0;
		for (Sach s : this.dsSach) {
			if (s instanceof SachGiaoKhoa) {
				tongTien = tongTien + s.tinhTien();
			}
		}
		return tongTien;
	}

	private double tinhTongTienSTK() {
		double tongTien = 0;
		for (Sach s : this.dsSach) {
			if (s instanceof SachThamKhao) {
				tongTien = tongTien + s.tinhTien();
			}
		}
		return tongTien;
	}

	private double tinhTBCDonGiaSTK() {
		double trungBinhCong = 0;
		int i = 0;
		for (Sach s : this.dsSach) {
			if (s instanceof SachThamKhao) {
				trungBinhCong = trungBinhCong + s.donGia;
				i++;
			}
		}
		trungBinhCong = trungBinhCong / i;
		return trungBinhCong;
	}

	private void xuatSGKOfNXB() {
		String nhaXuatBan = "";
		System.out.print("Mời bạn nhập nhà xuất bản: ");
		nhaXuatBan = sc.nextLine();
		if ("".equals(nhaXuatBan)) {
			System.out.println("Bạn cần nhập nhà xuất bản!");
		}
		if (nhaXuatBan.isEmpty()) {
			System.out.println("Không có nhà xuất bản bạn cần!");
		}
		for (Sach s : this.dsSach) {
			if (s instanceof SachGiaoKhoa && s.nhaXuatBan.equalsIgnoreCase(nhaXuatBan)) {
				s.xuatThongTin();
			}
		}
	}
	public String layNgayNhapSach() {
		return OffsetDateTime.now().getDayOfMonth()+"/"+OffsetDateTime.now().getMonthValue()+"/"+OffsetDateTime.now().getYear();
	}

}
