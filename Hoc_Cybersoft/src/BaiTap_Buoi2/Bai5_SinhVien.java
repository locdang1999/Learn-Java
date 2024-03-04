package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai5_SinhVien {
	/*
	 * Nhập tên va năm sinh của 3 sinh viên.Hãy viết chương trình xuất ra màn hình tên va năm sinh của sinh viên trẻ tuổi nhất
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tenSV1,tenSV2,tenSV3;
		int namsinhSV1,namsinhSV2,namsinhSV3;
		System.out.print("Nhập tên sinh viên thứ nhất: ");
		tenSV1=sc.nextLine();
		System.out.print("Nhập năm sinh của sinh viên thứ nhất: ");
		namsinhSV1=Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhập tên sinh viên thứ 2: ");
		tenSV2=sc.nextLine();
		System.out.print("Nhập năm sinh của sinh viên thứ 2: ");
		namsinhSV2=Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhập tên sinh viên thứ 3: ");
		tenSV3=sc.nextLine();
		System.out.print("Nhập năm sinh của sinh viên thứ 3: ");
		namsinhSV3=Integer.parseInt(sc.nextLine());
		
		//xử lí và xuất
		if(namsinhSV1>namsinhSV2 && namsinhSV1>namsinhSV3) {
			System.out.println(tenSV1 +" sinh năm "+ namsinhSV1 + " là sinh viên trẻ tuổi nhất");
		}else if (namsinhSV2>namsinhSV1 && namsinhSV2>namsinhSV3) {
			System.out.println(tenSV2 +" sinh năm "+ namsinhSV2 + " là sinh viên trẻ tuổi nhất");
		}else if (namsinhSV3>namsinhSV1 && namsinhSV3>namsinhSV2) {
			System.out.println(tenSV3 +" sinh năm "+ namsinhSV3 + " là sinh viên trẻ tuổi nhất");
		}

	}

}
