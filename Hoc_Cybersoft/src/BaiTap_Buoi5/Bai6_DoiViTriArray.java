package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai6_DoiViTriArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Đổi chỗ 2 giá trị trong mảng theo vị trí (Cho nhập vào 2 vị trí muốn đổi chỗ giá trị).
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		soPhanTu=Integer.parseInt(sc.nextLine());
		//Tạo mảng
		int [] mangArray=new int [soPhanTu];
		//Tạo biến đổi vị trí
		int viTri1,viTri2,temp=0;
		
		//xử lý
		//Nhập giá trị các phần tử của mảng
		System.out.print("Nhập giá trị từng phần tử cho mảng: \n");
		for(int i=0; i<mangArray.length;i++) {
			System.out.format("a[%d]= ", i);
			mangArray[i]=Integer.parseInt(sc.nextLine());
		}
		// Nhập vị trí phần tử cần đổi và bị đổi
		System.out.println("Nhập vị trí bạn cần đổi: ");
		viTri1=Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vị trí bị đổi: ");
		viTri2=Integer.parseInt(sc.nextLine());
		//xử lý đổi vị trí phần tử
		temp=mangArray[viTri1];
		mangArray[viTri1]=mangArray[viTri2];
		mangArray[viTri2]=temp;
		//Xuất ra các phần tử trong mảng đã bị đổi 2 vị trí cần đổi
		System.out.println("Các phần tử trong mảng sau khi bị thay đổi");
		for(int i=0;i<mangArray.length;i++) {
			System.out.format("a[%d]= %d\n", i,mangArray[i]);
		}

	}

}
