import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int i=2;
		int count=1;
		while(i<=n) {
			if(n%i==0) {
				count++;
				
			}
			i++;
		}
		if(count==2) {
			System.out.println(n+" is a prime.");
		}else {
			System.out.println(n+" is not a prime.");
		}
	}

}
