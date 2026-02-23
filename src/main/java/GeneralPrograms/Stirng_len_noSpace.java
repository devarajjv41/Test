package GeneralPrograms;

public class Stirng_len_noSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a string";
		
		String[] strs = str.split(" ");
				
		int sum = 0;
		
		for(String s : strs) {
			sum = sum + s.length();
		}
				System.out.println(sum + " "+str.length());

	}

}
