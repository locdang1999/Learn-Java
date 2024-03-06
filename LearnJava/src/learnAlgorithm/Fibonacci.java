package learnAlgorithm;

/*	- Fibonacci là một chỉ báo trong phân tích kỹ thuật có nguồn gốc từ một lý thuyết toán học của Leonardo Fibonacci từ thế kỷ 12.

	- Theo lý thuyết này, Fibonacci là một chuỗi các số bắt đầu là 0, 1 và số phía sau là tổng của 2 số đứng liền trước.

	- Dãy số Fibonacci: 0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,..

	- Từ dãy số này, người ta chia các số trong dãy số cho nhau và phát hiện ra các tỷ lệ: 161.8%, 23.6%,  28.2%, 61.8%. 
	Nhiều nhà phân tích cho rằng các tỷ lệ này là các mức nổi bật trong giao dịch và phân tích kỹ thuật. 
	Về cơ bản, có 3 mức quan trọng thường được sử dụng là 23.6%, 38.2% và 61.8%.*/

public class Fibonacci {

	private static int fibonacciNumber(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
	}

	public static void main(String[] args) {
		int maxNumber = 10;
		System.out.print("The first " + maxNumber + " Fibonacci number are: ");
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(fibonacciNumber(i) + " ");
		}
	}

}
