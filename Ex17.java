import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		int c = 0;
		int max = 0;
		
		while(n>0) {
			c = n%10;
			if(c>max) {
				max=c;
				}
			n/=10;
		}
			
			
		System.out.println(max);
		
		scanner.close();
	}

}
