import java.util.Scanner;

public class LCMOf2Numbers {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		//LCM(a,b) * GCD(a,b) = a * b;
		int lcm = (a * b)/GCD(a,b);
		System.out.println(lcm);
		
		}
	
	public static int GCD(int a, int b) {
		int min = Math.min(a, b);
		int GCD=0;
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				GCD=i;
				break;
			}
		}
		return GCD;
	}

}
