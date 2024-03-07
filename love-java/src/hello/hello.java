package hello;
import java.util.Scanner;

public class hello {
	public static void main1(String[] args) {
		System.out.println("Hello word");
	}
	public static void main(String[] args) {
		//final: hằng số, hằng số thì không thay đổi dc giá trị đó
		final int a=10;
		System.out.println("Const= "+a);
		int b=20, age=0;
		age=a+b;
		System.out.println("Tuổi là:"+age);
		//cho người dùng nhập từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn");
		String ten = scanner.nextLine();
		System.out.println(ten);
	}
}
