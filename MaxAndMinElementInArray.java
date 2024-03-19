package practiceprograms;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int[] arr= {123,67,45,12,89,23,99};
		// minimum number in array
		int min=arr[0],temp;
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				temp=min;
				min=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("minimum number in an array is : "+min);
		
		//maximun number in an array
		int max=arr[0];
		
		for(int i=1;i>arr.length;i++) {
			if(max<arr[i]) {
				temp=max;
				max=arr[i];
				arr[i]=max;
			}
		}
		System.out.println("maximum elements in array is : "+max);
		
	}

}
