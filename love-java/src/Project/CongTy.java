package Project;

import java.lang.reflect.Array;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class CongTy implements INhap {
	private int stt = 1;
	private int sttGD = 0;
	private String tenCTy;
	private String maThue;
	private double doanhThu;
	private String tenVietTat;
	private Scanner sc = new Scanner(System.in);
	private ArrayList<QLNhanSu> qlns;
	private int STT = 001;

	public CongTy() {
		this.qlns = new ArrayList<QLNhanSu>();
	}

	public CongTy(String tenCTy, String maThue, double doanhThu, String tenVietTat, ArrayList<QLNhanSu> qlns) {
		this.tenCTy = tenCTy;
		this.maThue = maThue;
		this.doanhThu = doanhThu;
		this.tenVietTat = tenVietTat;
		this.qlns = qlns;
	}

	public String getTenCTy() {
		return tenCTy;
	}

	public void setTenCTy(String tenCTy) {
		this.tenCTy = tenCTy;
	}

	public String getMaThue() {
		return maThue;
	}

	public void setMaThue(String maThue) {
		this.maThue = maThue;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public String getTenVietTat() {
		return tenVietTat;
	}

	public void setTenVietTat(String tenVietTat) {
		this.tenVietTat = tenVietTat;
	}

	public ArrayList<QLNhanSu> getQlns() {
		return qlns;
	}

	public void setQlns(ArrayList<QLNhanSu> qlns) {
		this.qlns = qlns;
	}

	private void nhapThongTinCTy() {
		System.out.print("Nhập tên công ty: ");
		this.tenCTy = sc.nextLine();
		System.out.print("Nhập tên viết tắt công ty: ");
		this.tenVietTat = sc.nextLine();
		System.out.print("Nhập mã số thuế của công ty: ");
		this.maThue = sc.nextLine();
		this.doanhThu = this.validationDouble("Nhập doanh thu tháng của công ty: ");
	}

	// Định dang cho danh sách công ty
	private void xuatThongTinCTy() {
		int num = 84;
		String ttCongTy = "THÔNG TIN CÔNG TY";
		String ttNhanSu = "DANH SÁCH NHÂN SỰ";

		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", "") + ttCongTy
				+ String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", ""));
		System.out.println("Tên công ty: " + this.tenCTy);
		System.out.println("Mã số thuế: " + this.maThue);
		System.out.println("Doanh thu: " + String.format("%.0f", this.doanhThu) + "000 VNĐ");
		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", "") + ttNhanSu
				+ String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", ""));
		this.drawLine(num);
		System.out.println();
		System.out.println(String.format("%1s", "STT") + String.format(" %10s  ", "Mã số")
				+ String.format("%14s  ", "Họ tên") + String.format("%19s  ", "Số điện thoại")
				+ String.format("%12s  ", "Ngày làm") + String.format("%16s  ", "Lương cơ bản")
				+ String.format("%16s  ", "Lương") + String.format("%15s", "Chức vụ   ")
				+ String.format("  %33s  ", "  Số nhân viên/Cổ phần/Mã trưởng phòng quản lý"));
		this.drawLine(num);
		System.out.println();
		this.xuatThongTin();
		this.drawLine(num);
		System.out.println();
		System.out.println(String.format(" %10s  ", "") + String.format("%16s  ", "") + String.format("%16s  ", "")
				+ String.format("%30s  ", "Tổng lương") + String.format("%17.0f", tinhTongLuong()) + "000VNĐ"
				+ String.format("%16s", "") + String.format("%25s  ", ""));
		this.drawLine(num);
		System.out.println();
	}

	// Cho người dùng chọn chức năng trong menu
	public void chonMenu() {
		int chon = 0;
		boolean flag = false;
		do {
			this.inMenu();
			chon = this.validationInt("Mời bạn chọn chức năng: ");
			switch (chon) {
			case 1:
				this.nhapThongTinCTy();
				sc.nextLine();
				break;
			case 2:
				this.phanBoNhanVien();
				sc.nextLine();
				break;
			case 3:
				String tuChon;
				System.out.print("Mời bạn chọn thêm nhân viên hoặc xóa nhân viên(t,x): ");
				tuChon = sc.nextLine();
				if (tuChon.equalsIgnoreCase("t")) {
					this.themNhanVien();
				}
				if (tuChon.equalsIgnoreCase("x")) {
					this.xoaNhanSu();
				}
				sc.nextLine();
				break;
			case 4:
				this.xuatThongTinCTy();
				sc.nextLine();
				break;
			case 5:
				System.out
						.println("Tổng lương toàn công ty: " + String.format("%.0f", this.tinhTongLuong()) + "000VNĐ");
				sc.nextLine();
				break;
			case 6:
				System.out.println("Nhân viên có lương cao nhất:");
				QLNhanSu nhanVien = this.timNhanVienLuongCaoNhat();
				nhanVien.xuatThongTin();
				sc.nextLine();
				break;
			case 7:
				System.out.println("Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất:");
				QLNhanSu truongPhong = this.timTruongPhongQuanLyNhieuNhat();
				if (truongPhong != null)
					System.out.println(String.format("%1s", "STT") + String.format(" %10s  ", "Mã số")
							+ String.format("%14s  ", "Họ tên") + String.format("%19s  ", "Số điện thoại")
							+ String.format("%12s  ", "Ngày làm") + String.format("%16s  ", "Lương cơ bản")
							+ String.format("%17s  ", "Lương") + String.format("%16s", "Chức vụ")
							+ String.format("%25s  ", "Số nhân viên/Cổ phần/Mã trưởng phòng quản lý"));
				truongPhong.xuatThongTin();
				sc.nextLine();
				break;
			case 8:
				this.sapXepTenABC();
				sc.nextLine();
				break;
			case 9:
				this.sapXepLuongGiam();
				sc.nextLine();
				break;
			case 10:
				System.out.println("Giám đốc có số lượng cổ nhiếu nhiều nhất: ");
				QLNhanSu giamDoc = this.timGiamDocMaxCoPhieu();
				if (giamDoc != null)
					System.out.println(String.format("%1s", "STT") + String.format(" %10s  ", "Mã số")
							+ String.format("%14s  ", "Họ tên") + String.format("%19s  ", "Số điện thoại")
							+ String.format("%12s  ", "Ngày làm") + String.format("%16s  ", "Lương cơ bản")
							+ String.format("%17s  ", "Lương") + String.format("%16s", "Chức vụ")
							+ String.format("%30s  ", "Số nhân viên/Cổ phần/Mã trưởng phòng quản lý"));
				giamDoc.xuatThongTin();
				sc.nextLine();
				break;
			case 11:
				this.tinhTongThuNhapGiamDoc();
				sc.nextLine();
				break;
			case 0:
				flag = true;
				System.out.println("Chương trình kết thúc ^_^!");
				break;
			default:
				System.out.println("Vui lòng chọn đúng chức năng ^_^!");
			}
		} while (!flag);
	}

	// In menu cho người dùng chọn
	private void inMenu() {
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|                           MENU                                         |");
		System.out.println("|    Chọn 1: Nhập thông tin công ty                                      |");
		System.out.println("|    Chọn 2: Phân bố nhân viên vào trưởng phòng                          |");
		System.out.println("|    Chọn 3: Thêm/xóa thông tin một nhân sự                              |");
		System.out.println("|    Chọn 4: Xuất ra thông tin toàn bộ người trong công ty               |");
		System.out.println("|    Chọn 5: Tính và xuất tổng lương cho toàn công ty                    |");
		System.out.println("|    Chọn 6: Tìm nhân viên thường có lương cao nhất                      |");
		System.out.println("|    Chọn 7: Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất|");
		System.out.println("|    Chọn 8: Sắp xếp nhân viên theo thứ tự abc                           |");
		System.out.println("|    Chọn 9: Sắp xếp nhân viên theo thứ tự lương giảm dần                |");
		System.out.println("|    Chọn 10: Tìm giám đốc có số cổ phiếu nhiều nhất                     |");
		System.out.println("|    Chọn 11: Tính và xuất tổng thu nhập của từng giám đốc               |");
		System.out.println("|(*) Chọn 0: Thoát chương trình                                          |");
		System.out.println("+------------------------------------------------------------------------+");
	}

	// Thêm nhân viên
	private boolean themNhanVien() {
		String themNVCT = "";
		System.out.print("Mời bạn chọn nhân viên bạn muốn thêm ''Giám Đốc, Trưởng Phòng, Nhân viên''(GD,TP,NV): ");
		themNVCT = sc.nextLine();
		if (!"".equals(themNVCT) && !themNVCT.equalsIgnoreCase("GD") && !themNVCT.equalsIgnoreCase("TP")
				&& !themNVCT.equalsIgnoreCase("NV")) {
			System.out.println("Sai thông tin! Mời bạn nhập lại!");
		}
		if ("".equals(themNVCT)) {
			System.out.println("Bạn không được bỏ trống! Mời bạn nhập lại!");
		}
		if (themNVCT.equalsIgnoreCase("gd") && !"".equals(themNVCT)) {
			QLNhanSu gd = new GiamDoc();
			gd.setStt(this.stt++);
			gd.setMaSo(generateId());
			gd.nhapThongTin();
			this.qlns.add(gd);
			System.out.println("Bạn đã thêm thành công ^_^!");
		}
		if (themNVCT.equalsIgnoreCase("tp") && !"".equals(themNVCT)) {
			QLNhanSu tp = new TruongPhong();
			tp.setStt(this.stt++);
			tp.setMaSo(generateId());
			tp.nhapThongTin();
			this.qlns.add(tp);
			System.out.println("Bạn đã thêm thành công ^_^!");
		}
		if (themNVCT.equalsIgnoreCase("nv") && !"".equals(themNVCT)) {
			QLNhanSu nv = new NhanVien();
			nv.setStt(this.stt++);
			nv.setMaSo(generateId());
			nv.nhapThongTin();
			this.qlns.add(nv);
			System.out.println("Bạn đã thêm thành công ^_^!");
		}
		return true;
	}

	// Xuất thông tin của toàn công ty
	private void xuatThongTin() {
		for (QLNhanSu qlNhanSu : this.qlns) {
			qlNhanSu.xuatThongTin();
		}

	}

	// Phân bổ nhân viên vào trưởng phòng
	private void phanBoNhanVien() {
		ArrayList<NhanVien> dsNhanVienChuaPhanBo = new ArrayList<NhanVien>();
		ArrayList<TruongPhong> dsTruongPhong = new ArrayList<TruongPhong>();
		int luaChon;

		for (QLNhanSu ns : this.qlns) {
			if (ns instanceof NhanVien && ((NhanVien) ns).getTruongPhongQL() == null) {
				dsNhanVienChuaPhanBo.add((NhanVien) ns);
			} else if (ns instanceof TruongPhong) {
				dsTruongPhong.add((TruongPhong) ns);
			}
		}
		System.out.println("Phân bổ nhân viên: ");

		for (NhanVien nv : dsNhanVienChuaPhanBo) {
			System.out.println("Thông tin nhân viên:");
			System.out.println();
			System.out.println(
					String.format("%1s", "STT") + String.format(" %10s  ", "Mã số") + String.format("%14s  ", "Họ tên")
							+ String.format("%19s  ", "Số điện thoại") + String.format("%12s  ", "Ngày làm")
							+ String.format("%16s  ", "Lương cơ bản") + String.format("%17s  ", "Lương")
							+ String.format("%16s", "Chức vụ") + String.format("%25s  ", "Mã Trưởng phòng quản lý"));
			nv.xuatThongTin();

			System.out.println();
			System.out.println("Danh sách trưởng phòng:");
			System.out.println(
					String.format("%1s", "STT") + String.format(" %10s  ", "Mã số") + String.format("%14s  ", "Họ tên")
							+ String.format("%19s  ", "Số điện thoại") + String.format("%12s  ", "Ngày làm")
							+ String.format("%16s  ", "Lương cơ bản") + String.format("%17s  ", "Lương")
							+ String.format("%16s", "Chức vụ") + String.format("%25s  ", "Số nhân viên"));
			for (int i = 0; i < dsTruongPhong.size(); i++) {
				System.out.print("Chọn " + (i + 1) + ": " + "\t");
				dsTruongPhong.get(i).xuatThongTin();
			}
			System.out.println("Chọn 0. Không phân bổ");

			System.out.print("Lựa chọn: ");
			luaChon = this.validationInt("Mời bạn chọn trưởng phòng: ");
			TruongPhong tp;

			if (luaChon <= 0) {
				continue;
			}

			tp = dsTruongPhong.get(luaChon - 1);
			nv.setTruongPhongQL(tp.getMaSo());
			tp.tangNhanVien();
		}

	}

	// Xóa nhân sự
	private boolean xoaNhanSu() {

		if (this.qlns.isEmpty()) {
			System.out.println("Không có nhân viên để xóa!");
			return false;
		}

		String maXoaNhanVien;
		System.out.print("Mời bạn nhập mã nhân viên cần xóa: ");
		maXoaNhanVien = sc.nextLine();

		if (maXoaNhanVien == null) {
			return false;
		}

		for (QLNhanSu nhanSu : this.qlns) {
			if (maXoaNhanVien.equalsIgnoreCase(nhanSu.getMaSo()) && nhanSu instanceof GiamDoc) {
				this.qlns.remove(nhanSu);
				System.out.println("Bạn đã xóa thành công!");
				return true;
			}
			if (maXoaNhanVien.equalsIgnoreCase(nhanSu.getMaSo()) && nhanSu instanceof TruongPhong) {
				this.qlns.remove(nhanSu);
				this.ngatKetNoi(maXoaNhanVien);
				System.out.println("Bạn đã xóa thành công!");
				return true;
			}

			if (maXoaNhanVien.equalsIgnoreCase(nhanSu.getMaSo()) && nhanSu instanceof NhanVien) {
				String maTruongPhong = ((NhanVien) nhanSu).getTruongPhongQL();
				giamNhanVien(maTruongPhong);
				this.qlns.remove(nhanSu);
				System.out.println("Bạn đã xóa thành công!");
				return true;
			}
		}
		return false;
	}

	// Ngắt kết nối liên kết giữa nhân viên và trưởng phòng khi xóa trưởng phòng
	private void ngatKetNoi(String maXoaNhanVien) {
		for (QLNhanSu qlNhanSu : this.qlns) {
			if (qlNhanSu instanceof NhanVien
					&& ((NhanVien) qlNhanSu).getTruongPhongQL().equalsIgnoreCase(maXoaNhanVien)) {
				((NhanVien) qlNhanSu).setTruongPhongQL(null);
			}
		}
	}

	// Giảm số lượng nhân viên do trưởng phòng quản lí khi xóa nhân viên thuộc
	// trưởng phòng quản lí
	private void giamNhanVien(String maXoaNhanVien) {
		for (QLNhanSu qlNhanSu : this.qlns) {
			// System.out.println("đang vào");
			if (maXoaNhanVien.equalsIgnoreCase(qlNhanSu.getMaSo()) && qlNhanSu instanceof TruongPhong) {
				// System.out.println("đã vào");
				((TruongPhong) qlNhanSu).giamNhanVien();
			} /*
				 * else { System.out.println("Không vào được"); }
				 */
		}
	}

	// Tính tổng lương cho toàn công ty
	private double tinhTongLuong() {
		double tongLuong = 0;
		for (QLNhanSu nhanSu : qlns) {
			tongLuong += nhanSu.tinhLuong();
		}

		return tongLuong;
	}

	// Tìm nhân viên có lương cao nhất
	private QLNhanSu timNhanVienLuongCaoNhat() {
		QLNhanSu nhanVien = new NhanVien();
		int viTri = -1;

		int maxLength = qlns.size();

		// 1. tim nhan vien thuong dau tien
		for (int i = 0; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);
			if (ns instanceof NhanVien) {
				nhanVien.setMaSo(ns.getMaSo());
				nhanVien.setHoTen(ns.getHoTen());
				nhanVien.setSDT(ns.getSDT());
				nhanVien.setSoNgayLamViec(ns.getSoNgayLamViec());
				nhanVien.setLuongMotNgay(ns.getLuongMotNgay());
				viTri = i;
				break;
			}
		}

		for (int i = viTri; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);

			if (!(ns instanceof NhanVien))
				continue;

			if (ns.tinhLuong() > nhanVien.tinhLuong()) {
				nhanVien.setMaSo(ns.getMaSo());
				nhanVien.setHoTen(ns.getHoTen());
				nhanVien.setSDT(ns.getSDT());
				nhanVien.setSoNgayLamViec(ns.getSoNgayLamViec());
				nhanVien.setLuongMotNgay(ns.getLuongMotNgay());
			}
		}

		return nhanVien;
	}

	// Tìm trưởng phòng có nhân viên dưới quyền nhiều nhất
	private QLNhanSu timTruongPhongQuanLyNhieuNhat() {
		QLNhanSu truongPhong = null;
		int viTri = 0;
		int maxLength = qlns.size();
		// tim ong truong phong dau tien
		for (int i = 0; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);
			if (ns instanceof TruongPhong) {
				viTri = i;
				truongPhong = ns;
				break;
			}
		}

		// tim truong phong co so luong nhan vien duoi quyen nhieu nhat
		for (int i = viTri; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);
			if (!(ns instanceof TruongPhong))
				continue;

			int maxSoNv = ((TruongPhong) truongPhong).getSoLuongNV();
			int soNv = ((TruongPhong) ns).getSoLuongNV();
			if (maxSoNv < soNv) {
				truongPhong = ns;
			}
		}

		return truongPhong;
	}

	// Sắp xếp tên nhân viên theo thứ tự abc

	private void sapXepTenABC() {
		for (int i = 0; i < this.qlns.size() - 1; i++) {
			for (int j = i + 1; j < this.qlns.size(); j++) {
				if (this.qlns.get(i).tachTen().compareToIgnoreCase(this.qlns.get(j).tachTen()) > 0) {
					QLNhanSu temp = null;
					temp = this.qlns.get(i);
					qlns.set(i, qlns.get(j));
					qlns.set(j, temp);
				}
			}
		}
		this.xuatThongTinCTy();
	}

	// Sắp xếp nhân viên theo lương giảm dần
	private void sapXepLuongGiam() {
		for (int i = 0; i < this.qlns.size() - 1; i++) {
			for (int j = i + 1; j < this.qlns.size(); j++) {
				if (this.qlns.get(i).tinhLuong() < this.qlns.get(j).tinhLuong()) {
					QLNhanSu temp = null;
					temp = this.qlns.get(i);
					qlns.set(i, qlns.get(j));
					qlns.set(j, temp);
				}
			}
		}
		this.xuatThongTinCTy();
	}

	// Tìm giám đốc có số lượng cổ phiếu nhiều nhất
	private QLNhanSu timGiamDocMaxCoPhieu() {
		QLNhanSu giamDoc = null;
		int viTri = 0;
		int maxLength = qlns.size();
		// tim ong truong phong dau tien
		for (int i = 0; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);
			if (ns instanceof GiamDoc) {
				viTri = i;
				giamDoc = ns;
				break;
			}
		}

		// tim truong phong co so luong nhan vien duoi quyen nhieu nhat
		for (int i = viTri; i < maxLength; i++) {
			QLNhanSu ns = qlns.get(i);
			if (!(ns instanceof GiamDoc))
				continue;

			float maxSoNv = ((GiamDoc) giamDoc).getCoPhanCT();
			float soNv = ((GiamDoc) ns).getCoPhanCT();
			if (maxSoNv < soNv) {
				giamDoc = ns;
			}
		}
		return giamDoc;
	}

	// Tính tổng thu nhập của từng giám đốc
	private void tinhTongThuNhapGiamDoc() {
		double tongLuong = 0;
		double loiNhuanCTy;
		if (this.qlns.isEmpty()) {
			System.out.println("Vui lòng nhập thên ít nhất 1 nhân viên là giám đốc!");
		} else {
			loiNhuanCTy = this.doanhThu - this.tinhTongLuong();
			System.out.println("---------Bảng tổng doanh thu cảu Giám đốc---------");
			System.out.println(
					String.format("%1s ", "STT") + String.format(" %11s  ", "Mã số") + String.format("%13s  ", "Họ tên")
							+ String.format("%18s ", "Chức vụ") + String.format("%17s ", "Tổng doanh thu"));
			for (QLNhanSu qlNhanSu : qlns) {
				if (qlNhanSu instanceof GiamDoc) {
					this.sttGD++;
					tongLuong = ((GiamDoc) qlNhanSu).tinhLuong()
							+ (((GiamDoc) qlNhanSu).getCoPhanCT() / 100) * loiNhuanCTy;
					/*
					 * System.out.println("Mã số: " + qlNhanSu.maSo + " Họ tên:" + qlNhanSu.hoTen +
					 * " Chức vụ: " + qlNhanSu.chucVu + " Tổng thu nhập: " + String.format("%.0f",
					 * tongLuong) + "000VNĐ");
					 */
					System.out.println(String.format("%2s |", this.sttGD) + String.format("%10s |", qlNhanSu.maSo)
							+ String.format("%16s |", qlNhanSu.hoTen) + String.format("%16s |", qlNhanSu.chucVu)
							+ String.format("%9.0f", tongLuong) + "000VNĐ");
				}
			}
		}
	}

	// Tạo Id random

	private String generateId() {
		return tenVietTat + OffsetDateTime.now().getYear() + getStt(4);
	}

	private String getStt(int length) {
		String result = "";
		int i = 1;

		while (STT / (int) Math.pow(10, length - i) == 0) {
			result += "0";
			i++;
		}
		result += STT;
		STT++;

		return result;
	}

	// Tạo khung
	private void drawLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}

}
