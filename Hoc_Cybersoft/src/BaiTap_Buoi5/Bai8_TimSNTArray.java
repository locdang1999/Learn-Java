package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai8_TimSNTArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Tìm số nguyên tố đầu tiên trong mảng. Nếu mảng không có số nguyên tố thì
		 * trả về – 1
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		soPhanTu = Integer.parseInt(sc.nextLine());

		// Tạo mảng
		int[] mangArray = new int[soPhanTu];

		// Nhập giá trị các phần tử của mảng
		nhapMang(mangArray, sc);

		// Xuất mảng
		xuatMang(mangArray);
		//Tìm số nguyên tố
		//inSoNguyenTo(mangArray);
		//xuát kết quả số nguyên tố đầu tiên
		System.out.println("Số nguyên tố đầu tiên trong mảng: " + inSoNguyenTo(mangArray));

	}

	private static int inSoNguyenTo(int[] mangArray) {
		// TODO Auto-generated method stub
		int soNguyenTo=0;
		for (int i = 0; i < mangArray.length; i++) {
			if(timSoNguyenTo(mangArray[i])) {
				soNguyenTo=mangArray[i];
				break;
			}else {
				return -1;
			}
		}
		return soNguyenTo;
	}

	//Hàm kiểm tra số nguyên tố
	private static boolean timSoNguyenTo(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	private static void xuatMang(int[] mangArray) {
		// TODO Auto-generated method stub
		System.out.println("Các giá trị trong mảng:");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %d\n", i, mangArray[i]);
		}
		
	}

	private static void nhapMang(int[] mangArray, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Nhập giá trị từng phần tử cho mảng: \n");
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= ", i);
			mangArray[i] = Integer.parseInt(sc.nextLine());
		}

	}

}
