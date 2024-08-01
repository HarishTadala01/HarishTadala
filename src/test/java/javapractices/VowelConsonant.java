package javapractices;

public class VowelConsonant {

	public static void main(String[] args) {
		// Checking for Vowels
		char ch = 'y';

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			System.out.println("Given letter is vowel : "+ch);
		else
			System.out.println("Given letter is consonant : "+ch);

		// Checking for Consonant
		char ch1 = 'i';

		if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u' )
			System.out.println("Given letter is consonant : "+ch1);
		else
			System.out.println("Given letter is vowel : "+ch1);

	}

}
