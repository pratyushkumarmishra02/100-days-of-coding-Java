//Using normal process
/*
 * 
 * import java.util.Scanner;
 * 
 * public class FactorialOfNumber {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc =new Scanner(System.in); System.out.print("Enter a number:"); int
 * n = sc.nextInt(); int fact = 1; int i=1; while(i<=n) { fact*=i; i++; }
 * System.out.println("Factorial of "+n+" is "+fact); }
 * 
 * }
 */

//Using function
/*
 * 
 * import java.util.Scanner;
 * 
 * public class FactorialOfNumber {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc =new Scanner(System.in); System.out.print("Enter a number:"); int
 * n = sc.nextInt(); int fact =factorial(n);
 * System.out.println("Factorial of "+n+" is "+fact); } public static int
 * factorial(int n) { int i=1; int fact=1; while(i<=n) { fact*=i; i++; } return
 * fact; }
 * 
 * }
 */

//using recursion

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int fact =factorial(n);
		System.out.println("Factorial of "+n+" is "+fact);
	}
	public static int factorial(int n) {
		if(n<1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
