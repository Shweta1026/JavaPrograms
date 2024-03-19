package practiceprograms;

import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] a= {1,20,30,20,10,1};

		/*for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicates found "+a[i]);
				}
			}
			
		}*/
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println("duplicates found : "+a[i]);
			}
		}
	}

}
