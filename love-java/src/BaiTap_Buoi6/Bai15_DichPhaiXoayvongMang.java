package BaiTap_Buoi6;

import java.util.Scanner;

public class Bai15_DichPhaiXoayvongMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử bạn muốn: ");
		n = Integer.parseInt(sc.nextLine());
		int[] mangArray = new int[n];

		// Tạo giá trị ngẫu nhiên cho mảng
		mangArray = taoGiaTriMangArray(mangArray, 0, 100);

		// Xuất giá trị của mảng
		System.out.println("Giá trị của mảng: ");
		xuatMangArray(mangArray, n);

		// Hàm dịch phải xoay vòng mảng
		int k;
		System.out.print("Nhập số lần dịch phải của mảng:");
		k=Integer.parseInt(sc.nextLine());
        xoayDichPhai(mangArray, n,k);
		xuatMangArray(mangArray, n);

		
	}

	private static int[] taoGiaTriMangArray(int[] mangArray, int a, int b) {
		for (int i = 0; i < mangArray.length; i++) {
			mangArray[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangArray;
	}

	private static void xuatMangArray(int[] mangArray, int n) {
		for (int i = 0; i < n; i++) {
			System.out.format("a[%d]= %d \n", i, mangArray[i]);
		}
	}

	private static void xoayDichPhai(int[] mangArray, int n, int k) {
		//Mảng A có n phần tử và tiến hành dịch vòng k lần
		while(k-1>0) {
			k--;
			int temp=mangArray[n-1];
			int i;
			for( i=n-1; i <0;i--) {
				mangArray[i]=mangArray[i-1];
			}
			mangArray[0]=temp;
		}
	}

}
