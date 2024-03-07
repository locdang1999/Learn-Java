package BaiTap_Buoi5;

import java.util.Scanner;

public class Bai7_SapXepTangArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Sắp xếp mảng theo thứ tự tăng dần.
		 */
		Scanner sc = new Scanner(System.in);
		int soPhanTu;
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		soPhanTu=Integer.parseInt(sc.nextLine());
		
		//Tạo mảng
		int [] mangArray=new int [soPhanTu];
		//Tạo biến đổi vị trí
		int temp=0;
		
		//xử lý
		//Nhập giá trị các phần tử của mảng
		System.out.print("Nhập giá trị từng phần tử cho mảng: \n");
		for(int i=0; i<mangArray.length;i++) {
			System.out.format("a[%d]= ", i);
			mangArray[i]=Integer.parseInt(sc.nextLine());
		}
		
		//sắp xếp mảng tăng dần
		for(int i=0;i<mangArray.length-1;i++) {
			for(int j=i+1;j<mangArray.length;j++) {
				if(mangArray[i]>mangArray[j]) {
					temp=mangArray[i];
					mangArray[i]=mangArray[j];
					mangArray[j]=temp;
				}
			}
		}
		
		//Xuất mảng
		System.out.println("Mảng sau khi sắp xếp tăng dần:");
		for(int i=0; i<mangArray.length;i++) {
			System.out.format("a[%d]= %d\n", i,mangArray[i]);
		}

	}

}
