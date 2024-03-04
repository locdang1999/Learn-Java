package TD44_Buoi6;

import java.util.Scanner;

public class BT_MangArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n,tongChan=0,demSoLe=0,tongAm=0;
		System.out.println("Nhập số phần tử trong mảng: ");
		n=Integer.parseInt(sc.nextLine());
		int [] array= new int [n];
		for(int  i=0; i<array.length;i++) {
			System.out.format("a[%d]=", i);
			array[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<array.length;i++) {
			System.out.format("a[%d]=%d",i, array[i]);
			if(array[i]%2==0 && array[i]>0) {
				tongChan=tongChan+array[i];
			}
			if(array[i]<0) {
				demSoLe=demSoLe+1;
				tongAm=tongAm+array[i];
			}
		}
		System.out.println("Tổng số chẵn: " + tongChan);
		System.out.println("Sô âm có trong mảng là: " +demSoLe);
		System.out.println("Tổng các số âm: " + tongAm);

	}

}
