package practiceprograms;

public class CountDigits {

	public static void main(String[] args) {
		int num=123;
	    int count=0;
	    
	    while(num!=0) {
	    
	    num=num/10;//123 12  1
	    count++;
	    }
	    
	    System.out.println("number of digits are : "+count);
	    

	}

}
