package practiceprograms;

public class FibonacciSeries {
  //0 1 1 2 3 5 8 13 21 
	public static void main(String[] args) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2);
		int sum=0;
		for(int i=1;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
