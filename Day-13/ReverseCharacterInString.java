public class ReverseCharacterInString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		int l=0,r=s.length-1;
		while(l<r) {
			char temp=s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		System.out.println(s);
	}
}
