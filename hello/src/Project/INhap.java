package Project;

import java.util.Scanner;

public interface INhap {
	Scanner sc = new Scanner(System.in);

	default float validationCoPhan(String thongBao) {
		do {
			try {
				System.out.print(thongBao);
				Float soFloat = Float.parseFloat(sc.nextLine());
				return soFloat;
			} catch (Exception e) {
				System.out.println("Sai định dạng vui lòng nhập số nguyên hoặc số thực!");
			}
		} while (true);
	}

	default double validationDouble(String thongBao) {
		do {
			try {
				System.out.print(thongBao);
				double soDouble = Double.parseDouble(sc.nextLine());
				return soDouble;
			} catch (Exception e) {
				System.out.println("Sai định dạng vui lòng nhập số nguyên hoặc số thực!");
			}
		} while (true);
	}

	default int validationInt(String thongBao) {
		do {
			try {
				System.out.print(thongBao);
				int soInt = Integer.parseInt(sc.nextLine());
				return soInt;
			} catch (Exception e) {
				System.out.println("Sai định dạng vui lòng nhập số nguyên!");
			}
		} while (true);
	}

}
