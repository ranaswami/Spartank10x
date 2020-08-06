package spartank10x;

import java.util.Scanner;

public class Recursion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int number=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(func(arr, 0, number));
	}
	public static int func(int[] a,int i,int number) {
		int count=0;
		if(i==a.length)
			return 0;
		if(a[i]==number) {
			count++;
			}
		return count+func(a, i+1, number);	
	}
}
