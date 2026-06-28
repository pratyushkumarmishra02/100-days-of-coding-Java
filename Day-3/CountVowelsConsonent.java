import java.util.Scanner;

public class CountVowelsConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = sc.nextLine().toLowerCase();
		countVowelsConsonent(s);
		sc.close();
	}
	public static void countVowelsConsonent(String s) {
		int vowels = 0,consonents=0;
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch)!=-1) {
					vowels++;
				}else {
					consonents++;
				}
			}
		}
		System.out.println("Total number of voewls is:"+vowels);
		System.out.println("Total number of consonents is:"+consonents);
	}
}
