package GeneralPrograms;

public class LeapYear {

	   public static boolean isLeap(int year) {
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    return true;
	                } else {
	                    return false;
	                }
	            } else {
	                return true;
	            }
	        } else {
	            return false;
	        }
	    }

	    /**
	     * Main method to test the isLeap function with a sample input.
	     * 
	     * @param args the command-line arguments
	     */
	    public static void main(String[] args) {
	        if (isLeap(2024)) {
	            System.out.println("Leap");
	        } else {
	            System.out.println("Not Leap");
	        }
	        
	        
	       
			
			
	    }

}
