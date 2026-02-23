package GeneralPrograms;

import java.util.Arrays;

public class swapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		int arr[] = {0,0,3,1,0,4,2};
		int nonzeroInd = 0;
		
		for(int i =0; i < arr.length; i++){
			if(arr[i]!=0) {
				arr[nonzeroInd]=arr[i];
				nonzeroInd++;
//				System.out.println(nonzeroInd);
			}			
		}
		
		System.out.println(Arrays.toString(arr) + "\n latest index = "+ nonzeroInd);
		
		 while (nonzeroInd < arr.length) {
	            arr[nonzeroInd] = 0;
	            nonzeroInd++;
	        }
		 
		 
		
		System.out.println(Arrays.toString(arr));

}
}
