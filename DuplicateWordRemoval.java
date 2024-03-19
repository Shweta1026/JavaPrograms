package practiceprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateWordRemoval {

	public static void main(String[] args) {
		String s="i am shweta shweta";
		String[] a=s.split(" ");
		System.out.println(Arrays.toString(a));
			
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					a[j]="";
				}
			}
		}
		System.out.println(Arrays.toString(a));*/
		
		HashSet hs=new HashSet();
		for(String x:a) {
			hs.add(x);
		}
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		

	}

}
