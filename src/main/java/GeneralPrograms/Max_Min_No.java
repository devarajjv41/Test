package GeneralPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Max_Min_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer numbers[] = {2000,2,5,9,5,6,7,99,29,900};
		
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[0] + " " + numbers[numbers.length-1]);
		
		
		int midEle = numbers.length / 2 ; 
		
		System.out.println(numbers[midEle]);
		
		List<Integer> num = new ArrayList<Integer>();
		
		for(int a : numbers) {
			num.add(a);
		}
		
		List<Integer> L = Arrays.asList(numbers);	
		TreeSet<Integer> S = new TreeSet<Integer>(L);
		Collections.sort(num);
		
		
		System.out.println("Min is = " + num.get(0) + " , Max = " + num.get(num.size()-1));
		System.out.println("Min is = " + S.first() + " , Max = " + S.last());

		//reverse array
		
		int[] revArray = new int[numbers.length];
		
		System.out.println(numbers.length);
		
		System.out.println(revArray.length);
		
		for(int i = numbers.length-1, j=0; i>=0; i--) {
			revArray[j] = numbers[i];
			if(j<numbers.length) {
				j++;
			}
		}
//		
		System.out.println(Arrays.toString(revArray));
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
