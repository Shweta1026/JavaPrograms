package practiceprograms;

import java.io.FileInputStream;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s="hello java";//olleh avaj
		
		String revWord="";
		String[] s1=s.split(" ");
		for(String w:s1) {
			String rev="";
			for(int j=w.length()-1;j>=0;j--) {
				
				rev=rev+w.charAt(j);
			}
			revWord=revWord+rev+" ";
			
		}
		System.out.println("reverse : "+revWord);
		

	}

}
