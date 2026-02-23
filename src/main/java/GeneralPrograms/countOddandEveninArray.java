package GeneralPrograms;

import java.util.Arrays;

public class countOddandEveninArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,6,3,7,100,101};
		int even = 0;
		int odd = 0;
		
		int arr[] = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				even++;
				System.out.println("Even number is = "+a[i]);
			}else {
				odd++;
				System.out.println("odd number is = "+a[i]);

			}
		}
		
		System.out.println("number of even numbers ="+even + " \n"+"number of odd numbers ="+odd);

	}

}
