package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai1_LietKeSo_3Mu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số phần tử cho mảng: ");
		soPhanTu = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[soPhanTu];

		//Tạo giá trị cho mảng
		mangArray = nhapMang(mangArray, 0, 300);

		System.out.println("Xuất giá trị cho các phần tử trong mảng:");
		xuatMang(mangArray);

		System.out.println("Các số có dạng 3^k:");
		timSo(mangArray);

	}

	private static void timSo(int[] mangArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangArray.length; i++) {
			if (mangArray[i] == 0) {
				System.out.println("0= 3^0 vị trí " + i);
			}
			int dem = 0;
			for (int j = mangArray[i]; j >= 3; j /= 3) {
				if (j % 3 == 0 && j % 2 != 0) {
					dem++;
				}else {
					dem=0;
					break;
				}
			}
			if (dem > 0) {
				System.out.println(mangArray[i] + "= 3^" + dem + " vị trí: " + i);
			}
		}

	}

	private static void xuatMang(int[] mangArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangArray.length; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}

	}

	private static int[] nhapMang(int[] mangArray, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangArray;

	}

}
