package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findMiniAndMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,6,3,7};
		
		List<Integer> arr1 = Arrays.asList(5,6,3,7);
		List<Integer> arr = new ArrayList<Integer>();
		
		Arrays.sort(a);
		System.out.println("min " + a[0]);
		System.out.println("Max "+ a[a.length-1]);
		
		for(int i =0;i<a.length;i++) {
			
			arr.add(a[i]);
		}
		Collections.sort(arr);
		Collections.sort(arr1);
		
		int min = arr.get(0);
		int max = arr.get(arr.size()-1);
		
		System.out.println(min);
		System.out.println(max);

		
		int maxx = a[0];
        int minn = a[0];
        for(int i = 0; i<a.length; i++){
            if(a[i]>maxx){
                maxx = a[i];

            }
            if(a[i]<minn){
                minn = a[i];
            }


       }
        
        System.out.println(minn + " "+ maxx);
		

	}

}
