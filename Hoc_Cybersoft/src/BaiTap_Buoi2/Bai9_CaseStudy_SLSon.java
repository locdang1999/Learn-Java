package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai9_CaseStudy_SLSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soCanhCua,soCuaSo;
        float chieuD,chieuR,chieuC,luongSon,dtTuong,luongSonTuong=0,luongSonTranNha=0;
        System.out.print("Nhập chiều dài của căn phòng: ");
        chieuD=Float.parseFloat(sc.nextLine());
        System.out.print("Nhập chiều rộng của căn phòng: ");
        chieuR=Float.parseFloat(sc.nextLine());
        System.out.print("Nhập chiều cao của căn phòng: ");
        chieuC=Float.parseFloat(sc.nextLine());
        System.out.print("Nhập số cánh cửa của căn phòng: ");
        soCanhCua=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cửa sổ của căn phòng: ");
        soCuaSo=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập lượng sơn cần để bao phủ(m^2/lit): ");
        luongSon=Float.parseFloat(sc.nextLine());
		//xử lý
        dtTuong=(chieuD+chieuD)*2*chieuC;
        luongSonTuong=dtTuong*luongSon-soCanhCua*((chieuC*chieuR)*2/5)-soCuaSo*((chieuC*chieuR)/5);
        luongSonTranNha=chieuD*chieuR*luongSon;
        //xuất
        System.out.println("Số sơn cần bao phủ tường là: " + luongSonTuong);
        System.out.println("Số sơn cần bao phủ trần nhà: " + luongSonTranNha);
	}

}
