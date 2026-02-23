package GeneralPrograms;

public class replaceVowels {
	
	public static void main(String[] args) {
		String vowel = "[aeiouAEIOU]";
		
		String statement = "THE qUick brown fox jumps over the lazy dog.";
		
		String replaced_str = statement.replaceAll(vowel, "*");
		
		System.out.println(replaced_str);
	}

}
