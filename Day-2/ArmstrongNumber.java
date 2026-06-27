import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbe:");
		int n = sc.nextInt();
		armstrongNumber(n);
		sc.close();
	}
	public static void armstrongNumber(int n) {
		int temp = n,sum=0;
		while(temp!=0) {
			int num = temp%10;
			sum+=num*num*num;
			temp/=10;
		}
		System.out.println(sum==n?"AmstrongNumber":"Not a AmstrongNumber");
	}
}
