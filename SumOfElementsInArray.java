package practiceprograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=0;
		/*for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}*/
		
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println("sum of elements in an array is :"+sum);

	}

}
