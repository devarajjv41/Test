package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class convertSet_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Convert char array to string
		char[] ch = {'a','b','c','a'};
		String str = new String(ch);
		System.out.println(str);
		
		//Convert String to Char array
		char[] ch1 = str.toCharArray();
		System.out.println(ch1);
		
		//Convert char array to set
		Set<Character> set = new HashSet();
		for(char c:ch) {
			set.add(c);
		}
		
		System.out.println(set);
		
		
		Object[] aa = set.toArray();
		
		System.out.println(Arrays.toString(aa));
	}

}
