package spartank10x;

import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(lonelyInteger(arr));
		}
	}
	public static int lonelyInteger(int a[]) {
		Arrays.sort(a);
		int res=0;
		if(a.length==1)
			return a[0];
		else {
			int i;
			for(i=0;i<a.length-1;i+=2) {
				if((a[i]^a[i+1])!=0) {
					res=a[i];
					break;
				}
			}
			if(i==a.length-1 && res==0)
				res=a[a.length-1];
			return res;
		}
	}
}

