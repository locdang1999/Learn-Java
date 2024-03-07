package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai7_CanBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String tenCB1,tenCB2,tenCB3,gtNam="Nam",gtCB1,gtCB2,gtCB3;
        int namSinhCB1, namSinhCB2, namSinhCB3;
        System.out.print("Nhập tên cán bộ thứ 1: ");
        tenCB1=sc.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 1: ");
        namSinhCB1=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính cán bộ thứ 1: ");
        gtCB1=sc.nextLine();
        
        System.out.print("Nhập tên cán bộ thứ 2: ");
        tenCB2=sc.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 2: ");
        namSinhCB2=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính cán bộ thứ 2: ");
        gtCB2=sc.nextLine();
        
        System.out.print("Nhập tên cán bộ thứ 3: ");
        tenCB3=sc.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 3: ");
        namSinhCB3=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính cán bộ thứ 3: ");
        gtCB3=sc.nextLine();
        
        //xá»­ lÃ½
        if(namSinhCB1>namSinhCB2 && namSinhCB1>namSinhCB3){
            if(gtCB1.equals("Nam")){
             System.out.println(tenCB1 + " sinh năm " + namSinhCB1 + " là cán bộ nam trẻ nhất");   
            }
            if( namSinhCB2>namSinhCB3){
                if(gtCB2.equals("Nam")){
             System.out.println(tenCB2 + " sinh năm " + namSinhCB2 + " là cán bộ nam trẻ nhất");   
            }
            }else if( namSinhCB3>namSinhCB2){
                if(gtCB3.equals("Nam")){
             System.out.println(tenCB3 + " sinh năm " + namSinhCB3 + " là cán bộ nam trẻ nhất");   
                }
            }
        }else if(namSinhCB2>namSinhCB1 && namSinhCB2>namSinhCB3){
            if(gtCB2.equals("Nam")){
             System.out.println(tenCB2 + " sinh năm " + namSinhCB2 + " là cán bộ nam trẻ nhất");   
            }else if( namSinhCB1>namSinhCB3){
                if(gtCB1.equals("Nam")){
             System.out.println(tenCB1 + " sinh năm " + namSinhCB1 + " là cán bộ nam trẻ nhất");   
            }
            }else if( namSinhCB3>namSinhCB1){
                if(gtCB3.equals("Nam")){
             System.out.println(tenCB3 + " sinh năm " + namSinhCB3 + " là cán bộ nam trẻ nhất");   
                }
            }
        }else if(namSinhCB3>namSinhCB1 && namSinhCB3>namSinhCB2){
            if(gtCB2.equals("Nam")){
             System.out.println(tenCB3 + " sinh năm " + namSinhCB3 + " là cán bộ nam trẻ nhất");  
            }else if( namSinhCB2>namSinhCB1){
                if(gtCB2.equals("Nam")){
             System.out.println(tenCB2 + " sinh năm " + namSinhCB2 + " là cán bộ nam trẻ nhất");   
            }
            }else if( namSinhCB1>namSinhCB2){
                if(gtCB1.equals("Nam")){
             System.out.println(tenCB1 + " sinh năm " + namSinhCB1 + " là cán bộ nam trẻ nhất");   
                }
            }
        }
        
	}

}
