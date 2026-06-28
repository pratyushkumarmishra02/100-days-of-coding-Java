/*
 * public class ReverseASentence {
 * 
 * public static void main(String[] args) { String sentence = "I love coding";
 * 
 * String[] words = sentence.split(" "); String reversed = "";
 * 
 * for (int i = words.length - 1; i >= 0; i--) { reversed += words[i];
 * 
 * if (i > 0) { reversed += " "; } }
 * 
 * System.out.println("Original: " + sentence); 
 * System.out.println("Reversed: " + reversed);
 * 
 * }
 * 
 * }
 */

//Reverse Letters AND Words of a sentence
public class ReverseASentence {

	public static void main(String[] args) {
		String sentence = "I love coding";
        
        String completeReverse = new StringBuilder(sentence).reverse().toString();
        
        System.out.println("Completely Reversed: " + completeReverse);

	}

}