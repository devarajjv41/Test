package GeneralPrograms;

public class evenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i =1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println("Even numbers " + i);
			}
			
			if(i%2 != 0) {
				System.out.println("Odd numbers " + i);
			}
		}
		
		System.out.println("-------------");

		
		for(int i =1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println("Even numbers " + i);
			}else {
				System.out.println("Odd numbers " + i);
			}
		}

	}

}
