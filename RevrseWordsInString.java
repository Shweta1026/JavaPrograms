package practiceprograms;

public class RevrseWordsInString {

	public static void main(String[] args) {
		String s="we are learning java program";
		String[] a=s.split(" ");
		String rev="";
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i]+" ";
		}
       System.out.println(rev);
	}

}
