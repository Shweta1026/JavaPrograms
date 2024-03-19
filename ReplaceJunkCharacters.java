package practiceprograms;

public class ReplaceJunkCharacters {

	public static void main(String[] args) {
		String s="&*!£$%shweta!%^^";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		String s3="&*!£$%___shweta___!%^^";
	     s3=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s3);
	}

}
