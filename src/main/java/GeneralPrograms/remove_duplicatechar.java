package GeneralPrograms;

import java.util.Arrays;

public class remove_duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "hackerearth";	
		String uniqueStr = "";
		
		for(int i =0;i < name.length();i++) {	
				if(!uniqueStr.contains(Character.toString(name.charAt(i)))){
					uniqueStr += name.charAt(i);		
			}
		}
		
		System.out.println(uniqueStr);

	}

}
