import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
		int palindrom = 0;
		int nn=n;
		
		while(n>0) {		
			palindrom =palindrom*10+ n%10;
			n/=10;
		}
		
		if(palindrom==nn)
			System.out.println(" e palindrom");
		else
            System.out.println(" nu este palindrom");
		scanner.close();

	}

}
