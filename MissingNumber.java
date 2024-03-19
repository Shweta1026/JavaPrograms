package practiceprograms;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum is : "+sum);
		for(int i=1;i<=5;i++) {
			sum1=sum1+i;
		}
		System.out.println("sum1 is : "+sum1);
   System.out.println("missing no. is : "+(sum1-sum));
	}

}
