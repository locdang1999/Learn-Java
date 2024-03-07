package Kienthuc;

import java.util.Scanner;

public class Bai4_ifelse_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhập a");
		a = sc.nextInt();
			if(a<6) {
				System.out.println("Học lớp lá");
			}else if(a<=11) {
				System.out.println("Học tiểu học");
			}else if(a<=15) {
				System.out.println("Học trung học");
			}else if(a<=18) {
				System.out.println("Học phổ thông");
			}else if(a>18) {
				System.out.println("Học đại học, cao học");
			}
		sc=new Scanner(System.in);	
		System.out.println("Nhập giới tính của bạn");
		String gender=sc.nextLine();
		/*if(gender.equals("Nam")) {//equal: dùng trong bài toán so sánh với chuỗi
			System.out.println("Học sinh nam");
		}else {
			System.out.println("Học sinh nữ");
		}*/
		
		
		switch (gender) {
		case "Nam":
			System.out.println("Học sinh nam");
			break;
		case "Nữ":
			System.out.println("Học sinh nữ");
			break;
		default:
			break;
		}
	}
}
