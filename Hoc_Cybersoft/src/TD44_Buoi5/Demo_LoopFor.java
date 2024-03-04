package TD44_Buoi5;

import java.util.Scanner;

public class Demo_LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soN;
		System.out.println("Nhập chiều dài cạnh: ");
		soN=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=soN;i++) {
			for(int j=1;j<=soN;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
