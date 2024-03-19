package practiceprograms;

public class PyramidPattern {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=k;j++) {
				System.out.print("*"+" ");
			}
			k=k+2;
			System.out.println();
		}

	}

}
