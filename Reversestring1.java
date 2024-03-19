package practiceprograms;

public class Reversestring1 {

	public static void main(String[] args) {
		String s="wonderful";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is : "+rev);
		
		StringBuffer sb=new StringBuffer(s);
		String result=sb.reverse().toString();
		System.out.println("REV : "+result);

	}

}
