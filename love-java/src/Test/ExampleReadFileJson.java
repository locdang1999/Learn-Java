package Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class ExampleReadFileJson {

	public static void main(String[] args) {
		String filePath = "src/Test/data.json";
		try {
			// Đọc toàn bộ file JSON thành chuỗi
			String content = new String(Files.readAllBytes(Paths.get(filePath)));

			// Chuyển chuỗi JSON thành JSONObject
			JSONObject jsonObject = new JSONObject(content);

			// In dữ liệu ra console
			System.out.println(jsonObject.toString(4)); // In đẹp với 4 khoảng trắng
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
