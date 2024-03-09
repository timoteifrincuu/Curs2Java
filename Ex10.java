
public class Ex10 {

	public static void main(String[] args) {
		int n = 1001;
		
		while(!ePrim(n)){
			n++;
		}
		
		System.out.println("cel mai mic  nr prim mai mare de 1000 e " + n);
	}
	
		public static boolean ePrim(int n){
			for(int i = 2; i< n; i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
	}

}
