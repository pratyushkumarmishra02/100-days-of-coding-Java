import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		checkPalindrome(n);
		sc.close();
	}
	public static void checkPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp/=10;
		}
		System.out.println(n==rev?"Palindrome":"Not a Palindrome");
	}

}
