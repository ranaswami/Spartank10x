package spartank10x;

import java.util.Scanner;

public class DivideNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		divide(dividend,divisor);
	}
	public static void divide(int dividend,int divisor) {
		int quotient=0;
		while(dividend >= divisor) {
			dividend = dividend-divisor;
			quotient++;
		}
		System.out.println("Quotient is: "+quotient);
		System.out.println("Remainder is: "+dividend);
	}
}
