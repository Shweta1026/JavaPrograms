package practiceprograms;

public class LargestOf3 {

	public static void main(String[] args) {
		int num1=100,num2=60,num3=50;
		int max;
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is largest");
		}else if(num2>num1 && num2>num3) {
			System.out.println("num2 is largest");
		}else {
			System.out.println("num3 is largest");
		}
		
		

	}

}
