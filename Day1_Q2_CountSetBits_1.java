package spartank10x;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int res=countSetBits(num);
		System.out.println(res);
	}
	public static int countSetBits(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			int j=i;
			while(j!=0) {
				j=j&(j-1);
				count++;
			}
		}
		return count;
	}
}
