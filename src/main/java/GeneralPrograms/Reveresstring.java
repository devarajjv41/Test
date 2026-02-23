package GeneralPrograms;

public class Reveresstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Deva";
		String r = "";
//		char ch;
		
		for(int i = s.length()-1;i>=0;i--) {
			 
			r = r + s.charAt(i);		
		}
		System.out.println(r);
	}

}
 