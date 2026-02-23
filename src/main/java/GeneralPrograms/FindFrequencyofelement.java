package GeneralPrograms;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class FindFrequencyofelement {

	public static void main(String[] args) {
		int[] a = {5,6,3,3,7,5};
		
		Set<Integer> list = new LinkedHashSet<Integer>();
		//Linkedhashset maintains the insertion order of the elements
		
		for(int b: a) {
			list.add(b);
		}
		
		
		for(int num : list) {
			int count = 0;
			for(int i =0; i < a.length; i++) {
				if(num == a[i]) {
					count++;
				}
			}
			System.out.println("Number of times "+num+" is repeating in array is " + count);
		}

	}

}
