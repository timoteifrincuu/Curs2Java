import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		boolean prim = true;
		
			if(n==0 || n==1) {
				prim=false;
			}
			else {
				for(int i =2; i<=n/2; i++) {
					if(n%i==0) {
						prim=false;
					}
				}
			}
			
			if(prim) {
				System.out.println("nr e prim");
				}
			else
				System.out.println("nr nu e prim");
		
		scanner.close();
	}

}
