package Homeword;

import java.util.Scanner;

/*
 * Khai báo mảng số nguyên gồm N phần tử (N nhập từ bàn phím)

Yêu cầu :

- Nhập dữ liệu cho mảng trên

- Tính tổng các phần tử chia hết cho 3 trong mảng và in ra màn hình kết quả.
 */
public class Bt2_mang_ttgtmchc3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử trong mảng= ");
		int n = sc.nextInt();
		int [] arry=new int [n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhập giá trị cho mảng= ");
		    arry[i]=sc.nextInt();
		}
		System.out.println("Giá trị trong mảng là: ");
		int S=0;
		for(int j=0; j< arry.length; j++) {
			System.out.println("a["+j+"]= " +arry[j]);
			if(arry[j]%3==0) {
				S=S+arry[j];
			}
		}
		System.out.println("Tổng các giá trị trong mảng chia hết cho 3 là= " +S);
	}
}
