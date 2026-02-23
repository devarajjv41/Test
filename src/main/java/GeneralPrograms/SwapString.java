package GeneralPrograms;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString string1 = "Hello";
		String string1 = "Helloaaa";
		String string2  = "Worlds";
		
		string1 = string1 + string2;  // 10 is length
		string2 = string1.substring(0, string1.length() - string2.length()); // 10-5 = 5 , so 0 to 4 string will be taken.
		string1 = string1.substring(string2.length()); // from 5th index remaining text will be stored.
		
		System.out.println(string1);
		System.out.println(string2);

	}

}
