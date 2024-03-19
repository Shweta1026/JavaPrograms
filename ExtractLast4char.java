package practiceprograms;

public class ExtractLast4char {

	public static void main(String[] args) {
		String s="ramyamalini";
		String rev="";
		/*for(int i=s.length()-4;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}*/
		
		String res=s.substring(s.length()-4,s.length());
		System.out.println(res);
		
		

	}

}
