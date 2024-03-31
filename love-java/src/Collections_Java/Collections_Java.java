package Collections_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Collections_Java {
	public static void main(String[] args) {
		/*
		 * String + StringBuilder + StringBuffer + 1 số hàm trong String => 1 vài ví dụ
		 * Ứng dụng Array (Collections) + List + ArrayList + Vector Interface có kế thừa
		 * không? Interface có kế thừa -> và dùng từ khóa extend để kế thừa
		 */

		// Kiểu dữ liệu
		int x = 5;
		float y = 6.5f;

		// String => hàm trong String
		// có từ khóa final: có nghĩa là cuối cùng, và sẽ không có 1 lớp đối tượng nào
		// kế thừ từ thằng String nữa

		// String này là 1 đối tượng
		String str = "Hello";

		System.out.println("Length: " + str.length());

		char c = str.charAt(0);
		System.out.println("Get index 0 in string: " + c);

		// Thực hiện quá trình nối chuỗi
		str = str.concat(" World!!!");
		System.out.println(str);

		System.out.println("A".compareTo(str));

		String str1 = "123456722ewe";
		String search = "2";
		System.out.println("Index: " + str1.indexOf(search) + " - Last Index: " + str1.lastIndexOf(search));

		String[] params = str1.split("2");
		System.out.println("===Kết quả cắt chuỗi===");
//		for (int i = 0; i < params.length; i++) {
//			System.out.println(params[i]);
//		}
		for (String param : params) {
			System.out.println(param);
		}

		// Các cách khai báo chuỗi (quản lý) String trong Java
		// StringBuilder & StringBuffer => quản lí chuỗi + ký tự => nối chuỗi lại
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Hello");
		strBuilder.append(" Mr.Jonh");
		strBuilder.append("!");
		strBuilder.append("!");
		strBuilder.append("!");
		System.out.println(strBuilder);

		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Hello");
		strBuffer.append(" Ms.Joe");
		strBuffer.append("!");
		strBuffer.append("!");
		strBuffer.append("!");
		System.out.println(strBuffer);

		// Sự khác biệt giữ StringBuilder & StringBuffer
		/*
		 * StringBuilder khi sử dụng thì khi append bao nhiêu thì sẽ tự động mở rộng bộ
		 * nhớ bấy nhiêu => quản lí bộ nhớ tốt hơn StringBuffer trước khi chạy sẽ tạo ra
		 * 1 bộ nhớ đệm => đưa dữ liệu vào sẽ nhanh hơn StringBuilder => Sử dụng
		 * StringBuilder nhiều hơn
		 */

		/*******************************************************/

		// Collections => quản lý được mảng => dữ liệu động => sử dụng Collections
		// List
		List<Integer> listInt = new ArrayList<Integer>(); // quản lí trong gian bộ nhớ chặt chẽ -> tốc độ chậm -> thường dùng
		// Thêm phần tử
		listInt.add(12);
		listInt.add(123);
		listInt.add(124);
		// Xóa phần tử khỏi mảng
		listInt.remove(1);
		// Duyệt mảng qua các phần tử trong mảng
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
		// Vector
		listInt = new Vector<Integer>(); // tạo sẵn không gian mảng -> chiếm bộ nhớ -> tốc độ nhanh -> hạn chế dùng
		// Thêm phần tử
		listInt.add(12);
		listInt.add(123);
		listInt.add(124);
		// Xóa phần tử khỏi mảng
		listInt.remove(1);
		// Duyệt mảng qua các phần tử trong mảng
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
	}
}
