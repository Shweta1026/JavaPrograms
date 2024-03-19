package practiceprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		int org_no=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is : "+rev);
		
		if(org_no==rev) {
			System.out.println(org_no+" is a palindrme number");
		}
		else
		{
			System.out.println(org_no+" is not a palindrme number");	
		}
		
		
	}

}
