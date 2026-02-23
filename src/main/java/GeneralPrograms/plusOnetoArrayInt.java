package GeneralPrograms;

public class plusOnetoArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input : [1, 2, 4]
//		Output : 125
//		Explanation: 124 + 1 = 125 
		
		int[] arr = {1, 2, 4};

		
		String s = "";
		
		for(int a : arr) {
			s+=  String.valueOf(a);
		}
		
		int aa = Integer.parseInt(s);
		//double d = Double.parseDouble(s);
		
		aa =aa+1;
		
		System.out.println(s);
		System.out.println(aa);
	}
}
