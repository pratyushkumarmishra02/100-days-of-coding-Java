/*
 * 
 * import java.util.Scanner;
 * 
 * public class CheckPrime {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc = new Scanner(System.in); System.out.println("Enter a number:");
 * int n = sc.nextInt(); int i=2; int count=1; while(i<=n) { if(n%i==0) {
 * count++;
 * 
 * } i++; } if(count==2) { System.out.println(n+" is a prime."); }else {
 * System.out.println(n+" is not a prime."); } }
 * 
 * }
 */

//Optimized approach
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sc.close();
		if (n <= 1) {
            System.out.println(n + " is not a prime.");
            return;
        }
		int i=2;
		boolean isPrime=true;
		while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println(n+" is a prime.");
		}else {
			System.out.println(n+" is not a prime.");
		}
	}

}
