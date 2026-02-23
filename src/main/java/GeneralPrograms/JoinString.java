package GeneralPrograms;

public class JoinString {
	
	public static void main(String[] args) {
		String[] str = {"Hi","Java","Programming"};
		
		
		String s = String.join("-", str);
		
		System.out.println(s);
		
		s = s.replaceAll("-", " ");
		System.out.println(s);
		
		String new_str =s.substring(3, 7);
		System.out.println(new_str);
		
		String a = "Butter";
		String b = "Panner";
		
		int val = a.compareTo(b);
		System.out.println(val);

		
		
		
	}

}
