import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		int c = 0;
		int min=9; //9 e maximul pt o cifra
		
		while(n>0) {
			c = n%10;
			if(c<min) {
				min=c;
				}
			n/=10;
		}
			
			
		System.out.println(min);
		
		scanner.close();
	}

}
