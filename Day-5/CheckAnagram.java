import java.util.*;
public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String:");
		String s1 = sc.next();
		String s2 = sc.next();
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a,b)?"Anagram":"Not Anagram");
		sc.close();
	}

}
