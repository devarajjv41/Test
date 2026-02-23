package GeneralPrograms;

public class fibSeries {
	
	public static int fibnum(int n) {
		
		if (n <= 1)
            return n;
		
		
		return fibnum(n-1) + fibnum(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=0;i<=n;i++) {
		
			System.out.println(fibnum(i));
	}
		
		int a = 0, b = 1;
		int num = 0;
		for(int i=0;i<=n;i++) {
			System.out.println(a);
			num = a + b;
			a = b;
			b = num;		
		}
}
}
