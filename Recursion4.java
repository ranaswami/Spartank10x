package spartank10x;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(invert(arr, 0, arr.length-1)));
	}
	public static int[] invert(int[] a,int i,int j) {
		if(i==a.length/2)
			return a;
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		return invert(a, i+1, j-1);
	}
}
