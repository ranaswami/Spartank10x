package spartank10x;

import java.util.Scanner;

public class RussianPeasants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(multiply(num1, num2));
	}
	public static int multiply(int n,int m) {
		int res=0;
		while(m>0) {
			if((m & 1)!=0) {
				res+=n;
			}
			n<<=1;
			m>>=1;
		}
		return res;
	}
}
