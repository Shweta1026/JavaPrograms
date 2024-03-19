package practiceprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1=23,num2=30,temp;
		// using temp variable
		System.out.println("before swapping numbers are : ");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("after swapping numbers are : ");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		// using +/- operators no third variable
		int a=30,b=20;
		System.out.println("before swapping numbers are : ");
		System.out.println("num1 : "+a);
		System.out.println("num2 : "+b);
		 a=a+b;//50
		 b=a-b;//50-20=30
		 a=a-b;//50-30=20
		
		System.out.println("after swapping numbers are : ");
		System.out.println("num1 : "+a);
		System.out.println("num2 : "+b);
		
		// using */ operators no third variable
				int p=30,q=20;
				System.out.println("before swapping numbers are : ");
				System.out.println("num1 : "+p);
				System.out.println("num2 : "+q);
				p=p*q;//p=600
				q=p/q;//q=30
				p=p/q;//p=20;
				
				System.out.println("after swapping numbers are : ");
				System.out.println("num1 : "+p);
				System.out.println("num2 : "+q);
	}

}
