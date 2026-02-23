package GeneralPrograms;

public class stringreplacess {
	public static void main(String[] args) {
        String originalString = "1111101011";
        
        
         // 1. Use a StringBuilder for efficient character modification
        StringBuffer sb = new StringBuffer(originalString);

        // 2. Loop through the characters *between* the two '1's (from index 1 to 5)
        for (int i = 0; i < originalString.length()-1; i++) {
        	if(originalString.charAt(i)=='1' && originalString.charAt(i+1)=='1' ) {
            sb.setCharAt(i, '0');
            sb.setCharAt(i+1, '0');
        	}
        }

        String expectedString = sb.toString();

        System.out.println("Original: " + originalString);
        System.out.println("Expected: " + expectedString);
        
        
    }

}
