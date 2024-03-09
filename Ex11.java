import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		
		for(int i=2; i<=n; i++) {
			if(n%i==0)
				System.out.println(i);
		}
		
		scanner.close();

	}

}
