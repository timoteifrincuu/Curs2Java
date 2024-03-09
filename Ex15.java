
public class Ex15 {

	public static void main(String[] args) {
		for(int a =0; a<=9;a++) {
			for(int b=0; b<=9;b++) {
				int n=3000 + a * 100 + 20 + b;
				if(n%9==0) {
					System.out.println(n);
				}
			}
		}	
	}

}
