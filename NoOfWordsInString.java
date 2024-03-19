package practiceprograms;

import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ' && a[i+1]!=' ') {
				count++;
			}
		}
		System.out.println("no.of words in string are : "+count);

	}

}
