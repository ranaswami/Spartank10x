package spartank10x;

import java.util.Scanner;

public class CountNo1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(countno1s(num));
	}
	public static int countno1s(int n) {
		int count=0,rem;
		while(n>0) {
			rem =n%10;
			n/=10;
			if(rem==1)
				count++;
		}
		return count;
	}

}
