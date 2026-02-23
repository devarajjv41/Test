package GeneralPrograms;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,5,6,3,7};
		
		int search = 3;
		
		for(int i =0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println("Index "+ i);
			} 
		}
		


	}

}
