package VD;

public class Student {
	//Bien quy lop là 1 bien private static
	private static double quylop;
	// bien khoa là 1 bien constant
	public static final String trkhoa="Khoa IT";
	   // Bien instance nay la nhin thay cho bat ky lop con nao.
	   public String ten;
	   
	   // Bien hocphi la chi nhin thay cho lop Student.
	   private double hocphi;
	   
	   // Bien ten duoc gan trong constructor. 
	   public Student (String tenSV){
	      ten = tenSV;
	   }

	   // Bien hocphi duoc gan mot gia tri.
	   public void setHocPhi(double hp){
	      hocphi = hp;
	   }
	   
	   // Phuong thuc nay in chi tiet ve Student.
	   public void inThongTin(){
	      System.out.println("Ho va ten: " + ten );
	      System.out.println("Hoc phi: " + hocphi);
	      System.out.println(trkhoa);
	   }

	   public static void main(String args[]){
	      Student sv1 = new Student("Đặng Gia Lộc");
	      sv1.setHocPhi(4000);
	      sv1.inThongTin();
	      quylop=10000;
	      System.out.println("Tiền quỹ: " + quylop);
	   }
}
