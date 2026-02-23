package GeneralPrograms;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,3,1,0,4,2};
		int[] arr1 = new int[arr.length];
		
//		System.out.println(arr.length + " "+ arr1.length);
		int count = 0;
		for(int i = arr.length-1;i>=0;i--) {
			arr1[count]=arr[i];
			count++;
		}
		System.out.println("Reversed arrya :"+Arrays.toString(arr1) + " \noriginal array :"+  Arrays.toString(arr));

	}

}
