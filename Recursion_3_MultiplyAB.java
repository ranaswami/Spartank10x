package spartank10x;

import java.util.Scanner;

public class MultiplyAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		System.out.println(multiply(a, b));
	}
	public static int multiply(int a,int b) {
		if(b==1)
			return a;
		return a+ multiply(a,b-1);
	}
}
