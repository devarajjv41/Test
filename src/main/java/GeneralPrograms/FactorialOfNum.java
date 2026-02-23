package GeneralPrograms;

public class FactorialOfNum {
	
	public static void main(String[] args) {
		int n = 15,c=1;
		
		
		for(int i=1;i<=n;i++) {
			c = c * i;
		}
		
		System.out.println(c);
		
		System.out.println(Fact(n));
	}
	
	public static int Fact(int n) {
		if(n<=1) {
			return n;
		}
		
		return n * Fact(n-1);
	}
	

}
