package spartank10x;

import java.util.Scanner;

public class BleakNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int num=sc.nextInt();
		    isBleak(num);
		}
	}
	public static int setBits(int n){
	    int count=0;
	    while(n!=0){
	        n=n&(n-1);
	        count++;
	    }
	    return count;
	}
	public static void isBleak(int x){
	    int flag=1;
	    for(int i=1;i<x;i++){
	        if(i+setBits(i)==x){
	        flag=0;
	        break;
	        }
	    }
	    //if(flag==1)
	    System.out.println(flag);
	    //else
	    //System.out.println("No");
	}

}
