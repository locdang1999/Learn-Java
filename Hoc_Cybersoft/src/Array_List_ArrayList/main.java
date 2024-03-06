package Array_List_ArrayList;

public class main {
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
		
	}
}
