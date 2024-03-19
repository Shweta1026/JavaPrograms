package practiceprograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="how are you";
		String[] a=s.split(" ");
		String revString="";
		for(String w:a) {
			String rev="";
			for(int i=w.length()-1;i>=0;i--) {
				rev=rev+w.charAt(i);
			}
			revString=revString+rev+" ";
		}
		System.out.println("reverse string is :"+revString);
	}

}
