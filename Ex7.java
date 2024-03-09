import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		
		int ma = 0;
		int c = 0;
		
		for(int i=0; i<n; i++) {
			ma+=scanner.nextInt();
			c++;
		}
		
		ma=ma/c;
		
		System.out.println(ma);	
		scanner.close();
	}

}
