package co.kishore.day5.Strings;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		int i = 0;
		int j = str.length() - 1;
		boolean b = true;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				b = false;

			}

			i++;
			j--;
		}

		if (b == false) {
			System.out.println("not a palindrome ");
		} 
		else 
			System.out.println("palindrome");
		}

	}


