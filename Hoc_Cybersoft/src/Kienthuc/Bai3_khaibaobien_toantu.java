package Kienthuc;
/*-Biến
 * Biến local, instance static
 * -Kiểu dữ liệu
 * +Kiểu số nguyên: int, short, long(0L), byte
 * +Kiểu số thực: float(0.0f), double(0.0d)
 * +char
 * +boolean
 * Chú ý:
 * +Phân biệt hoa thường, 
 * +không chứa khoảng trắng,
 * +Không dùng trùng từ khóa
 * +Bắt đầu từ thứ 2 viết hoa
 */

public class Bai3_khaibaobien_toantu {
	public static float PI=3.14f;//Đây là biến static
	/* Được khai báo trong 1 class với từ khóa "static", phía ngoài phương thức, constructor,block
	 * Chỉ có 1 bản sao duy nhất của biến static được tạo ra, dù bạn tạo bao nhiêu đối tượng từ lớp tương ứng
	 * Biến static được lưu trữ trong bộ nhớ static riêng
	 * Biến static được tạo khi chương trình bắt đầu chạy và chỉ bị hủy khi chương trình dừng
	 * Giá trị biến tatic được mặc định phụ thuộc vào kiểu dữ liệu
	 * Biến static được truy cập thông qua tên chứa nó, cú pháp: TenClass.tenBien
	 * Trong class, các phương thức sử dụng biến static bằng cách gọi tên của nó khi phương thức đó được khai báo với từ khóa "static"
	 */
	public static String maSv = "17dds0703122";
	public static float point = 10.0f;
	
	
	
	int a;//biến instance
	/*Được khai báo trong 1 lớp(class), bên ngoài phương thức,constructor và block
	 * Lưu trong bộ nhớ heap
	 * Được tạo khi 1 đối tượng được tạo bằng việc sử dụng từ khóa "new" và sẽ bị hủy khi đối tượng bị phá hủy
	 * Được sử dụng bởi các phương thức, constructor,block...Nhưng được sử dụng bởi 1 biến cụ thể
	 * Được sử dụng "access modefier" khi khai báo biến instance, mặc định là "defaul"
	 * Có giá trị mặc định phụ thuộc vào kiểu dữ liệu lên cần khởi tạo giá trị trước khi sử dụng
	 * Bên trong class mà khai báo instance, bạn có thể gọi trực tiếp bằng tên khi sử dụng ở khắp nơi bên trong class 
	 * Chú ý: constructor là khai báo biến bằng tên lớp
	 */
	public int age;
	//Sử dụng biến instance age trong phương thức tuoi
	public void tuoi(int age) {
		this.age=age;
	}
	public String name;
	public void ten(String name ) {
		this.name=name;
	}
	public void showStudent() {
		System.out.println("Name student: " + name);
		System.out.println("Age student:  " + age);
		System.out.println("Id student: " +maSv);
		System.out.println("Point student: " +point);
	}
	
	
	public  void Bien() {
		char b= 'b';//bien local
		/*
		 * khai báo trong phương thức, hàm contructor và block
		 * bị hủy khi khi pt,hàm bị hủy
		 * cần khởi tạo giá trị
		 */
		int a = 10;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Bai3_khaibaobien_toantu bienLocal = new Bai3_khaibaobien_toantu();
		bienLocal.Bien();
		Bai3_khaibaobien_toantu sv= new Bai3_khaibaobien_toantu();
		sv.ten("Đặng Gia Lộc");
		sv.tuoi(21);
		sv.showStudent();
	}
}
