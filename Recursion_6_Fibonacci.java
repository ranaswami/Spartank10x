package spartank10x;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int a[]= new int[51];
		for(int i=0;i<51;i++)
			a[i]=-1;
		int res=fib(num,a);
		System.out.println(res);

	}
	public static int fib(int n,int a[]) {
	if(n<=1)
		return n;
	if(a[n] != -1)
		return a[n];
	a[n]= fib(n-1,a) + fib(n-2,a);
	return a[n];
	}
	
}
