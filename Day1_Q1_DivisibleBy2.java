package spartank10x;

import java.util.Scanner;

public class Day1_Q1_DivisibleBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			int num= sc.nextInt();
			if(check(num)==true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check(int n) {
		boolean isDivisible=false;
		int i=0;
		while((int) Math.pow(2, i)<=n) {
			if(n==(int) Math.pow(2, i)) {
				isDivisible=true;
			}
			i++;
		}
		//System.out.println(isDivisible);
		return isDivisible;
	}

}
