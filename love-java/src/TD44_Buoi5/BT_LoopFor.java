package TD44_Buoi5;

import java.util.Scanner;

public class BT_LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soN,soNN,tong=0;
		System.out.print("Nhập N số: ");
		soN=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=soN;i++) {
			System.out.print("Nhập sô nguyên N:");
			soNN=Integer.parseInt(sc.nextLine());
			if(soNN%3==0) {
				tong=tong+soNN;
			}
		}
		System.out.println("Tổng số chia hết cho 3 là: " + tong);

	}

}
