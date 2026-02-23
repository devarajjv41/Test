package GeneralPrograms;

import java.util.Arrays;

public class find2ndLargeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "generated dev deva devar devara devaraj";
		
		String[] s = str.split(" ");
//		Arrays.sort(s);

		
		String large = "";
		String secLarge = "";
		String thridlarge = "";
		
		for(String word : s) {
			if(word.length()>large.length()) {	
				secLarge = large;
				large = word;
			}else if(word.length()>secLarge.length() && !word.equals(large)) {
				thridlarge = secLarge;
				secLarge = word;
			}else if(word.length()>thridlarge.length() && !word.equals(large)) {
				thridlarge = word;
			}
		}
		
		System.out.println("---"+large);
		System.out.println("---"+secLarge);
		System.out.println("---"+thridlarge);

		
	}

}
