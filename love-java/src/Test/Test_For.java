package Test;

public class Test_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem=0;
		int t=9;
		for(int i=t;i>=3;i/=3) {
			if(i%3==0 && i%2!=0) {
				dem++;
			}else {
				dem=0;
				break;
			}
		}
		if(dem>0) {
			System.out.println("3^"+dem);
		}
	}

}
