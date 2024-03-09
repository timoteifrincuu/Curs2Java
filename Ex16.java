import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		int c = 0;
		
		while(n>0) {
			c = n%10;
			System.out.println(c);
			n/=10;
		}
		
		scanner.close();
	}

}
