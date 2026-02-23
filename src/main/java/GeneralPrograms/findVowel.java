package GeneralPrograms;

public class findVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char vowel[] = {'a','e','i','o','u'};
		
		String name = "Devaraja";
		for(char c :  vowel) {
			for(int i = 0 ; i< name.length(); i++) {
				if(c == name.charAt(i)) {
					System.out.println(c + " is present at index " + i);
				}
			}
		}
	}
}
