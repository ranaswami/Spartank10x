package spartank10x;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(func(arr,0)));
	}
	public static int[] func(int[] a,int n) {	
		if(n==a.length) {
			return a;
			}
		if(a[n]<0)
			a[n]=0;
		return func(a, n+1);	
	}
}
