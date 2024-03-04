package BaiTap.Buoi7;

public class Bai_DoiTuongHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai_CacThuocTinhHCN hinhChuNhat = new Bai_CacThuocTinhHCN();
        
        // nhập chiều dài và chiều rộng hình chữ nhật
        hinhChuNhat.nhap();
         
        // hiển thị chiều dài và chiều rộng
        hinhChuNhat.hienThi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // tính chu vi và diện tích
        double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
        double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // hiển thị chu vi và diện tích
        hinhChuNhat.hienThiChuViVaDienTich(chuVi, dienTich);

	}
	
}
