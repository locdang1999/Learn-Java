package TD44_Buoi6;

public class Demo_MangArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai báo và cấp phát vùng nhớ
		int [] mangInt = new int [7];
		//khởi tạo
		int [] arr = {1,2,3};// Chỉ khởi tạo khi chưa khai báo mà vừa khai báo vừa khởi tạo luôn
		//mangInt[0]=5;//dùng khi đã khai báo và cấp phát vùng nhớ
		//
		for(int i=0,j=2;i<mangInt.length;i++,j+=2) {
			//System.out.println("Nhập gái trị cho mảng với phần thử thứ " + i);
			mangInt[i]=j;
		}
		for(int i=0;i<mangInt.length;i++) {
			System.out.print(mangInt[i]+" ");
		}

	}

}
