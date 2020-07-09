package spartank10x;

import java.util.Scanner;

public class Day1_Q1_DivisibleBy2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(check(num));
	}
	public static boolean check(int x) {
		boolean isTrue=false;
		if((x&x-1)==0)
			isTrue=true;
		return isTrue;
	}
}
