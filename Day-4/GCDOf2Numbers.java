import java.util.*;
public class GCDOf2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		while(b != 0){
		int temp = b;
		b = a % b;
		a = temp;
		}
		System.out.println(a);
	}

}

//Another process
public class GCDOf2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int min = Math.min(a, b);
		int GCD=0;
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				GCD=i;
				break;
			}
		}
		System.out.println(GCD);
	}

}
