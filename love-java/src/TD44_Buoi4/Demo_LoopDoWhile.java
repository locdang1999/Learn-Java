package TD44_Buoi4;

import java.util.Scanner;

public class Demo_LoopDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		//Kỹ thuật gán cờ dùng kiểu boolean để xét điều kiện vòng lập
		//vd
		boolean tiepTucChay=false;
		int so,tong=0;
		do {
			System.out.print("Nhập số: ");
			so = Integer.parseInt(sc.nextLine());
			if(so>0) {
				tong=so+so;
				tiepTucChay=true;
			}else {
				tiepTucChay=false;
			}
		}while(tiepTucChay==true);
		System.out.println("Tổng các số bạn vừa nhập: " + tong);*/
		//int n = 1;

		//final int num_compare = 12345;

		//int total = 0;

		//while( true ) 
		//{
			//System.out.println(total);
		  //           total += n;
		             //System.out.println(total);
		          //CyberSoft-
		        //     if( total >= num_compare )
		            // {
		            	// System.out.println(total);
		                //        break; 
		                        
		            // }
		            // System.out.println(total);
		            // n++;
		            // System.out.println(total);
		//}
		//System.out.println(total);
		int S=0;
		for(int i=1;i<=12345;i++) {
			S=S+i;
			if(S>=12345) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(S);
	}
}
