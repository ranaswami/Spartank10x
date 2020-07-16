package spartank10x;

import java.util.Scanner;

public class SwapOddEvenBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		swap(num);
	}
	public static void swap(int n) {
		int evenbits=n & 0xAA;
		int oddbits=n & 0x55;
		evenbits=evenbits>>1;
		oddbits=oddbits<<1;
		System.out.println(evenbits|oddbits);
	}
}
