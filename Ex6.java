import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		int nr = scanner.nextInt();
		
		int suma = 0;
		int nrImpar = 1;
		
		for(int i=0; i<nr; i++) {
			suma+=nrImpar;
			nrImpar+=2;
		}
		
		System.out.println(suma);
		
		scanner.close();
	}

}