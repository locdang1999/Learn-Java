package BaiTap_Buoi3;

import java.util.Scanner;

public class Bai3_TinhTienDien {
	
	public static int tinhTienDien_50KwDau(int soKw){
        int tongTien;
        tongTien=soKw*500;
        return tongTien;
    }
    
    //Tính tổng tiền điện với 50kw kế tiếp
    public static int tinhTienDien_50KwKe(int soKw){
        int tongTien;
        tongTien=50*500+(soKw-50)*650;
        return tongTien;
    }
    
    //Tính tổng tiền điện với 100kw kế tiếp
    public static int tinhTienDien_100KwKe(int soKw){
        int tongTien;
        tongTien=50*500+50*650+(soKw-100)*850;
        return tongTien;
    }
    //Tính tổng tiền điện với 150kw kế tiếp
    public static int tinhTienDien_150Kwke(int soKw){
        int tongTien;
        tongTien=50*500+50*650+100*850+(soKw-200)*1100;
        return tongTien;
    }
    //Tính tổng tiền điện với kw còn lại
    public static int tinhTienDien_ConLai(int soKw){
        int tongTien;
        tongTien=50*500+50*650+100*850+150*1100+(soKw-350)*1300;
        return tongTien;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        String ten;
	        int soKw;
	        System.out.print("Nhập tên người tiêu thụ điện: ");
	        ten=sc.nextLine();
	        System.out.print("Nhập số (Kw) người đó tiêu thụ: ");
	        soKw=Integer.parseInt(sc.nextLine());
	        
	        //xử lý và xuất thông tin
	        //Xét điều kiện là 50kw đầu và in ra kết quả
	        if(soKw<=50){
	            System.out.println("Người tiêu thụ anh(chị): " + ten);
	            System.out.println("Số điện đã tiêu thụ: " + soKw);
	            System.out.println("Tiền phải trả: " + tinhTienDien_50KwDau(soKw));
	        }
	        //Xét điều kiện là 50kw tiếp theo và in ra kết quả
	        if(soKw>50 && soKw<=100){
	            System.out.println("Người tiêu thụ anh(chị): " + ten);
	            System.out.println("Số điện đã tiêu thụ: " + soKw);
	            System.out.println("Tiền phải trả: " + tinhTienDien_50KwKe(soKw));
	        }
	        //Xét điều kiện là 100kw tiếp theo và in ra kết quả
	        if(soKw>100 && soKw<=200){
	            System.out.println("Người tiêu thụ anh(chị): " + ten);
	            System.out.println("Số điện đã tiêu thụ: " + soKw);
	            System.out.println("Tiền phải trả: " + tinhTienDien_100KwKe(soKw));
	        }
	        //Xét điều kiện là 150kw tiếp theo và in ra kết quả
	        if(soKw>200 && soKw<=350){
	            System.out.println("Người tiêu thụ anh(chị): " + ten);
	            System.out.println("Số điện đã tiêu thụ: " + soKw);
	            System.out.println("Tiền phải trả: " + tinhTienDien_150Kwke(soKw));
	        }
	        //Xét điều kiện là 150kw tiếp theo và in ra kết quả       
	        if(soKw>350){
	            System.out.println("Người tiêu thụ anh(chị): " + ten);
	            System.out.println("Số điện đã tiêu thụ: " + soKw);
	            System.out.println("Tiền phải trả: " + tinhTienDien_ConLai(soKw));
	        }
	        
	}

}
