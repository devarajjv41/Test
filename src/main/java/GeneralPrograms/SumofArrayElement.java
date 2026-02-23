package GeneralPrograms;

public class SumofArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,6,3,3,7,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		System.out.println("Sum of all element in arrays = "+sum);
	}

}
