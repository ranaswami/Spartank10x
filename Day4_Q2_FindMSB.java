package spartank10x;

import java.util.Scanner;

public class FindMSB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String s = Integer.toBinaryString(num);
		System.out.println(s);
		int res = findMsb(num);
		String res1 = Integer.toBinaryString(res);
		System.out.println(findMsb(num));
		System.out.println(res1);

	}
	public static int findMsb(int n) {
		return (n & 0xF0) >> 4;
	}
}
