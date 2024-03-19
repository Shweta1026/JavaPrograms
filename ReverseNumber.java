package practiceprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// logic 1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		
		/*int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("reverse number is : "+rev);
		*/
		// using StringBuffer
		
		/*StringBuffer rev1;
		StringBuffer sb=new StringBuffer(String.valueOf(num)); 
		rev1=sb.reverse();
		System.out.println("reverse number is : "+rev1);*/
		
		//using stringbuilder
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("rev no. is : "+rev);

	}

}
