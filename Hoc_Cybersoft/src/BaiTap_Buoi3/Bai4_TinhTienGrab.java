package BaiTap_Buoi3;

import java.util.Scanner;

public class Bai4_TinhTienGrab {

	// Thông tin khởi đầu
	public static void inThongtin() {
		System.out.println("---Các loại Grab---");
		System.out.println("1: GrabCar");
		System.out.println("2: Grab SUV");
		System.out.println("3: GrabBlack");
	}

	// Thông tin phiếu
	public static void inThongTinPhieu() {
		System.out.println(String.format("%40s", "CHI TIẾT HÓA ĐƠN"));
		System.out.println(String.format("%10s", "CHI TIẾT") + String.format("%15s", "SỬ DỤNG")
				+ String.format("%20s", "ĐƠN GIÁ(1000đ)") + String.format("%23s", "THÀNH TIỀN(1000đ)"));
	}

	// Tính tiền cho phân khúc Grab car với số km đầu tiên
	public static float tinhTienGrabCar_KMDauTien(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
			tienGrapCar = 8000;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab car với số km tiếp theo từ trên 1km->19km
	public static float tinhTienGrabCar_KMTiepTheo(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
			tienGrapCar = (kmDiDuoc - 1) * 7500;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab car với số km cuối trên 19km
	public static float tinhTienGrabCar_KMCuoi(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 19) {
			tienGrapCar = (kmDiDuoc - 19) * 7000;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab SUV với số km đầu tiên
	public static float tinhTienGrabUSV_KMDauTien(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
			tienGrapCar = 9000;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab SUV với số km tiếp theo từ trên 1km->19km
	public static float tinhTienGrabUSV_KMTiepTheo(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
			tienGrapCar = (kmDiDuoc - 1) * 8500;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab SUV với số km cuối trên 19km
	public static float tinhTienGrabUSV_KMCuoi(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 19) {
			tienGrapCar = (kmDiDuoc - 19) * 8000;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab Black với số km đầu tiên
	public static float tinhTienGrabBlack_KMDauTien(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
			tienGrapCar = 10000;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab Black với số km tiếp theo từ trên 1km->19km
	public static float tinhTienGrabBlack_KMTiepTheo(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
			tienGrapCar = (kmDiDuoc - 1) * 9500;
		}
		return tienGrapCar;
	}

	// Tính tiền cho phân khúc Grab Black với số km cuối trên 19km
	public static float tinhTienGrabBlack_KMCuoi(float kmDiDuoc) {
		float tienGrapCar = 0;
		if (kmDiDuoc > 19) {
			tienGrapCar = (kmDiDuoc - 19) * 9000;
		}
		return tienGrapCar;
	}

	// Tính tiền thời gian chờ cho phân khúc Grab Car
	public static int tinhTienThoiGianChoGrabCar(int thoiGiaCho) {
		int tongTienTGC;
		tongTienTGC = (thoiGiaCho - 3)/ 3;
		tongTienTGC = tongTienTGC* 2000;
		return tongTienTGC;
	}

	// Tính tiền thời gian chờ cho phân khúc Grab SUV
	public static int tinhTienThoiGianChoGrabSUV(int thoiGiaCho) {
		int tongTienTGC;
		tongTienTGC = (thoiGiaCho - 3)/3;
		tongTienTGC = tongTienTGC*3000;
		return tongTienTGC;
	}

	// Tính tiền thời gian chờ cho phân khúc Grab Black
	public static int tinhTienThoiGianChoGrabBlack(int thoiGiaCho) {
		int tongTienTGC;
		tongTienTGC = (thoiGiaCho - 3)/ 3;
		tongTienTGC = tongTienTGC * 3500;
		return tongTienTGC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loaiGrab ,thoiGianCho;
		float kmDiDuoc, tongTien = 0;
		inThongtin();
		System.out.print("Mời bạn chọn loại Grab: ");
		loaiGrab = Integer.parseInt(sc.nextLine());
		System.out.print("Mời bạn nhập số (km) đi được: ");
		kmDiDuoc = Float.parseFloat(sc.nextLine());
		System.out.print("Mời bạn nhập thời gian chờ: ");
		thoiGianCho = Integer.parseInt(sc.nextLine());

		// xử lý và xuất kết quả
		switch (loaiGrab) {
		case 1:
			System.out.println("Bạn đã chọn: GrabCar");
			inThongTinPhieu();

			// In phiếu km đầu tiên từ 0-->1
			if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%10s", kmDiDuoc)
						+ String.format("%15s", "8000") + String.format("%20s", tinhTienGrabCar_KMDauTien(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%10s", "0")
						+ String.format("%17s", "7500") + String.format("%15s", "0"));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%17s", "7000") + String.format("%15s", "0"));

				if (thoiGianCho > 3) {
					tongTien = tinhTienGrabCar_KMDauTien(kmDiDuoc) + tinhTienThoiGianChoGrabCar(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%8s", thoiGianCho)
							+ String.format("%17s", "2000")
							+ String.format("%18s", tinhTienThoiGianChoGrabCar(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = tinhTienGrabCar_KMDauTien(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			// In phiếu km tiếp theo từ 1-->19
			if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "8000") + String.format("%20s", "8000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%12s", kmDiDuoc - 1)
						+ String.format("%14s", "7500") + String.format("%21s", tinhTienGrabCar_KMTiepTheo(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%16s", "7000") + String.format("%15s", "0"));

				if (thoiGianCho > 3) {
					tongTien = 8000 + tinhTienGrabCar_KMTiepTheo(kmDiDuoc) + tinhTienThoiGianChoGrabCar(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%8s", thoiGianCho)
							+ String.format("%16s", "2000")
							+ String.format("%15s", tinhTienThoiGianChoGrabCar(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 8000 + tinhTienGrabCar_KMTiepTheo(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%8s", thoiGianCho)
						+ String.format("%13s", "0") + String.format("%19s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			// In phiếu km cuối cùng 19-->
			if (kmDiDuoc > 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "8000") + String.format("%20s", "8000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%11s", "18")
						+ String.format("%15s", "7500") + String.format("%20s", 7500 * 18));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%11s", kmDiDuoc - 19)
						+ String.format("%14s", "7000") + String.format("%20s", tinhTienGrabCar_KMCuoi(kmDiDuoc)));

				if (thoiGianCho > 3) {
					tongTien = 8000 + 7500 * 18 + tinhTienGrabCar_KMCuoi(kmDiDuoc)
							+ tinhTienThoiGianChoGrabCar(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%14s", "2000")
							+ String.format("%20s", tinhTienThoiGianChoGrabCar(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 8000 + tinhTienGrabCar_KMTiepTheo(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			break;
		case 2:
			System.out.println("Bạn đã chọn: Grab SUV");
			inThongTinPhieu();

			// In phiếu km đầu tiên
			if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%10s", kmDiDuoc)
						+ String.format("%15s", "9000") + String.format("%20s", tinhTienGrabUSV_KMDauTien(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%10s", "0")
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%12s", "0") + String.format("%20s", "0"));

				if (thoiGianCho > 3) {
					tongTien = tinhTienGrabUSV_KMDauTien(kmDiDuoc) + tinhTienThoiGianChoGrabSUV(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%15s", "3000")
							+ String.format("%20s", tinhTienThoiGianChoGrabSUV(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = tinhTienGrabUSV_KMDauTien(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			// In phiếu km tiếp theo từ 1-->19
			if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "9000") + String.format("%20s", "9000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%12s", kmDiDuoc - 1)
						+ String.format("%14s", "8500") + String.format("%21s", tinhTienGrabUSV_KMTiepTheo(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%16s", "0") + String.format("%15s", "0"));

				if (thoiGianCho > 3) {
					tongTien = 9000 + tinhTienGrabUSV_KMTiepTheo(kmDiDuoc) + tinhTienThoiGianChoGrabSUV(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%14s", "3000")
							+ String.format("%17s", tinhTienThoiGianChoGrabSUV(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 8000 + tinhTienGrabUSV_KMTiepTheo(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%17s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			// In phiếu km cuối cùng 19-->
			if (kmDiDuoc > 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "9000") + String.format("%20s", "9000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%11s", "18")
						+ String.format("%15s", "8500") + String.format("%20s", 8500 * 18));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%11s", kmDiDuoc - 19)
						+ String.format("%14s", "8000") + String.format("%20s", tinhTienGrabUSV_KMCuoi(kmDiDuoc)));

				if (thoiGianCho > 3) {
					tongTien = 9000 + 8500 * 18 + tinhTienGrabUSV_KMCuoi(kmDiDuoc)
							+ tinhTienThoiGianChoGrabSUV(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%14s", "3000")
							+ String.format("%20s", tinhTienThoiGianChoGrabSUV(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 9000 + 8500 * 18 + tinhTienGrabUSV_KMCuoi(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			break;
		case 3:
			System.out.println("Bạn đã chọn: GrabBlack");
			inThongTinPhieu();

			// In phiếu km đầu tiên
			if (kmDiDuoc > 0 && kmDiDuoc <= 1) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%10s", kmDiDuoc)
						+ String.format("%15s", tinhTienGrabBlack_KMDauTien(kmDiDuoc))
						+ String.format("%20s", tinhTienGrabBlack_KMDauTien(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%10s", "0")
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%12s", "0") + String.format("%20s", "0"));

				if (thoiGianCho > 3) {
					tongTien = tinhTienGrabBlack_KMDauTien(kmDiDuoc) + tinhTienThoiGianChoGrabBlack(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%15s", tinhTienThoiGianChoGrabBlack(thoiGianCho))
							+ String.format("%20s", tinhTienThoiGianChoGrabBlack(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = tinhTienGrabBlack_KMDauTien(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}
			// In phiếu km tiếp theo từ 1-->19
			if (kmDiDuoc > 1 && kmDiDuoc <= 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "10000") + String.format("%21s", "10000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%12s", kmDiDuoc - 1)
						+ String.format("%14s", "9500")
						+ String.format("%21s", tinhTienGrabBlack_KMTiepTheo(kmDiDuoc)));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%9s", "0")
						+ String.format("%16s", "0") + String.format("%15s", "0"));

				if (thoiGianCho > 3) {
					tongTien = 10000 + tinhTienGrabBlack_KMTiepTheo(kmDiDuoc)
							+ tinhTienThoiGianChoGrabBlack(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%8s", thoiGianCho)
							+ String.format("%16s", "3500")
							+ String.format("%18s", tinhTienThoiGianChoGrabBlack(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 10000 + tinhTienGrabBlack_KMTiepTheo(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%17s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			// In phiếu km cuối cùng 19-->
			if (kmDiDuoc > 19) {
				System.out.println(String.format("%10s", "'Km' đầu tiên") + String.format("%8s", "1")
						+ String.format("%16s", "10000") + String.format("%21s", "10000.0"));
				System.out.println(String.format("%10s", "Từ 1 đến 19") + String.format("%11s", "18")
						+ String.format("%15s", "9500") + String.format("%20s", 9500 * 18));
				System.out.println(String.format("%10s", "Từ 19 đến 20") + String.format("%11s", kmDiDuoc - 19)
						+ String.format("%14s", "9000") + String.format("%20s", tinhTienGrabBlack_KMCuoi(kmDiDuoc)));

				if (thoiGianCho > 3) {
					tongTien = 10000 + 9500 * 18 + tinhTienGrabBlack_KMCuoi(kmDiDuoc)
							+ tinhTienThoiGianChoGrabBlack(thoiGianCho);
					System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
							+ String.format("%14s", "3500")
							+ String.format("%20s", tinhTienThoiGianChoGrabBlack(thoiGianCho)));
					System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
					return;
				}
				tongTien = 10000 + 9500 * 18 + tinhTienGrabBlack_KMCuoi(kmDiDuoc);
				System.out.println(String.format("%10s", "Thời gian chờ") + String.format("%10s", thoiGianCho)
						+ String.format("%12s", "0") + String.format("%20s", "0"));
				System.out.println(String.format("%50s", "TỔNG TIỀN: ") + String.format("%.0f", tongTien) + " VNĐ");
			}

			break;
		}

	}

}
