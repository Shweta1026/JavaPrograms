package practiceprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="a    rmy";
		String s2="Mao  y";
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		System.out.println(s1 +"   "+s2);
		if(s1.length()==s2.length()) {
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
		
			Arrays.sort(c1);
			System.out.println("sorted s1 : "+Arrays.toString(c1));
			Arrays.sort(c2);
			System.out.println("sorted s1 : "+Arrays.toString(c2));
			System.out.println(Arrays.equals(c1, c2));
			if(Arrays.equals(c1, c2)) {
				System.out.println("strings are anagram");
			}
			else {
				System.out.println("strings are not anagram");
			}
			
		}else {
			System.out.println("strings are not anagram...");
		}

	}

}
