package spartank10x;

import java.util.Scanner;

public class Checkith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int pos=sc.nextInt();
		String str= Integer.toString(num);
		System.out.println(checkith(str, pos));
	}
	public static boolean checkith(String s,int i) {
		boolean isAvailable=false;
		if(s.charAt(i)=='1')
			isAvailable=true;
		return isAvailable;
	}
}
