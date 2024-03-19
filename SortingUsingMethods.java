package practiceprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingMethods {

	public static void main(String[] args) {
		int a[]= {10,89,23,45};
		System.out.println("before sorting : "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("after sorting : "+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("after sorting : "+Arrays.toString(a));
		
		Integer b[]= {10,89,23,45};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("after sorting : "+Arrays.toString(b));
		

	}

}
