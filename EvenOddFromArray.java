package practiceprograms;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int arr[]= {12,13,25,27,89,90,3,5};
		System.out.println("even numbers in array are :");
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}*/
		for(int num:arr) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		System.out.println("odd numbers in array are :");
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}*/
		for(int num:arr) {
			if(num%2!=0) {
				System.out.println(num);
			}
		}
			
		}
	}


