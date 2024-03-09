import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		int invers = 0;
		
		while(n>0) {		
			invers =invers*10+ n%10;
			n/=10;
		}
		
		System.out.println(invers);
		scanner.close();
	}

}
