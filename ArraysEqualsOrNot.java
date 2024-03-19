package practiceprograms;

import java.util.Arrays;

public class ArraysEqualsOrNot {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		//approach 1:
		/*if(Arrays.equals(a1, a2)) {
			System.out.println("arrya are equal...");
		}else {
		   System.out.println("not equal...");
		}*/

		//approach 2:
		boolean status=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]==a2[i]) {
					status=true;
				}
				else {
					status=false;
				}
			}
			if(status==true)
			System.out.println("arrays equal...");
			else
				System.out.println("arrays not equal...");	
		}
		else {
			System.out.println("arrays not equal...");
		}
	}

}
