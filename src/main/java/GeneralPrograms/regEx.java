package GeneralPrograms;
import java.util.regex.*;

public class regEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to match one or more characters, you would use .+. So testi.+g would match "testing".
		boolean result = Pattern.matches("test.*@.*.com", "testinaaag@gmail.com");
		System.out.println("1 "+result); //true
		
		result = Pattern.matches("testi.+", "testinaaag");
		System.out.println("2 "+result); //true
		
		result = Pattern.matches("TestingA*utomation", "TestingAutomation");
		System.out.println("3 "+result); //true
		
		result = Pattern.matches("Testing123*A*@Automation", "Testing1234AAA@Automation");
		System.out.println("4 "+result);  // False
		
		/*	.+: Matches one or more of any character.
		*	@: Matches the literal "@" symbol.
		*	.+: Matches one or more of any character. 
		*/
		result = Pattern.matches(".+@.+", "dev123@gmail.com");
		System.out.println("5 "+result); //true
		
		
		/*
		 * ^ represent starts with
		 * \\w+ represents any char - Alpha , numbers , + means any number of chars
		 *  $ represents the end of the expression
		 */
		result = Pattern.matches("^\\w+#\\w+@\\w+\\.\\w+$", "123#devarajaJV1111@gmail.com");
		System.out.println("6 "+result); //true
		
		
		//accepts the string dev followed by digits length of 3 and ends with any char
		result = Pattern.matches("^dev\\d{3}.+$", "dev112testing");
		System.out.println("7 "+result); //true
	}
}