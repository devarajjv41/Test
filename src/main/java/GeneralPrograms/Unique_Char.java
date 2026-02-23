package GeneralPrograms;

public class Unique_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "hackerearth";	
		String unique = "";
		
		char[] ch = name.toCharArray();
		
		
		for(char c : ch) {
			int count = 0;
			for(int i = 0 ; i < name.length(); i++) {
				if(c == name.charAt(i)) {
					count++;
				}
				
			}
			if(!(count > 1)) {
				System.out.print(c+ " ");
			}
		}
	}

}
