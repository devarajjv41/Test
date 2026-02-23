package GeneralPrograms;

public class replaceOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "011010110011";
		
		String replc_str = "00";
		
		str = str.replaceAll("11", replc_str);
		System.out.println(str);

	}

}
