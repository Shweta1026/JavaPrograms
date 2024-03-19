package practiceprograms;

public class FindElementInArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,30};
		int ele=30;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(ele==arr[i]) {
				System.out.println("element found at: "+i);
				flag=true;
			}
				
		}
		if(flag==false){
			System.out.println("element not found...");
		}
	}

}
