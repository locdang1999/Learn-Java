package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestNhanVien {
	public static void main(String[] args) {
		List<NhanVien> nvLst = new ArrayList<NhanVien>();

		NhanVien nv = new NhanVien();

		nv.setTen("Loc");
		nvLst.add(nv);

		nv = new NhanVien();
		nv.setTen("Johnny");
		nvLst.add(nv);
		
		for (int i = 0; i < nvLst.size(); i++) {
			System.out.println(nvLst.get(i).getTen());
		}

	}
}
