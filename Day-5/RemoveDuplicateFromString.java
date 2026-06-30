import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String newStr = "";
		for(char ch:s.toCharArray()) {
			if(newStr.indexOf(ch)==-1) {
				newStr+=ch;
			}
		}
		System.out.println(newStr);
		sc.close();

	}

}
