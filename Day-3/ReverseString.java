/*
 * //Method 1 public class ReverseString {
 * 
 * public static void main(String[] args) { String original = "Hello";
 * 
 * String reversed = new StringBuilder(original).reverse().toString();
 * 
 * System.out.println("Original: " + original); System.out.println("Reversed: "
 * + reversed);
 * 
 * }
 * 
 * }
 */
//Method 1
public class ReverseString {

	public static void main(String[] args) {
		String original = "Raja";
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed: " + reversed);

	}

}