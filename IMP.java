package practiceprograms;

import java.util.Arrays;

public class IMP {

	public static void main(String[] args) {
		String[] a= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String[] y=new String[a.length];
		   for(int i=0;i<a.length;i++) {
			
				y[i]=a[i].substring(0,3);
				
			}
		   
		   for(String m:y) {
			   System.out.print(m+"  ");
		   }
		  
		}
	

	}


