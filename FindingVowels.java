package practiceprograms;

public class FindingVowels {

	public static void main(String[] args) {
		String s="aditya";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='e'|| c[i]=='i'|| c[i]=='o' ||c[i]=='u' ) {
				System.out.println(c[i]);
			}
		}
		

	}

}
