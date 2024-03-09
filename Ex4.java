import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu primul nr:");
		int nr1 = scanner.nextInt();
		
		System.out.println("Introdu al doilea nr:");
		int nr2 = scanner.nextInt();

		System.out.println("Introdu al treilea nr:");
		int nr3 = scanner.nextInt();
		
		if(nr1<nr2) {
			if(nr1<nr3)
				System.out.println(nr1);
			else
				System.out.println(nr3);
		}
		else if (nr2<nr3){
			System.out.println(nr2);
		}
		else
			System.out.println(nr3);
		
		scanner.close();
	}

}
