package practiceprograms;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,7,8,9,10};
		
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println("sum1 : "+sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum2 : "+sum2);
		System.out.println("missing number is : "+(sum2-sum1));
	}

}
