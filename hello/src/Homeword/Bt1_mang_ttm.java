package Homeword;

/*
 * Bài 1 : 

Khai báo mảng số nguyên gồm 10 phần tử.

Yêu cầu :

- Nhập giá trị cho mảng đó

- Tính tổng giá trị các phần tử trong mảng và in ra màn hình
 */

import java.util.Scanner;

public class Bt1_mang_ttm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử trong mảng= ");
		int n = sc.nextInt();
		int [] arry = new int [n];
		System.out.println("Số lượng phần tử trong mảng= " + arry.length);
		System.out.println("Nhập giá trị từng phần tử trong mảng");
		for(int i=0;i<n;i++) {
			System.out.format("a[%d]= ",i);
			arry[i]=sc.nextInt();
		}
		System.out.println("Các phần tử của mảng");
		int S=0;
		for(int j=0;j<arry.length;j++) {
			System.out.format("a[%d]= %d \n",j,arry[j]);
			S=S+arry[j];
		}
		System.out.println("Tổng các giá trị trong mảng= " + S);
	}
}
