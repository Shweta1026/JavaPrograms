package practiceprograms;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]= {5,6,1,9,2};
		
		System.out.println("arrays before sorting : "+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting : "+Arrays.toString(a));

	}

}
