import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu un nr:");
		int nr1 = scanner.nextInt();
		
		System.out.println("Introdu un alt nr:");
		int nr2 = scanner.nextInt();
		
		if(nr1%2==0 && nr2%2==0)
			System.out.println("Media aritmetica este: " + ((nr1 + nr2) / 2));
		else if (nr1%2!=0 && nr2%2!=0)
			System.out.println("Produsul este: " + (nr1*nr2));
		else 
			System.out.println("Suma lor este: " + (nr1+nr2));
			
		scanner.close();
	}

}
