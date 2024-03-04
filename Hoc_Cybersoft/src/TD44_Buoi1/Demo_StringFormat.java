package TD44_Buoi1;

public class Demo_StringFormat {
	public static void main(String [] args) {
		System.out.println(String.format("%20s","Lộc"));
		System.out.println(String.format("%-20s","Lộc")+"Lộc");
		System.out.println(String.format("%-20s"," ").replace("","_*"));
	}

}
