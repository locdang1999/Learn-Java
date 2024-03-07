package Common;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		String randomString = generateRandomString(500);
//		System.out.println(randomString);
		String test = "89,639,000.73";
		System.out.println(test.toString().replaceAll(",", ""));
		double dou = Double.parseDouble(test.toString().replaceAll(",", ""));
		String finalInvAmt = String.format("%.2f", dou);
		System.out.println(dou + " " + finalInvAmt);
	}

	// số
	public static String generateRandomString(int length) {
		Random random = new Random();
		StringBuilder randomString = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			randomString.append(random.nextInt(10)); // random.nextInt(10) tạo số ngẫu nhiên từ 0 đến 9
		}
		return randomString.toString();
	}

	// chữ và số
//	public static String generateRandomString(int length) {
//        Random random = new Random();
//        StringBuilder randomString = new StringBuilder(length);
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//
//        for (int i = 0; i < length; i++) {
//            int index = random.nextInt(characters.length());
//            randomString.append(characters.charAt(index));
//        }
//
//        return randomString.toString();
//    }
}
