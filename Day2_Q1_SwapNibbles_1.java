package spartank10x;

import java.util.Scanner;

public class SwapNibbles_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		String str = Integer.toBinaryString(num);
		System.out.println(str);
		swapnibbles_1(num);
	}
	public static void swapnibbles_1(int n) {
		int x=((n & 0x0F) << 4 | (n & 0xF0) >> 4);
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}
}
