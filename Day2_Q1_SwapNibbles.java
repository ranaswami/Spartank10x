package spartank10x;

import java.util.Scanner;

public class SwapNibbles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		//String str=Integer.toBinaryString(num);
		//System.out.println(str);
		swapnibbles(num);
	}
	public static void swapnibbles(int x) {
		int[] binary = new int[100];
		int[] swap = new int[binary.length];
		int index=0;
		while(x>0) {
			binary[index++]=x%2;
			x=x/2;
		}
		for(int i=index-1;i>=0;i--)
			System.out.print(binary[i]);
		System.out.println();
		for(int i=index-4,j=0;i>=0 && j<4;i--,j++)
			swap[j]=binary[i];
		for(int i=index,j=4;i>=index-3 && j<8;i--,j++)
			swap[j]=binary[i];
		System.out.println("After swapping the nibbles we get:");
		for(int j=0;j<8;j++) {
			System.out.print(swap[j]);
		}
			
	}
}
