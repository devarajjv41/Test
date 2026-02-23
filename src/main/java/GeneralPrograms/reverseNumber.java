package GeneralPrograms;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12302;
		
		System.out.println(reverseNum(num));

	}
	
	public static int reverseNum(int n) {
		if(n<=1) {
			return n;	
		}
		int rev = 0, rem;
		
		while(n>0) {
			rem = n%10;
			rev = (rev * 10 ) + rem;
			n = n/10;
		}
		
		return rev;
		
	}

}
