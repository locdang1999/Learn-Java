package Buoi1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MangDoiXung {
	/*
	 * pseudo code 1.cho người dùng nhập 10 số nguyên 2. lưu vào mảng 3. kiểm tra
	 * mảng đối xứng 4. in ra kết quả
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int soL;
		System.out.println("NHập số lượng ptử bạn muốn nhập trong mảng");
		soL = Integer.parseInt(sc.nextLine());
		int [] intarr = new int [soL];
		for (int i = 0; i < intarr.length; i++) {
			System.out.println("Nhập phần tử của mảng thứ "+i +":");
			intarr[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println(Arrays.toString(intarr));
		boolean isPalindrome = true;
		int maxIndex = intarr.length - 1;
		for (int i = 0; i < intarr.length/2; i++) {
			if(intarr[i] != intarr[maxIndex-i]) {
				isPalindrome = false;
				break;
			}
				
		}
		
		if(isPalindrome) {
			System.out.println("Mảng vừa nhập là mảng đối xứng");
		}else {
			System.out.println("Mảng vừa nhập không là mảng đối xứng");
		}
	}

}
