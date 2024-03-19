package practiceprograms;

public class CountNoOfA {

	public static void main(String[] args) {
		String s="java programming java oops";
		int n=s.length();
		System.out.println("length of string with a : "+s.length());
		s=s.replaceAll("a", "");
		int m=s.length();
		System.out.println("length of string without a : "+s.length());
		System.out.println("number of a in string are : "+(n-m));
	}

}
