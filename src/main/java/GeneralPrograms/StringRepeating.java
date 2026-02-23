package GeneralPrograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class StringRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hackerearth";
		
		char ch[] = str.toCharArray();
		
		
		Set<Character> hash = new LinkedHashSet<Character>();
		
		for(int i =0;i< str.length();i++) {
			hash.add(ch[i]);
		}
		
		
		for(char c : hash) {
			int count = 0;
			for(int i =0; i < str.length();i++) {
				if(c == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("character " + c + " is repeating number of times =  " + count);
		}
		
	}

}
