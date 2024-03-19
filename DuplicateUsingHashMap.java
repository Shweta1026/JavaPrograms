package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateUsingHashMap {

	public static void main(String[] args) {
		int[] a= {2,2,3,12,23,4,5,23};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int x:a) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}else {
				hm.put(x, hm.get(x)+1);
			}
		}
		for(int key:hm.keySet() ) {
			if(hm.get(key)>1) {
				System.out.println("duplicate found at : "+key);
			}
		}

	}

}
