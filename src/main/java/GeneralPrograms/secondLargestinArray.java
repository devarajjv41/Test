package GeneralPrograms;

public class secondLargestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,3,1,0,4,2};
		
		int largest = 0;
		int secondLarge = 0;
		
		
			for(int j = 0; j < arr.length; j++) {
				if(arr[j]>largest) {
					secondLarge = largest;
					largest = arr[j];
				}else if(arr[j]>secondLarge && arr[j]!=largest) {
					secondLarge = arr[j];
				}	
			}
		System.out.println(largest);
		System.out.println(secondLarge);
	}
}
