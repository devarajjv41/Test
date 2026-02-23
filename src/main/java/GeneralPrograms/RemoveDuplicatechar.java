package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,6,3,3,7,5};
		
		List<Integer> arr = new ArrayList();
		Set<Integer> set = new TreeSet();
		Set<Integer> set1 = new HashSet();
		
		for(int i=0;i<a.length;i++) {
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			set1.add(a[i]);
		}
		
		System.out.println(arr);
		System.out.println(set);
		System.out.println(set1);
		
		//convert collection to int array
		int[]  intarray = arr.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(intarray));

	}

}
