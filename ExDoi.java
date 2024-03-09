import java.util.Scanner;

public class ExDoi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		
		int nr = scanner.nextInt();
		
		if(nr < 1 || nr > 5)
			System.out.println("INVALID");
		else 
			switch(nr) {
			case 1:
				System.out.println("UNU");
				break;
			case 2:
				System.out.println("DOI");
				break;
			case 3:
				System.out.println("TREI");
				break;
			case 4:
				System.out.println("PATRU");
				break;
			case 5:
				System.out.println("CINCI");
				break;
			}
		
		scanner.close();
	}

}
