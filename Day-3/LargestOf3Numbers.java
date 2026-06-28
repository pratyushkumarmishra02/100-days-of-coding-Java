/*
 //Method 1 import java.util.*;
 * 
 * public class LargestOf3Numbers {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * System.out.println("Enter 3 numbers"); int a = sc.nextInt(); int b =
 * sc.nextInt(); int c = sc.nextInt(); largestOf3Numbers(a,b,c); sc.close(); }
 * 
 * public static void largestOf3Numbers(int a,int b,int c) { int largest =
 * Math.max(a,Math.max(b, c)); System.out.println("Largest number is "+
 * largest); }
 * 
 * }
 */

//Method 2
import java.util.*;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		largestOf3Numbers(a,b,c);
		sc.close();
	}
	
	public static void largestOf3Numbers(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is largest.");
		}else if(b>a && b>c) {
			System.out.println(b+" is largest.");
		}else {
			System.out.println(c+" is largest.");
		}
	}
}
