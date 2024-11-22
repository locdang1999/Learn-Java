package Excel;

import java.util.HashMap;

public class main {
	public static void main(String[] args) {
		System.out.println("---------Get file excel----------");
		HashMap<String, String> data = ExcelReader.readData("TEST");
		System.out.println(data.toString());
		data = ExcelReader.readData("UAT");
		System.out.println(data.toString());

		System.out.println("---------Get file properties-----");
		String getMsg = MessageLoader.getMessage("API");
		System.out.println(getMsg);
		getMsg = MessageLoader.getMessage("MSG1", "Joe");
		System.out.println(getMsg);
	}
}
