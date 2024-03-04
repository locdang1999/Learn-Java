package Buoi2_OOP;

public class Main {
	public static void main(String[] args) {
		System.out.println("start");
		double randomNumber = getRandomNumber();
		System.out.println(randomNumber);
		KhachHang khachHang = new KhachHang();
		khachHang.CMND = "132132132";
		System.out.println(khachHang.CMND);
	}

	public static double getRandomNumber() {
		return Math.random() * 100 + 1;
	}
}
