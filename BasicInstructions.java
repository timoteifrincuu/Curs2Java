import java.util.Scanner;

public class BasicInstructions {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		
		int nr = scanner.nextInt();
		
		if(nr < 1 || nr > 10)
			System.out.println("INVALID");
		else if (nr>5)
			System.out.println("ADMIS");
		else 
			System.out.println("RESPINS");

		scanner.close();
	}

}
