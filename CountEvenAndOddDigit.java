package practiceprograms;

public class CountEvenAndOddDigit {

	public static void main(String[] args) {
		int num=1234567,rem,eCount=0,oCount=0;
		
		while(num!=0) {
			rem=num%10;//6 5 4 3 2 1
			if(rem%2==0) {
				eCount++;//1 2 3
			}
			else {
				oCount++;//1 2
			}
			num=num/10;
		}
		System.out.println(eCount);
		System.out.println(oCount);
	}

}
