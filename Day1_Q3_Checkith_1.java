package spartank10x;

import java.util.Scanner;

public class Checkith1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int pos=sc.nextInt();
		System.out.println(checkith(num,pos));
	}
	public static boolean checkith(int x,int i) {
		boolean isThere=false;
		if((x&(1<<i))!=0)
			isThere=true;
		return isThere;
	}
}
