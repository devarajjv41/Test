package GeneralPrograms;

public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="madam";
		String str2="";
		
		StringBuffer bf = new StringBuffer(str1);
		
		bf = bf.reverse();
		
		str2=bf.toString();
		if(str1.equals(str2)) {
			System.out.println(str1 + " is polindrome");
		}else {
			System.out.println(str1 + " not a Polindrome");
		}
	}
}