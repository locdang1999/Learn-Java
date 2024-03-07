package Array_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// *** Mảng 1 chiểu
		int[] arr = { 20, 100, 40, 35, 80, 60, 90, 75, 45 }; // Khai báo mảng và gán giá trị cho phần tử mảng
		float[] arrF = new float[2]; // Khai báo mảng và max length cho mảng
		String[] arrStr = {}; // Khai báo mảng
		System.out.println("length: " + arr.length + " Float: " + arrF.length + " arrStr:" + arrStr.length);
		System.out.println("Giá trị của arr với vị trí index là 2 -> arr[2]: " + arr[2]);
		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "]: " + arr[i]);
			System.out.format("arr[%d] = %d \n", i, arr[i]);
		}

		for (int i = 0; i < arrF.length; i++) {
			arrF[i] = 1 + i;
//			System.out.format("Float arr[%d] = %d \n", i, arrF[i]);
		}
//		arrF[2] = 3; Không thể thay đổi kích thước mảng
		for (int i = 0; i < arrF.length; i++) {
			System.out.format("Float arr[%d] = %.2f \n", i, arrF[i]);
		}

		// Mảng 2 chiều
//		int[][] arr2 = new int[2][3];
		int[][] arr2 = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 5, 6, 7, 8 } };
		System.out.println(arr2.length);

		System.out.println("Mảng 2 chiều: ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		Student[] students = new Student[100]; // Chỉ sử dụng khi nào biết đúng số lượng phần tử mảng
		students[0] = new Student("John", "J123", 23, "j123@gmail.com", "nam", "New York");
		students[1] = new Student("Jenna", "JE123", 23, "je8769@gmail.com", "nữa", "New York");
		students[2] = new Student("Maria", "Mr123", 23, "mra123@gmail.com", "nữ", "New York");
		students[3] = new Student("James", "JA123", 23, "ja123@gmail.com", "nam", "New York");

//		for (int i = 0; i < students.length; i++) {
//		Student student = students[i];
//			System.out.println(students[i].getEmail());
//		}
		
		// Nếu không biết trước số lượng phần tử mảng ta dùng ArrayList
//		List<Integer> list = new ArrayList<>();
		List<Student> stdList = new ArrayList<>();
		Student std = new Student("John", "J123", 23, "j123@gmail.com", "nam", "New York");
		stdList.add(std);
		std = new Student("Jenna", "JE123", 23, "je8769@gmail.com", "nữa", "New York");
		stdList.add(std);
		
		for (int i = 0; i < stdList.size(); i++) {
			Student stdShow = stdList.get(i);
			System.out.println(stdShow.getName());
			stdShow.showInfo();
		}
	}
}
