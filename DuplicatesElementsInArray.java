package practiceprograms;

import java.util.HashSet;

public class DuplicatesElementsInArray {
	public static void main(String[] args) {
		String arr[]= {"c","c++","java","python"};
		/*Appraoch 1:
		 * boolean flag=false;
		 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate elements..."+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("duplicate elements not found...");
		}*/
		
		//approach2:
		
		HashSet<String> lang=new HashSet();
		boolean flag1=false;
		for(String l:arr) {
			if((lang.add(l))==false) {
				System.out.println("duplicate elements found.."+l);
				flag1=true;
			}
		}
		if(flag1==false) {
			System.out.println("no duplicate elements...");
		}
		
			
	}

}
