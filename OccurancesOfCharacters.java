package practiceprograms;

public class OccurancesOfCharacters {

	public static void main(String[] args) {
		String s="java programming java oops";
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if( c[i]==c[j]) {
					count++;
					c[j]=0;
				}
			}
			if(count>=1 && c[i]!=0) {
				System.out.println(c[i]+" : "+count);
			}
		}
		

	}

}
