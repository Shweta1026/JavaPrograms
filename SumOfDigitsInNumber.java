package practiceprograms;

public class SumOfDigitsInNumber{
	

public static void main(String[] args){
	int num=12345;
	int sum=0;
	
	while(num>0) {
		sum=sum+num%10;//4 7 9 10
		num=num/10;//123 12 1 0
	}
	System.out.println("sum of digits is : "+sum);
}

}
