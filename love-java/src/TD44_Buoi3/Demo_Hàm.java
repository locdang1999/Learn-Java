package TD44_Buoi3;

public class Demo_Hàm {
	
	
	//trong công việc thì người developer ít dùng else mà lợi dụng hàm sử dụng return; nếu return không sẽ tự đọng thoát khỏi if
	//Viết hàm thì chỉ kiểm tra 1 chức năng và sử dụng kiểu boolean là chủ yếu
	public  static void xuatThongtin() {
		System.out.println("Chào các bạn!!!");
	}
	
	public void tinhTong(int a,int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	public static float tinhLuong(float soNgayLam,float luongMotNgay) {
		float luong = soNgayLam*luongMotNgay;
		return luong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xuatThongtin();
		float a =5.5f,b=600000;
		float ketQua=tinhLuong(a, b);
		System.out.println(ketQua);
	}

}
