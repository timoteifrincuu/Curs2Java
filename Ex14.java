
public class Ex14 {

	public static void main(String[] args) {
		int suma = 1000;
		int a,b =0;
		
		for(a=1; a<suma; a++) {
			b=suma-a;}

		if(a%17==0 || a%13==0 && b%19==0 || b%7==0) {
			System.out.println(a + " " + b);}

	}

}
