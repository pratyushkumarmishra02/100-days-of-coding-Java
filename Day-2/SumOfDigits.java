import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sumOfDigits(n);
		sc.close();
	}
	public static void sumOfDigits(int n) {
		int sum=0;
		int temp=n;
		while(temp!=0) {
			int num = temp%10;
			sum+=num;
			temp/=10;
		}
		System.out.println("Sum of digits of "+n+" is "+sum);
	}

}