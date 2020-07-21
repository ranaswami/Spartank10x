package spartank10x;

import java.util.Scanner;

public class NegativePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		int b=sc.nextInt();
		System.out.println(power(a, b));
		
	}
	public static double power(double a,int b) {
		if(b==-1)
			return 1/a;
		return 1/a * power(a, b+1);
	}
}
