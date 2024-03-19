package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsHashmap {
//count no. of words in string
	public static void main(String[] args) {
		String s="I am learning learning java java programming";
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		String[] a=s.split(" ");
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(!hm.containsKey(a[i])) {
				hm.put(a[i],count);
			}else {
				hm.put(a[i],hm.get(a[i])+1);
			}
		}
		for(String x:hm.keySet() ) {
			System.out.println(x+" : "+hm.get(x));
		}
		
	}

}
