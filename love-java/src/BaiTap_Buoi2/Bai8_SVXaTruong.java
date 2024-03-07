package BaiTap_Buoi2;

import java.util.Scanner;

public class Bai8_SVXaTruong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	        String tenSV1,tenSV2,tenSV3;
	        float toaDoSV1_x,toaDoSV2_x,toaDoSV3_x,toaDoTruong_x;
	        float toaDoSV1_y,toaDoSV2_y,toaDoSV3_y,toaDoTruong_y;
	        Double kqNha_Truong1,kqNha_Truong2,kqNha_Truong3;
	        System.out.print("Nhập tên sinh viên thứ 1: ");
	        tenSV1=sc.nextLine();
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 1 theo trục x: ");
	        toaDoSV1_x=Float.parseFloat(sc.nextLine());
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 1 theo trục y: ");
	        toaDoSV1_y=Float.parseFloat(sc.nextLine());
	        
	        System.out.print("Nhập tên sinh viên thứ 2: ");
	        tenSV2=sc.nextLine();
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 2 theo trục x: ");
	        toaDoSV2_x=Float.parseFloat(sc.nextLine());
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 2 theo trục y: ");
	        toaDoSV2_y=Float.parseFloat(sc.nextLine());
	        
	        System.out.print("Nhập tên sinh viên thứ 3: ");
	        tenSV3=sc.nextLine();
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 3 theo trục x: ");
	        toaDoSV3_x=Float.parseFloat(sc.nextLine());
	        System.out.print("Nhập tọa độ nhà của  sinh viên thứ 3 theo trục y: ");
	        toaDoSV3_y=Float.parseFloat(sc.nextLine());
	        
	        System.out.print("Nhập tọa độ trường đại học theo trục x: ");
	        toaDoTruong_x=Float.parseFloat(sc.nextLine());
	        System.out.print("Nhập tọa độ trường đại học theo trục y: ");
	        toaDoTruong_y=Float.parseFloat(sc.nextLine());
	        
	        //xá»­ lÃ½
	        kqNha_Truong1=Math.pow(toaDoSV1_x-toaDoTruong_x, 2)+Math.pow(toaDoSV1_y-toaDoTruong_y, 2);
	        kqNha_Truong1=Math.sqrt(kqNha_Truong1);
	        
	        kqNha_Truong2=Math.pow(toaDoSV2_x-toaDoTruong_x, 2)+Math.pow(toaDoSV2_y-toaDoTruong_y, 2);
	        kqNha_Truong2=Math.sqrt(kqNha_Truong2);
	        
	        kqNha_Truong3=Math.pow(toaDoSV3_x-toaDoTruong_x, 2)+Math.pow(toaDoSV3_y-toaDoTruong_y, 2);
	        kqNha_Truong3=Math.sqrt(kqNha_Truong3);
	        
	        //xuáº¥t
	        if(kqNha_Truong1>kqNha_Truong2 && kqNha_Truong1>kqNha_Truong3){
	            System.out.println(tenSV1 + " là sinh viên xa trường nhất");
	        }else if(kqNha_Truong2>kqNha_Truong1 && kqNha_Truong2>kqNha_Truong3){
	            System.out.println(tenSV2 + " là sinh viên xa trường nhất");
	        }else if(kqNha_Truong3>kqNha_Truong1 && kqNha_Truong3>kqNha_Truong2){
	            System.out.println(tenSV3 + " là sinh viên xa trường nhất");
	        }

	}

}
