package TD44_Buoi2;

import java.util.Scanner;

public class BT5_IfElseLongNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tenHang;
		int soLuong,donGia,slMua;
		float tienTra=0;
		System.out.print("Nhập tên mặt hàng: ");
		tenHang=sc.nextLine();
		System.out.print("Nhập số lượng hàng: ");
		soLuong=sc.nextInt();
		System.out.print("Nhập đơn giá của mặt hàng: ");
		donGia=sc.nextInt();
		System.out.print("Nhập số lượng bạn muốn mua: ");
		slMua=sc.nextInt();
		//xử lý
		if(slMua<50) {
			tienTra=slMua*donGia;
		}else if(50<=slMua && slMua<=100) {
			System.out.println("Đơn hàng được giảm 8%: ");
			tienTra=slMua*donGia - slMua*donGia*8/100;
		}else if (slMua>100) {
			System.out.println("Đơn hàng được giảm 12%: ");
			tienTra=slMua*donGia - slMua*donGia*12/100;
		}
		System.out.println("Số tiền bạn phải trả: "+tienTra);

	}

}
