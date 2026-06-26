import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		fibonacci(n);
	}
	public static void fibonacci(int n) {
		int a=0,b=1;
		int c=0;
		int count =2;
		System.out.print("Fibonacci Series upto is 0,1,");
		for(int i=2;i<n;i++) {
			count++;
			a=b;
			b=c;
			c=a+b;
			if(count!=n) {
				System.out.print(c+",");
			}else {
				System.out.print(c);
			}
		}
	}

}
