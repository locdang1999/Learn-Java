package Collections_Java;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Integer> numLst = new ArrayList<Integer>();
		numLst.add(12);
		numLst.add(123);
		numLst.add(124);
		System.out.println(numLst);
		numLst.remove(2);
		System.out.println(numLst + " " +  numLst.size());
	}
}
