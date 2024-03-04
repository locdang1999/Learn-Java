package TD44_Buoi6;

import java.util.Scanner;

public class Demo_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử muốn nhập");
		n=Integer.parseInt(sc.nextLine());
		int [] mangArray= new int [n];
		for(int i=0;i<mangArray.length;i++) {
			System.out.println("a["+i+"]= ");
			mangArray[i]=Integer.parseInt(sc.nextLine());
		}
		
		//xuất mảng
		for(int i=0; i<mangArray.length;i++) {
			System.out.print(mangArray[i]+" ");
		}

	}

}
