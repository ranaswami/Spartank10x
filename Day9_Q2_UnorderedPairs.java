package spartank10x;

import java.util.Scanner;

public class UnorderedPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int num=sc.nextInt();
			System.out.println("No. of time it should be tapped is: "+unorderedPairs(num));
		}
	}
	public static int unorderedPairs(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				if((i^j)<=n) {
					count++;
				}
			}
		}
		return count;
	}
}
