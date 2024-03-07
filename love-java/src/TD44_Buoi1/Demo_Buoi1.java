package TD44_Buoi1;

import java.util.Scanner;

public class Demo_Buoi1 {
	public static void main(String [] args) {
		System.out.println("Chào buổi tối");
		System.out.println(25);
		String greetings="Good night";
		System.out.println(greetings);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tuổi học sinh: ");
		byte ageStudent=sc.nextByte();
		System.out.println("Nhập số lượng bến xe buýt: ");
		int bus=sc.nextInt();
		System.out.println("Nhập số lượng phường xã: ");
		long xaPhuong=sc.nextLong();
		System.out.println("Nhập điểm môn toán");
		float diemToan=sc.nextFloat();
		System.out.println("Nhập điểm trung bình các môn học:");
		float diemTB=sc.nextFloat();
		System.out.println("Nhập doanh thu công ty: ");
		double doanhThuCTy=sc.nextDouble();
		float diem=9.7f;
		System.out.println(ageStudent);
		System.out.println(bus);
		System.out.println(xaPhuong);
		System.out.println(diemToan);
		System.out.println(diemTB);
		System.out.println(doanhThuCTy);
		System.out.println(diem);
	}

}
