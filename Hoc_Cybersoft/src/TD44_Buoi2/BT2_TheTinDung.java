package TD44_Buoi2;

import java.util.Scanner;

public class BT2_TheTinDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float creaditCardBalence,payment,balance,penalty=0;
		System.out.print("Nhập số dư thẻ(creadit card balence): ");
		creaditCardBalence = sc.nextFloat();
		System.out.print("Số tiền thanh toán trong tháng(payment amount)");
		payment=sc.nextFloat();
		balance=payment - creaditCardBalence;
		if(balance>0) {
			penalty=balance*1.5f/100;
		}
		System.out.println("Penalty you need to pay: " + penalty);
	}

}
