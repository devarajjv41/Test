package GeneralPrograms;

public class CustomExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 10;
			String b = "Dev";
			
			    if(a < 18){
			         throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			    }
			    
			    /*Checked exception - CHecked by compiler at compiling time
			     * IOException (and its subclasses like FileNotFoundException)
				  SQLException
				  ClassNotFoundException
				  InterruptedException 
				  
				  Unchecked exception
				  NullPointerException
				  ArrayIndexOutOfBoundsException
				  ArithmeticException
				  ClassCastException
				  
				  */

	}

}
