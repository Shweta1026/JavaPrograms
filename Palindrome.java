package practiceprograms;

public class Palindrome {

	public static void main(String[] args) {
		String s="shweta";
		String orgString=s;
		System.out.println(orgString);
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is : "+rev);
		if(rev.equals(orgString)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}

	}

}
