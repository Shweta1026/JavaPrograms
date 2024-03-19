package practiceprograms;

public class SmallestAndLargestElement {

	public static void main(String[] args) {
		int[] a= {10,3,5,20,44,56};
		int temp=0;
		/*int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				temp=min;
				min=a[i];
				a[i]=temp;
			}
		}
		System.out.println("min number is : "+min);*/
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
			temp=max;
			max=a[i];
			a[i]=temp;
			}
		}
		System.out.println("max number is : "+max);
		

	}

}
