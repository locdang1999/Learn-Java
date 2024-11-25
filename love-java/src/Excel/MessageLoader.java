package Excel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MessageLoader {
	private static Properties properties = new Properties();

	// Đối với java thuần thì bỏ trực tiếp vào package
	// Còn nếu maven thì bỏ trong resoucre/data ===>
	// ===> MessageLoader.class.getResourceAsStream("/data/messages.properties")
	static {
		try (InputStream input = MessageLoader.class.getResourceAsStream("/messages.properties")) {
			if (input != null) {
				properties.load(input);
			} else {
				System.out.println("Properties file not found!");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static String getMessage(String... key) {
		System.out.println(properties);
		String message = properties.getProperty(key[0], "Message not found!");

		if (key.length > 1 && message != null) {
			int fidx = message.indexOf("{0}");
			int sidx = message.indexOf("{1}");
			int tidx = message.indexOf("{2}");
			int foidx = message.indexOf("{3}");
			int soidx = message.indexOf("{4}");
			
			System.out.println(fidx);

			if (fidx != -1) {
				message = message.replaceAll("\\{0}", key[1]);
			}
			if (sidx != -1) {
				message = message.replaceAll("\\{1}", key[2]);
			}
			if (tidx != -1) {
				message = message.replaceAll("\\{2}", key[3]);
			}
			if (foidx != -1) {
				message = message.replaceAll("\\{3}", key[4]);
			}
			if (soidx != -1) {
				message = message.replaceAll("\\{4}", key[5]);
			}
		}

		return message;
	}

}

//replace: Thay thế ký tự hoặc chuỗi con không sử dụng biểu thức chính quy.
//replaceAll: Thay thế chuỗi con sử dụng biểu thức chính quy.
