package BaiTap_Buoi4;

public class Bai1_TimSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soN = 0, tong = 0;
		// xử lý
		while (tong < 5000) {
			soN++;
			tong = tong + soN;

		}
		System.out.println("Số nguyên dương n nhỏ nhất là: " + soN);
		System.out.println("Tổng >5000 là: " + tong);

	}

}
