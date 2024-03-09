import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		int nr = scanner.nextInt();
		
		int suma = 0;
		int nrPar = 2;
		
		for(int i=0; i<nr; i++) {
			suma+=nrPar;
			nrPar+=2;
		}
		
		System.out.println(suma);
		
		scanner.close();
	}

}
