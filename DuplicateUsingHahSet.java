package practiceprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingHahSet {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,2,5,7,3,1};
		Set hs=new HashSet();
		for(int x:a) {
			if(!hs.add(x)) {
				System.out.println("duplicate found : "+x);
			}
		}
	}

}
